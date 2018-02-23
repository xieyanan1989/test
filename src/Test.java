import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xunsi.dao.DatabaseConnection;
import com.xunsi.util.GeoHash;


public class Test {

	public static void main(String[] args) {
		while(true){
			List<Map> list= getpro();
			if(list.size() == 0){
				try {
					System.out.println("数据更新完毕");
					Thread.sleep(10000000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			setGeoHash(list);
			batchupdate(list);
		}
	}

	private static void setGeoHash(List<Map> list) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < list.size() ; i ++){
			Map map = list.get(i);
			if(map.get("longitude") == "" || map.get("longitude").equals("")){
				System.out.println(map.get("cityId"));
				continue;
			}else{
				GeoHash g = new GeoHash(Double.parseDouble((String) map.get("latitude")), Double.parseDouble((String)map.get("longitude")));  
		        System.out.println(map.get("cityId")+","+g.getGeoHashBase32());  
		        map.put("geoHash",g.getGeoHashBase32());
			}
		}
	}

	private static void batchupdate(List<Map> list) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DatabaseConnection.getInstance().getConnection();
			conn.setAutoCommit(false);
			String sql = "UPDATE BA_CITY_COOR SET GEO_HASH=? WHERE CITY_ID = ?";
			ps = conn.prepareStatement(sql);
			for(int i = 0 ; i < list.size() ; i ++){
				ps.setString(1, (String) list.get(i).get("geoHash"));
				ps.setString(2, (String) list.get(i).get("cityId"));
				ps.addBatch();
			}
			ps.executeBatch();
			conn.commit(); 
		    ps.clearBatch(); 
		} catch (Exception e) {
			e.printStackTrace();
			if (ps != null) try { ps.close(); } catch (Exception localException1) {} 
			if (conn != null) try { conn.close();}catch (Exception localException2){}
		}finally{
			if (ps != null) try { ps.close(); } catch (Exception localException3) {} 
			if (conn != null) try { conn.close();} catch (Exception localException4) {} 
		}
	}

	private static List<Map> getpro() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		List<Map> list = new ArrayList<Map>();
		try {
			conn = DatabaseConnection.getInstance().getConnection();;
			String sql = "SELECT CITY_ID,B_LONGITUDE,B_LATITUDE FROM BA_CITY_COOR WHERE GEO_HASH IS NULL AND B_LONGITUDE IS NOT NULL  AND ROWNUM <=1000";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Map map  = new HashMap();
				map.put("cityId", rs.getString(1));
				map.put("longitude", rs.getString(2));
				map.put("latitude", rs.getString(3));
				list.add(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			if (ps != null) try { ps.close(); } catch (Exception e) { } 
			if (conn != null) try { conn.close(); } catch (Exception e) { } 
		}
		return list;
	}
}

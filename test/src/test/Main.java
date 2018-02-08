package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
//		String reg = "(01)08 09(11)";
//		String[] regs = reg.split("\n");
//		System.out.println(regs[0]);
		
//		String str = "r第 17283期              2017年10月17日开奖\r";
//		System.out.println(matc("第\\s*\\d{5}期",str));
//		System.out.println(str.matches(".*第(\\s)*(\\d)+期.*开奖.*"));
//		System.out.println(str.matches(".*倍(\\s)*合计(\\d)+元"));
//		System.out.println(str.matches("(\\d)+-(\\d)+-(\\d)+-(\\d)+(\\s)*(\\d)+(\\s)*.+"));
////		System.out.println(str.replaceAll("\\s", "").matches("[0-9]{10}"));
//////		System.out.println(str.replaceAll("\\n", ""));
////		String area = str.replaceAll("\\s+", "");
////		for(int i=0; i<area.length(); i = i+2){
////			String number = area.substring(i,i+2);
////			if(Integer.valueOf(number)>11 || Integer.valueOf(number)<1){
////				System.out.println("false");
////			}
////		}
//		String zw = "pH竞彩足球胜平负   2x1";
//		System.out.println(zw.matches(".*竞彩足球.*"));
////		String reg = "[^\u4e00-\u9fa5]";
////		zw = zw.replaceAll(reg, "");
//		System.out.println(zw);
//		String chuan[]=zw.split(" ");	//竞彩足球混合过关   2x1   |  获取玩法和 过关方式
//		List<String> chuanlist=new ArrayList<String>(); 
//		for (String string : chuan) {
//			if(!"".equals(string.trim())){
//				chuanlist.add(string);
//			}
//		}
//		String info ="第1场  周日014";
//		String reg = "[^\u4e00-\u9fa5]";
////		String play=chuanlist.get(0).replaceAll(reg, "").substring(4);
////		String match1[]=info.substring(info.indexOf("周")).split(" ");
////		System.out.println(match1[0]);
////		System.out.println(play);
////		zw = "竞彩篮球混合过关   3x1";
////		System.out.println(zw.matches(".*竞彩篮球.*"));
//		
//		
//		
//		String play = "r竞彩足球混合过关";
//		play = play.substring(play.indexOf("竞彩"));
//		play=play.substring(4);
//		System.out.println(play);
		
		int a=231;
		System.out.println("a 非的结果是："+(~a));
		
	}
	/**
	 * 规则验证
	 * @param reg 正则表达式
	 * @param data 数据
	 * @return
	 */
	private static boolean matc(String reg, String data){
		boolean ma = false;
		try {
			Pattern p = Pattern.compile(reg); 
			ma = p.matches(reg, data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ma;
	}
}


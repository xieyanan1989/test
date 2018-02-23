package com.xunsi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.xunsi.service.AllService;
import com.xunsi.util.Constants;
import com.xunsi.util.JsonUtils;
import com.xunsi.util.MD5Tools;

public class ProCreateServlet extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Logger log=Logger.getLogger(getClass());
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String sig = request.getParameter("sig");
		String json = request.getParameter("json");
		log.debug("RealnameServlet sig="+sig+" json="+json);
		boolean valid = MD5Tools.valid(json, sig);
		if(valid == false){
			out.println("{\"msg\":"+Constants.RESPONSE_SIGNERROR+"}");
			out.close();
			return;
		}
		JSONObject jsonObject = null;
		try {
			jsonObject = new JSONObject(json);
			String username=jsonObject.getString("username");
			String cateid= jsonObject.getString("cateid");
			int saletype= jsonObject.getInt("saletype");
			String saledetail= jsonObject.getString("saledetail");
			String saletitle= jsonObject.getString("saletitle");
			String imgurl= jsonObject.getString("imgurl");
			int salecount= jsonObject.getInt("salecount");
			String salemea= jsonObject.getString("salemea");
			int salesingle= jsonObject.getInt("salesingle");
			int send_ornot= jsonObject.getInt("send_ornot");
			int catetype= jsonObject.getInt("catetype");
			String book_time= jsonObject.getString("book_time");
			String pro_price= jsonObject.getString("pro_price");
			AllService service = new AllService();
			Map map = service.addProInfo(username,cateid,saletype,saledetail
					,saletitle,imgurl,salecount,salemea,salesingle,send_ornot,book_time,pro_price,catetype);
			JsonUtils.AjaxJson(map, response);
		}catch (Exception e) {
			e.printStackTrace();
			out.println("{\"msg\":"+Constants.RESPONSE_FAIL+"}");
		}finally{
			out.flush();
			out.close();
		}
		
	}

	
}


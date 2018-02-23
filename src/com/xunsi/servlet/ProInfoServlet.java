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

public class ProInfoServlet extends HttpServlet {
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
		log.debug("ProInfoServlet sig="+sig+" json="+json);
		boolean valid = MD5Tools.valid(json, sig);
		if(valid == false){
			out.println("{\"msg\":"+Constants.RESPONSE_SIGNERROR+"}");
			out.close();
			return;
		}
		JSONObject jsonObject = null;
		try {
			jsonObject = new JSONObject(json);
			String viewtype= jsonObject.getString("viewtype");
			String cateid= jsonObject.getString("cateid");
			String provinceId= jsonObject.getString("provinceId");
			String cityId= jsonObject.getString("cityId");
			String districtId= jsonObject.getString("districtId");
			String townId= jsonObject.getString("townId");
			String countryId= jsonObject.getString("countryId");
			String saletype= jsonObject.getString("saletype");
			String catetype= jsonObject.getString("catetype");
			AllService service = new AllService();
			Map map = service.getProducts(viewtype,cateid,provinceId,cityId,districtId,townId,countryId,saletype,catetype);
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
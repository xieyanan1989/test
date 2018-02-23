package com.xunsi.util;

import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONObject;

public class JsonUtils {
	protected static Logger log=Logger.getLogger(JsonUtils.class);
	public static void AjaxJson(String json, HttpServletResponse response) throws Exception {
		response.setContentType("application/json;charset=UTF-8"); 
		response.setCharacterEncoding("UTF-8");
		response.addHeader("Access-Control-Allow-Origin","*");
		PrintWriter pw = response.getWriter();
		log.debug("return="+json);
		pw.println(json);
		pw.flush();
	}
	
	public static void AjaxJson(Map<?, ?> map, HttpServletResponse response) throws Exception {
		JSONObject json = new JSONObject(map);
		AjaxJson(json.toString(),response);
	}
	
}

package com.xunsi.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import com.xunsi.util.JsonUtils;
import com.xunsi.util.UTIL;
import com.xunsi.util.UploadUtil;


public class UploadServlet  extends HttpServlet{
	protected Logger log=Logger.getLogger(getClass());

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		try {
		request.setCharacterEncoding("UTF-8");
		log.debug("UploadServlet request:"+request.toString());
		Map<String,String> map = UploadUtil.upload(request, response, UTIL.temporary);
		JsonUtils.AjaxJson(map, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.debug("GetCates error:"+e);
		}
	}
}
package com.xunsi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
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


//实名认证
public class RealnameServlet extends HttpServlet {


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
			String nickname= jsonObject.getString("nickname");
			String realname= jsonObject.getString("realname");
			String identity= jsonObject.getString("identity");
			String qq= jsonObject.getString("qq");
			String wechat= jsonObject.getString("wechat");
			String paywd= jsonObject.getString("paywd");
			AllService service = new AllService();
			Map map = service.addUserInfo(username,nickname,realname,identity,qq,wechat,paywd);
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

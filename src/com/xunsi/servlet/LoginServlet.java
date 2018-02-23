package com.xunsi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.xunsi.service.AllService;
import com.xunsi.util.Constants;
import com.xunsi.util.JsonUtils;
import com.xunsi.util.MD5Tools;

public class LoginServlet extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Logger log=Logger.getLogger(getClass());

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/json");
		PrintWriter out = response.getWriter();
		//		String json = StringTool.readJSONString(request);
		String sig = request.getParameter("sig");
		String json = request.getParameter("json");
		log.debug("LoginServlet sig="+sig+" json="+json);
		boolean valid = MD5Tools.valid(json, sig);
		if(valid == false){
			out.println("{\"msg\":"+Constants.RESPONSE_SIGNERROR+"}");
			out.close();
			return;
		}
		JSONObject jsonObject = null;
		try {
			jsonObject = new JSONObject(json);
			String userName=jsonObject.getString("username");
			String passWord= jsonObject.getString("password");
			AllService service = new AllService();
			Map map = service.loginService(userName, passWord);
			if(map == null){
				out.println("{\"msg\":"+Constants.RESPONSE_USERERROR+"}");
			}else{
//				HttpSession session = request.getSession();
//				String sessionId = session.getId();
//				Map mapv = (Map) session.getAttribute("userId");
//				if( (mapv == null) || (mapv.get("userName") == null)){
//					log.debug("bind session:"+(String) map.get("userId"));
//					session.setAttribute((String) map.get("userId"), sessionId);
//				}
//				if(sessionId == null || sessionId == ""){
//					log.debug("sessionId:"+sessionId);
//					System.out.println("login sessionId:"+sessionId);
//					log.debug("login sessionId:"+sessionId+",userId:"+(String) map.get("userId"));
//					session.setAttribute((String) map.get("userId"), sessionId);
//					Constants.judjeSession().put((String) map.get("userId"), sessionId);
//				}
				map.put("msg", 0);
				JsonUtils.AjaxJson(map, response);
			}
		}catch (Exception e) {
			out.println("{\"msg\":"+Constants.RESPONSE_FAIL+"}");
			e.printStackTrace();
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/json");
		}finally{
			out.flush();
			out.close();
		}

	}



}
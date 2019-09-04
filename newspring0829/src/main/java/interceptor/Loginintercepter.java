package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.cglib.transform.impl.InterceptFieldEnabled;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Loginintercepter implements HandlerInterceptor{

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2) throws Exception {
		System.out.println(req.getRequestURI());
		
		if(req.getRequestURI().equals("/newspring0829/user/login")) {
			return true;
		}else {
			Object u=req.getSession().getAttribute("user");
			if(u!=null) {
				return true;
			}else {
				resp.sendRedirect("login.html");
			}
			return false;
		}
		
	}

}

package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.User;
import service.UserService;


@Controller
@RequestMapping("user")
public class UserController {
@Autowired
UserService userservice;
@RequestMapping("login")
public String login(User u,HttpSession s) {
	User user=userservice.select(u);
	if(user!=null) {
		s.setMaxInactiveInterval(10);
		s.setAttribute("user", user);
		System.out.println(user.getname()+user.getpass());
		return "redirect:/index1.jsp";
	}else {
		System.out.println("´íÎó");
		return "redirect:/login.html";
	}
}
@RequestMapping("outlogin")
public String outlogin(HttpSession s) {
	s.removeAttribute("user");
	return "redirect:/login.html";
	}
}

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.StudentDao;
import service.StudentService;
import service.Impl.StudentSerciceImpl;

@Controller
public class MyController {
	@Autowired 
	StudentService studentService;
	@RequestMapping("select")
	public String select(ModelMap m, String txt) {
		System.out.println(txt);
		System.out.println("hello");
		if(txt==null) {
			  txt=" ";
		  }else {
			  txt=" where student.name like '%"+txt+"%'";
		  }
		m.put("list", studentService.select(txt));
		System.out.println("MyController.select()-->"+txt);
		return "index";
	}
}

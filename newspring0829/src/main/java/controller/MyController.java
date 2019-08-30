package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.StudentDao;
import model.Student;
import service.ClassService;
import service.StudentService;
import service.Impl.StudentSerciceImpl;

@Controller
public class MyController {
	@Autowired 
	StudentService studentService;
	@Autowired
	ClassService classService;
	@RequestMapping("select")
	public String select(ModelMap m, String txt) {
		if(txt==null) {
			  txt=" ";
		  }else {
			  txt=" where student.name like '%"+txt+"%'";
		  }
		m.put("list", studentService.select(txt));
		return "index";
	}
	@RequestMapping("delete")
	public String delete(ModelMap m,int id) {
		studentService.delete(id);
		return select(m, null);
	} 
	@RequestMapping("insert")
	public String insert(ModelMap m,Student s) {
		studentService.insert(s);
		return select(m, null);
	} 
	@RequestMapping("update")
	public String update(ModelMap m,Student s) {
		studentService.update(s);
		return select(m, null);
	} 
	@RequestMapping("edit")
	public String edit(ModelMap m,int id) {
		m.put("info", studentService.selectById(id).get(0));
		m.put("sexs", Student.sexs);
		m.put("myclass", classService.select());
		return "edit";
	} 
	@RequestMapping("add")
	public String add(ModelMap m) {
		m.put("sexs", Student.sexs);
		m.put("myclass", classService.select());
		return "edit";
	} 
	
}

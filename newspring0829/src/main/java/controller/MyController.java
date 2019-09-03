package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.StudentDao;
import model.Student;
import service.ClassService;
import service.StudentService;
import service.Impl.StudentSerciceImpl;
import utils.ReturnInfo;

@Controller
@RequestMapping("student")
public class MyController {
	@Autowired 
	StudentService studentService;
	@Autowired
	ClassService classService;
	
	@RequestMapping("index")
	public @ResponseBody ReturnInfo select(String txt,Integer page,Integer limit) {
		if(txt==null) {
			  txt=" ";
		  }else {
			  txt=" where student.name like '%"+txt+"%'";
		  }
		  ReturnInfo info=new ReturnInfo();
		  info.setCount(studentService.selectCount(txt));
		  info.setList(studentService.select(txt,info.getLimit(page, limit)));
		  return info;
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id) {
		studentService.delete(id);
		return "{\"status\":1}";
	} 
	@RequestMapping("insert")
	public @ResponseBody String insert(Student s) {
		studentService.insert(s);
		return "{\"status\":1}";
	} 
	@RequestMapping("update")
	public @ResponseBody String update(Student s) {
		studentService.update(s);
		return "{\"status\":1}";
	} 
	@RequestMapping("edit")
	public @ResponseBody Student edit(int id) {
		Student stu= studentService.selectById(id).get(0);
		return stu;
	} 
	/*@RequestMapping("add")
	public String add(ModelMap m) {
		m.put("sexs", Student.sexs);
		m.put("myclass", classService.select());
		return "edit";
	} */
	@RequestMapping("sexs")
	public @ResponseBody String[] sexs() {
		return Student.sexs;
	} 
}

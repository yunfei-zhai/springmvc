package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.MyClass;
import service.ClassService;

@Controller
@RequestMapping("myclass")
public class ClassController {
@Autowired
ClassService classService;
	
@RequestMapping("index")
public @ResponseBody List<MyClass> select() {
		return classService.select();
}
}

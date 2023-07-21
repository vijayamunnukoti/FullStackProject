package com.example.demo.Implement;

import java.util.List;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Interface.StudentInterface;
import com.example.demo.Services.Services;
import com.example.demo.student.Student;
@RestController
public class StudentImplement{
	@Autowired
     private Services  sti;
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student st) {
		return sti.save(st);
		
	}
	
	@GetMapping("/add")
	public List<Student> displayAllProducts(){
		return sti.findAll();

	}
}

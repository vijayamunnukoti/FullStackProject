package com.example.demo.Save;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Interface.StudentInterface;
import com.example.demo.Services.Services;
import com.example.demo.student.Student;

@Service
public class Save implements Services {
	@Autowired
	private StudentInterface StudentImplement;
@Override
public List<Student> findAll(){
		return StudentImplement.findAll();
		
		
	}
@Override
public Student save(Student st) {
	return StudentImplement.save(st);
}
}

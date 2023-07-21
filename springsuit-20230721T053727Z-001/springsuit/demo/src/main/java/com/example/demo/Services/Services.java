package com.example.demo.Services;

import java.util.List;



import com.example.demo.student.Student;

public interface Services {
List<Student> findAll();
Student save(Student st);
}

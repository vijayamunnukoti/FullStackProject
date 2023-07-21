package com.example.demo.Interface;
//repository class
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.Implement.StudentImplement;
import com.example.demo.student.Student;

public interface StudentInterface extends JpaRepository<Student, Long>  {
	

}

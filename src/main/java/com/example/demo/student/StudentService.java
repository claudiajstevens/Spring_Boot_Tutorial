package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

//this will act as our service layer

//could also use "@Component" but using "@Service" helps with readability
@Service
public class StudentService {
    public List<Student> getStudents(){
		return List.of(
					new Student(
						1L,
						"Mariam",
						"Mariam.jamal@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						21
					)
		);
	}
}

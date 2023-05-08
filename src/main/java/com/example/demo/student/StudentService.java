package com.example.demo.student;
//import StudentRepository;

// import java.time.LocalDate;
// import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//this will act as our service layer

//could also use "@Component" but using "@Service" helps with readability
@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}

    public List<Student> getStudents(){
		return studentRepository.findAll();
	}
}


// new Student(
// 	1L,
// 	"Mariam",
// 	"Mariam.jamal@gmail.com",
// 	LocalDate.of(2000, Month.JANUARY, 5),
// 	21
// )
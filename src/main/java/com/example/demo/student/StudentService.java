package com.example.demo.student;
//import StudentRepository;

// import java.time.LocalDate;
// import java.time.Month;
import java.util.List;
import java.util.Optional;

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

    public void addNewStudent(Student student) {
		Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());

		//this will check is email is availible
		//you could also do email validation if you wanted
		if(studentOptional.isPresent()){
			throw new IllegalStateException("email taken");
		}
		studentRepository.save(student);

		//System.out.println(student);
    }
}


// new Student(
// 	1L,
// 	"Mariam",
// 	"Mariam.jamal@gmail.com",
// 	LocalDate.of(2000, Month.JANUARY, 5),
// 	21
// )
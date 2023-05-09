package com.example.demo.student;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



//our type is Student and the id is type long 
//this  interface is for data access - the Data Access Layer
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
    //this will trasform into SQL such as:
    @Query("SELECT s FROM Student s WHERE s.email = ?1")  //this is jbql and not sql
    Optional<Student> findStudentByEmail(String email);

}
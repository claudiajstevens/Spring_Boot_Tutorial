package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



//our type is Student and the id is type long 
//this  interface is for data access - the Data Access Layer
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}

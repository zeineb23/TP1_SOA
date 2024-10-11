package org.example.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.models.Student;

import java.util.List;

@WebService
public interface StudentService {
    @WebMethod
    Student getStudentById(@WebParam(name = "id") Integer id);

    @WebMethod
    String getNameStudentById(@WebParam(name = "id") Integer
                                      id);

    @WebMethod
    String getStudentUniversityById(@WebParam(name = "id")
                                    Integer id);

    @WebMethod
    List<Student> getAllStudents();

    @WebMethod
    String addStudent(@WebParam(name = "student") Student student);
}
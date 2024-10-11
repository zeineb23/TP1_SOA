package org.example.services;

import jakarta.jws.WebService;
import org.example.models.Student;
import org.example.models.University;

import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "studentsManagement",
        endpointInterface = "org.example.services.StudentService")
public class StudentServiceImpl implements StudentService {
    public static List<Student> students;

    public StudentServiceImpl() {
        students = new ArrayList<>();
        // Initialization of Universities
        University university1 = new University(1, "ISI");
        University university2 = new University(2, "INSAT");

        // Initialization of Students
        students.add(new Student(1, "Mohamed Amine Guesmi", "amine@gmail.com", university1));
        students.add(new Student(2, "Foulen Ben Foulen", "foulen@gmail.com", university1));
        students.add(new Student(3, "Tounsi Almami", "almami@gmail.com", university2));
    }

    // Implementing the methods from the interface
    @Override
    public Student getStudentById(Integer id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public String getNameStudentById(Integer id) {
        Student student = getStudentById(id);
        return (student != null) ? student.getName() : null;
    }

    @Override
    public String getStudentUniversityById(Integer id) {
        Student student = getStudentById(id);
        return (student != null) ? student.getUniverty().getName() : null;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public String addStudent(Student student) {
        students.add(student);
        return "Student added successfully!";
    }


}
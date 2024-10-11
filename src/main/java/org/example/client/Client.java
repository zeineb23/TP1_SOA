package org.example.client;

import jakarta.xml.ws.Service;
import org.example.models.Student;
import org.example.services.StudentService;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
            // Définir l'URL du WSDL
            URL wsdlURL = new URL("http://localhost:8080/student-managament?wsdl");

            // Définir le QName avec le namespace et le nom du service
            QName qname = new QName("http://services.example.org/", "studentsManagement");

            // Créer un service en utilisant le WSDL et le QName
            Service service = Service.create(wsdlURL, qname);

            // Obtenir un proxy pour le service StudentService
            StudentService proxy = service.getPort(StudentService.class);

            // Appeler la méthode pour obtenir le nom de l'étudiant par ID
            System.out.println("\nObtenir le nom de l'étudiant avec l'ID 1");
            String studentName = proxy.getNameStudentById(1);
            System.out.println("Nom de l'étudiant: " + studentName);
            System.out.println("L'etudiant complet : "+proxy.getStudentById(1));
            System.out.println("L'university du student : "+proxy.getStudentUniversityById(1));

            List<Student> allStudents = proxy.getAllStudents();
            if (allStudents != null && !allStudents.isEmpty()) {
                for (Student student : allStudents) {
                    System.out.println(student); // This will call student.toString() for each student
                }
            } else {
                System.out.println("Aucun étudiant trouvé.");
            }


    }
}

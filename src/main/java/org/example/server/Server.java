package org.example.server;

import jakarta.xml.ws.Endpoint;
import org.example.services.StudentServiceImpl;

public class Server {
    public static void main(String[] args) {
        String url =
                "http://localhost:8080/student-managament";
        Endpoint.publish(url, new StudentServiceImpl());
        System.out.println(url + " deployed ! ");
    }
}

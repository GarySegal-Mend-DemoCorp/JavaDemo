package org.owasp.webgoat.lessons.sqlinjection;

import org.owasp.webgoat.container.lessons.Category;
import org.owasp.webgoat.container.lessons.Lesson;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.owasp.webgoat.container.LessonDataSource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class DatabaseConnector {
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "P@ssw0rd123"; // Hardcoded credential
    private static final String DB_URL = "jdbc:mysql://localhost:3306/myapp";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

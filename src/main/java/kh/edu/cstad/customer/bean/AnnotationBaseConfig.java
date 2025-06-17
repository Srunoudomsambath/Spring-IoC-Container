package kh.edu.cstad.customer.bean;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Component  //making bean or object
//@Service
//@Repository
public class AnnotationBaseConfig {
    public Student getStudent() {
        Student student = new Student();
        student.setUuid(UUID.randomUUID().toString());
        student.setFullName("Srun Oudomsambath");
        student.setScore(12.10);
        return student;
    }
}

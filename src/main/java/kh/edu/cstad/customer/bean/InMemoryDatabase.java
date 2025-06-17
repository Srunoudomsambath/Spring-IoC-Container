package kh.edu.cstad.customer.bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Configuration
public class InMemoryDatabase {
    private List<Student> students;


    public void insert(Student student) {
        students.add(student);
    }
    @Bean
    public List<Student> getStudents() {
        students = new ArrayList<>();

        Student st1 = new Student();
        st1.setUuid(UUID.randomUUID().toString());
        st1.setFullName("Sambath");
        st1.setScore(80.00);

        Student st2 = new Student();
        st2.setUuid(UUID.randomUUID().toString());
        st2.setFullName("Sam");
        st2.setScore(90.00);
        return students;

    }
}

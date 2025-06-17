package kh.edu.cstad.customer.bean;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor //make constructor which is final field auto inject
public class BeanController {

    // Declare Dependency
    private final List<Student> students;
    private final InMemoryDatabase inMemoryDatabase;

    @GetMapping("/new")
    public void addStudent(){
        Student students = new Student();
        students.setUuid(UUID.randomUUID().toString());
        students.setFullName("User : " + students.getUuid());
        students.setScore(100.00);
        inMemoryDatabase.insert(students);
    }


    @GetMapping("api/student")
    public List<Student> getStudents() {
        return students;
    }
}

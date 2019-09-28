package t1708m.hellospring.service;

import org.springframework.data.domain.Page;
import t1708m.hellospring.entity.Student;

public interface StudentService {
    Page<Student> getList(int page, int limit);

    Student findByEmail(String email);

    Student login(String email, String password);

    Student register(Student student);

    Student update(String email, Student student);

    Student findById(int studentId);
}

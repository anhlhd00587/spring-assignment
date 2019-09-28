package t1708m.hellospring.reponsitory;



import org.springframework.data.jpa.repository.JpaRepository;
import t1708m.hellospring.entity.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Optional<Student> findByEmail(String email);
}

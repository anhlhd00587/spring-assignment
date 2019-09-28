package t1708m.hellospring.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import t1708m.hellospring.entity.AptechClass;

public interface AptechClassRepository extends JpaRepository<AptechClass,Integer> {
}

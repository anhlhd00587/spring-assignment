package t1708m.hellospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import t1708m.hellospring.entity.AptechClass;
import t1708m.hellospring.reponsitory.AptechClassRepository;

public class AptechClassService {
    @Autowired
    AptechClassRepository aptechClassRepository;
    public Page<AptechClass> getList(int page, int limit) {
        return aptechClassRepository.findAll(PageRequest.of(page - 1, limit));
    }

    public AptechClass getDetail(int id) {
        return aptechClassRepository.findById(id).orElse(null);
    }

    public AptechClass save(AptechClass aptechClass){
        return aptechClassRepository.save(aptechClass);
    }
}

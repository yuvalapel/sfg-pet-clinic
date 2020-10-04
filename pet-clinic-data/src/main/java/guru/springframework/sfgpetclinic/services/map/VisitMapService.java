package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.CrudService;
import guru.springframework.sfgpetclinic.services.VisitService;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return null;
    }

    @Override
    public Visit findById(Long id) {
        return null;
    }

    @Override
    public Visit save(Visit object) {
        return null;
    }

    @Override
    public void delete(Visit object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}

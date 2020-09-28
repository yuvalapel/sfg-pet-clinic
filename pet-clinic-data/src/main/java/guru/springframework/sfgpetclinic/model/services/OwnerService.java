package guru.springframework.sfgpetclinic.model.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<OwnerService, Long> {

    Owner findByLastName(String lastName);

}

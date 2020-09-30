package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.services.OwnerService;
import guru.springframework.sfgpetclinic.model.services.VetService;
import guru.springframework.sfgpetclinic.model.services.map.OwnerMapService;
import guru.springframework.sfgpetclinic.model.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {



    }
}

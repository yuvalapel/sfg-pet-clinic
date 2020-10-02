package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Visit  extends BaseEntity {

    private LocalDate date;
    private String descriptaion;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescriptaion() {
        return descriptaion;
    }

    public void setDescriptaion(String descriptaion) {
        this.descriptaion = descriptaion;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

package main.java.entities;
import java.time.LocalDate;

/**
 * Created by Daniel on 11/21/16.
 */
public class Pet {
    public static enum PetType { DOG, CAT, FISH, BIRD };

    private Long petId;
    private String name;
    private LocalDate dob;
    private PetType petType;
    private Long ownerId;

    public Pet(Long petId, String name, LocalDate dob, PetType petType, Long ownerId) {
        this.petId = petId;
        this.name = name;
        this.dob = dob;
        this.petType = petType;
        this.ownerId = ownerId;
    }

    public Pet() {
    }

    public Long getPetId() {
        return petId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public PetType getPetType() {
        return petType;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}

package main.java.entities;
import java.time.LocalDate;

/**
 * Created by Daniel on 11/21/16.
 */
public class Appointment {

    public static enum AptType { GROOM, CHECKUP, SURGERY };

    private Long appointmentId;
    private LocalDate aptDate;
    private AptType aptType;
    private Long ownerId;
    private Long petId;

    public Appointment(Long appointmentId, LocalDate aptDate, AptType aptType, Long ownerId, Long petId) {
        this.appointmentId = appointmentId;
        this.aptDate = aptDate;
        this.aptType = aptType;
        this.ownerId = ownerId;
        this.petId = petId;
    }

    public Appointment() {
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public LocalDate getAptDate() {
        return aptDate;
    }

    public AptType getAptType() {
        return aptType;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public Long getPetId() {
        return petId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setAptDate(LocalDate aptDate) {
        this.aptDate = aptDate;
    }

    public void setAptType(AptType aptType) {
        this.aptType = aptType;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }
}

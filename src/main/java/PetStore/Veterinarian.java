package PetStore;

import java.util.List;

public class Veterinarian extends User {
    private List<Appointments> appointmentsList;

    public Veterinarian(String email, String password, String name, String dni, List<Appointments> appointmentsList) {
        super(email, password, name, dni);
        this.appointmentsList = appointmentsList;
    }

    public List<Appointments> getAppointmentsList() {
        return appointmentsList;
    }

    public void setAppointmentsList(List<Appointments> appointmentsList) {
        this.appointmentsList = appointmentsList;
    }
}

package lesson7.homework2;

public class Patient {
    private String name;
    private String doctor;
    private Treatment treatment;

    public Patient(String name) {
        this.name = name;
        this.treatment = new Treatment();
    }

    public void start() {
        if (treatment.getCode() == 1) {
            doctor = "SURGEON";
            Doctor myDoctor = new Surgeon();
            myDoctor.healing();
        } else if (treatment.getCode() == 2) {
            doctor = "DENTIST";
            Doctor myDoctor = new Dentist();
            myDoctor.healing();
        } else {
            doctor = "THERAPIST";
            Doctor myDoctor = new Therapist();
            myDoctor.healing();
        }
    }

    public void getInfo() {
        System.out.println("Patient's name : " + name + "\nDoctor : " + doctor + "\nTreatment Plan: " + treatment.getCode());
    }
}


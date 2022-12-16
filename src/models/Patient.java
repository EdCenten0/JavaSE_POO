package models;

public class Patient extends User {

    private String Birthday;
    private Double weight;
    private Double height;
    private String blood;

    public Patient() {
        super();
    }

    public Patient(String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getWeight() {
        return this.weight + "Kg";
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + this.getBirthday() + "\nWeight: " + this.getWeight()
                + "\nHeight: " + this.getHeight() + "\nBlood: " + this.getBlood();
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }
}

public class Patient {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String Birthday;
    private Double weight;
    private Double height;
    private String blood;

    public Patient() {
    }

    public Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 8){
            System.out.println("El limite de digitos es 8, usted ingreso" + " " + phoneNumber.length());
        }
        else if (phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }

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
}

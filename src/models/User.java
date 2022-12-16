package models;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String  address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        else{
            this.phoneNumber = phoneNumber;
        }
    }


    @Override
    public String toString() {
        return "models.User: " + this.getName() + ", Email: " +this.getEmail() +
                "\nAddress: " + this.getAddress() + ".Phone: " + this.getPhoneNumber();
    }

    public abstract void showDataUser();
}

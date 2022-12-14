import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {


//        showMenu();

        Patient patient = new Patient("Carlos", "cchavarria");
        patient.setWeight(10.9);
        patient.setPhoneNumber("12345678");

        System.out.println(patient.getWeight() + "\n" + patient.getPhoneNumber() );






    }


}

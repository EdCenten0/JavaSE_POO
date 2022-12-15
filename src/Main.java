import java.util.Date;

import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {


//        showMenu();

        Doctor doctor = new Doctor("Carlos", "cchavarria", "Ortopedista");
        System.out.println(doctor);

        Patient carlos = new Patient();
        carlos.setPhoneNumber("57628049");
        carlos.setBlood("O+");
        carlos.setAddress("Jinotega");
        carlos.setWeight(40.0);
        carlos.setEmail("cchavarriacenteno8@gmail.com");
        carlos.setBirthday("30-03-2005");
        carlos.setHeight(1.70);
        System.out.println(carlos);



    }


}

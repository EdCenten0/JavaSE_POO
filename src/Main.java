import models.Doctor;
import models.Patient;
import models.User;

public class Main {
    public static void main(String[] args) {


//        showMenu();

        Doctor doctor = new Doctor();
        System.out.println(doctor);

//        Patient carlos = new Patient();
//        carlos.setPhoneNumber("57628049");
//        carlos.setBlood("O+");
//        carlos.setAddress("Jinotega");
//        carlos.setWeight(40.0);
//        carlos.setEmail("cchavarriacenteno8@gmail.com");
//        carlos.setBirthday("30-03-2005");
//        carlos.setHeight(1.70);
//        System.out.println(carlos);

        User user = new Doctor("Carlos", "cchavarria", "Ortopedista");
        user.showDataUser();

        User userAbs = new User("Carlos", "cchavarriacenteno8@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital Cruz roja");
                System.out.println("Departamento: Geriatria");
            }
        };

        userAbs.showDataUser();





    }


}

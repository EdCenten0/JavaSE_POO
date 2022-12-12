import javax.print.Doc;

import java.util.Scanner;

import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.setName("Juan");
        myDoctor.showName();
        myDoctor.showID();



        Doctor doctorYo = new Doctor();
        doctorYo.showID();

        UiMenu.showMenu();
        System.out.println("Hola");
    }


}

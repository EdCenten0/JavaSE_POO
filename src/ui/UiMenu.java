package ui;

import models.Doctor;
import models.Patient;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class UiMenu {
    public static final String[] MONTHS ={"Enero", "Febrero", "Marzo", "Abril",
                                        "Mayo", "Junio", "Julio", "Agosto",
                                        "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    authUser(2);
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    public static void authUser(int userType){
        //userType = Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Carlos Eduardo", "cchavarriacenteno8@gmail.com"));
        doctors.add(new Doctor("Isabel Denisse", "aguilardenisse@gmail.com"));
        doctors.add(new Doctor("Francisco De Jesus", "chicoymelendez@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Elsner Ortega", "elsnergo@gmail.com"));
        patients.add(new Patient("Alejandro Duran", "duranale@gmail.com"));
        patients.add(new Patient("Katerine Alaniz", "katerinalaniz@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1){
                for(Doctor d: doctors){
                    if (d.getEmail().equals(email));
                    emailCorrect = true;
                    //Obtener el usuario loggeado
                    doctorLogged = d;
                    //showDoctor menu
                }
            }else{
                for(Patient p: patients){
                    if (p.getEmail().equals(email));
                    emailCorrect = true;
                    //Obtener el usuario loggeado
                    patientLogged = p;
                    //showPatient menu
                }
            }

        }while(!emailCorrect);
    }
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("models.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for(int i = 0; i < 3; i++){
                        System.out.println((i + 1) + "." + MONTHS[i]);

                }

                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}

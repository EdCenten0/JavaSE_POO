package models;

import models.User;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;



    public Doctor(String name,String email) {
        super(name, email);



    }

    public Doctor() {

    }




    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    ArrayList<AvaibleAppointment> avaibleAppointments = new ArrayList<>();
    public void addAvaibleAppointent(Date date, String time){
        avaibleAppointments.add(new AvaibleAppointment(date,time));
    }

    public ArrayList<AvaibleAppointment> getAvaibleAppointments(){
        return avaibleAppointments;
    }

    @Override
    public String toString() {
        return super.toString() +"\nmodels.Doctor{" +
                "speciality='" + this.getSpeciality() + '\'' +
                ", avaibleAppointments=" + avaibleAppointments.toString() +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz roja");
        System.out.println("Departamento: Oncologia");
    }

    public static class AvaibleAppointment{
        private int id;
        private Date date;
        private String time;


        public AvaibleAppointment(Date date, String time) {

            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Avaible Appointments \n Date: " +  this.getDate() + "\nTime: " + this.getTime();
        }
    }
}

package org.lili.principles.lod.ex5;

/**
 * Created by lili on 2017/7/8.
 */
public class Patient {

    private Doctor doctor;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void seeDoctor(){
        doctor.seeDoctor();
    }

    public static void main(String[] args) {
        Patient p = new Patient();
        p.setDoctor(new DoctorB());
        p.seeDoctor();
    }
}

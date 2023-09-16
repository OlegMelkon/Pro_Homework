package de.telran.Melkonov.Oleg.hw20230831.krankenhaus;

import java.util.*;

public class Hospital {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Patient patient1 = new Patient("Ivan");
        Patient patient2 = new Patient("Peter");
        Patient patient3 = new Patient("Mikhail");
        Patient patient4 = new Patient("Vasiliy");
        Patient patient5 = new Patient("Vadim");
        Patient patient6 = new Patient("Sergey");
        Patient patient7 = new Patient("Pavel");
        Patient patient8 = new Patient("Slava");
        Patient patient9 = new Patient("Fedor");
        Patient patient10 = new Patient("Aleksandr");
        Patient patient11 = new Patient("Lev");
        Patient patient12 = new Patient("Nikolay");
        Patient patient13 = new Patient("Konstantin");
        Patient patient14 = new Patient("Evgeniy");
        Patient patient15 = new Patient("Roman");
        List<Patient> patientList = Arrays.asList(patient1,patient2,patient3,patient4,patient5,patient6,patient7,patient8,
                patient9,patient10,patient11,patient12,patient13,patient14,patient15);
        Queue<Patient> registry = new LinkedList<>();
        for (int i = 0; i < 15; i++){
            if (i > 9){
                System.out.println(patientList.get(i).getName() + " - запись на прием невозможна!");
            } else{
                registry.add(patientList.get(i));
            }
        }

        for (Patient p : registry) {
            Collections.shuffle(doctor.prescriptions);
            System.out.println(p.getName() + ", Вам назначено лечение: " + doctor.prescriptions.get(0));
        }
    }

}

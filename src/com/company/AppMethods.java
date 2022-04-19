package com.company;

import java.util.Date;

public class AppMethods {
    public void universitySelection(String university){

        if (university.equals("udeg")){
            System.out.println("Welcome to \nUniversidad de Guadalajara");
        } else if (university.equals("itson")){
            System.out.println("Welcome to \nInstituto Tecnologico de Sonora");
        } else if (university.equals("itlm")){
            System.out.println("Welcome to \nInstituto Tecnologico de Los Mochis");
        } else
            System.out.println("Invalid University");
        System.exit(0);
    }

    public void udgRequest(String request, String name, String
                           lastName, Date birthDate, int age, int cellphone,
                           int studentId, String bachelor, String course,
                           int credits){

    }
}

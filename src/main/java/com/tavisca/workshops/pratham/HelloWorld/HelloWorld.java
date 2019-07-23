package com.tavisca.workshops.pratham.HelloWorld;


public class HelloWorld {

    public static void main(String[] args) {
        greeting("Ebran", "male", 18, "India");
    }

    public static void greeting(String name, String gender, int age, String country) {
        String surName = "";
        String greet;

        if (gender == "male")
            if (age < 18)
                surName = "Master";
            else
                surName = "Mr.";
        else if (gender == "female")
            surName = "Miss";

        if (country == "India")
            greet = "Namaste";
        else if (country == "Spain")
            greet = "Hola";
        else
            greet = "Hello";

        System.out.println(greet + " " + surName + " " + name);
    }
}

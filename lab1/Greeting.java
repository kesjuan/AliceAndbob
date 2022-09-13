package io.zipcoder.fundamentals.day2.lab1;


import java.time.LocalDate;
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);

        String aName = "Alice";
        System.out.print("Name: ");
        String name = scanner1.nextLine();
       if (name.matches("Alice")) {
           System.out.println("Greetings " + name + " Today is " + LocalDate.now());
       }
           else if (name.matches("Bob")){
           System.out.println("Greetings " + name + " Today is " + LocalDate.now());
           }
           else{System.out.println("Greetings");}
           // System.out.println(name);




    }
}

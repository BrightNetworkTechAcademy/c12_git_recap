import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the forecast average temperature today?");
        int temperature = reader.nextInt();

//        if (temperature > 15){
//            System.out.println("No coat today!");
//        } else {
//            System.out.println("Better wear my coat.");
//        }

//        conditionToCheck ? outcomeIfTrue : outcomeIfFalse

        String message;

        message = temperature > 15 ? "No coat today!" : "Better wear my coat.";

        System.out.println(message);
    }

}

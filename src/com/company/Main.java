package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

    double BAC;
    double r;
        System.out.print("Enter a 1 if you are male or 2 if you are female: ");
        int choice = scan.nextInt();

        if(choice == 1) {
            r = 0.73;
        }
        else {
            r = 0.66;
        }
        System.out.print("How many ounces of alcohol did you have? ");
        int A = scan.nextInt();
        System.out.print("What is your weight, in pounds? ");
        int W = scan.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        int H = scan.nextInt();

        BAC = A * 5.14 / W * r - 0.015 * H;
        System.out.println("Your BAC is: " +String.format("%.5f", BAC));
        if(BAC <= 0.08) {
            System.out.println("It is legal for you to drive.");
        }
        else {
            System.out.println("It is not legal for you to drive.");
        }
    }
}

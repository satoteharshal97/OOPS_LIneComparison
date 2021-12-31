package com.example.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        getlength();
    }
    static void getlength(){
        Scanner sc = new Scanner(System.in);
        //Taking values of both points from user
        System.out.println("Enter x-cordinate of first point:");
        double x1 = sc.nextDouble();
        System.out.println("Enter y-cordinate of first point:");
        double y1 = sc.nextDouble();
        System.out.println("Enter x-cordinate of second point:");
        double x2 = sc.nextDouble();
        System.out.println("Enter y-cordinate of second point:");
        double y2 = sc.nextDouble();
        sc.close();

        //Calulating length of line
        double lenghtOfline = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2- y1), 2));
        System.out.println("Lenght of line : "+ lenghtOfline);
    }
}

package com.example.linecomparison;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
    afterComparingLines();

    }
    static void afterComparingLines() {
        double X = 0, Y = 0 , X1 = 0, Y1 = 0;
        double lengthOfline1 = getLengthCompletely(X, Y, X1, Y1);
        double lengthOfline2 = getLengthCompletely(X, Y, X1, Y1);

        Double x = lengthOfline1;
        Double y = lengthOfline2;
        compareLines(x, y);
    }

    static void compareLines(Double x, Double y){
        Boolean bool = x.equals(y);
        if(bool) {
            System.out.println("Lines are equal");
        }else {
            System.out.println("Lines are distinct");
        }
    }

    static double getLengthCompletely(double X, double Y, double X1, double Y1){
        Scanner sc = new Scanner(System.in);
        //Taking values of  points from user
        System.out.println("Enter x-cordinate of first point:");
        double x1 = sc.nextDouble();
        System.out.println("Enter y-cordinate of first point:");
        double y1 = sc.nextDouble();
        System.out.println("Enter x-cordinate of second point:");
        double x2 = sc.nextDouble();
        System.out.println("Enter y-cordinate of second point:");
        double y2 = sc.nextDouble();

        //Calulating length of line
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2- y1), 2));
    }

}

package com.example.linecomparison;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
    afterComparingLines();
    }
    static void afterComparingLines() {
        double x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        double px1 = 0, px2 = 0, py1 = 0, py2 = 0;
        getPoints(x1, x2, y1, y2);
        double lenghtOfline1 = getLengthOfLine(x1, x2, y1, y2);
        System.out.println();
        getPoints(px1, px2, py1, py2);
        double lenghtOfLine2 = getLengthOfLine(px1, px2, py1, py2);
        Double x = lenghtOfline1;
        Double y = lenghtOfLine2;
        compareLines(x, y);
    }
    static double getLengthOfLine(double px1, double px2, double py1, double py2){
        return Math.sqrt(Math.pow((px2 - px1), 2) + Math.pow((py2 - py1), 2));
    }
    static void compareLines(Double x, Double y){
        boolean bool = x.equals(y);
        if(bool) {
            System.out.println("Lines are equal");
        }else {
            System.out.println("Lines are distinct");
        }
    }
    static void getPoints(double X, double X1, double Y, double Y1){
        Scanner sc = new Scanner(System.in);
        //Taking values of both points from user
        System.out.println("Enter x-cordinate of first point: ");
        double xa1 = sc.nextDouble();
        System.out.println("Enter y-cordinate of first point: ");
        double ya1 = sc.nextDouble();
        System.out.println("Enter x-cordinate of second point: ");
        double xa2 = sc.nextDouble();
        System.out.println("Enter y-cordinate of second point: ");
        double ya2 = sc.nextDouble();
    }
}

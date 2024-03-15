package pl.asilver.segmentlength.service;

import java.util.Scanner;

public class Service {
    public static double findSegmentLength() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x coordinate for point A:");
        double x1 = scan.nextDouble();
        System.out.println("Enter the y coordinate for point A:");
        double y1 = scan.nextDouble();
        System.out.println("Enter the x coordinate for point B:");
        double x2 = scan.nextDouble();
        System.out.println("Enter the y coordinate for point B:");
        double y2 = scan.nextDouble();
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return length;
    }
}

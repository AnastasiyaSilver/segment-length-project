package pl.asilver.segmentlength.service;

import java.util.Scanner;

public class Service {
    public static double findSegmentLength(int x1, int y1, int x2, int y2) {
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return length;
    }
}

package pl.asilver.segmentlength._main;

import static pl.asilver.segmentlength.service.Service.findSegmentLength;

public class _Main {
    public static void main(String[] args) {
        double segmentLength = findSegmentLength();
        System.out.println("The length of the segment AB is: " + segmentLength + ".");
    }
}

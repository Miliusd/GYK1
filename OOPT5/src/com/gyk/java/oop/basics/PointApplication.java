package com.gyk.java.oop.basics;

public class PointApplication {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(5,5);
        MyPoint point2 = new MyPoint(9,9);
        for (int i = 0; i < point1.getXY().length; i++) {
            System.out.print(point1.getXY()[i]);
        }
        System.out.println(point2);
        System.out.println(point1.distance(8,8));
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance());
    }
}

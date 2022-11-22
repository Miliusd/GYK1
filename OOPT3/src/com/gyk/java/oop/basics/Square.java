package com.gyk.java.oop.basics;

public class Square {
    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Square() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean squareValidation(){
        if (length>0 && width>0){
            return true;
        }
        else
            return false;
    }
    public double calculateArea(){
        return this.width*this.length;
    }

    public double calculatePerimeter(){
        return this.length+this.length+this.width+this.width;
    }

    public void printInformation(double area, double perimeter){
        System.out.println(
                "Shape has: " + width + " width, " + length+ " lenght." + "\n" +
                "The area of the shape is: " + (Math.round(area * 100.0) / 100.0) + "\n" +
                "The perimeter of the shape is: " + (Math.round(perimeter * 100.0) / 100.0) + "\n"
        );
    }

    public void printInformation(){
        System.out.println(
                "Shape has invalid data." + "\n" +
                        "Width: " + width + "; length: " + length + "."
        );
    }
}

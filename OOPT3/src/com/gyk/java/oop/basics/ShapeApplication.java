package com.gyk.java.oop.basics;

public class ShapeApplication {
    public static void main(String[] args) {

        Square square1 = new Square(1.1,2.2);
        Square square2 = new Square(12.1,22.2);
        Square square3 = new Square(0.1,0.2);
        Square square4 = new Square(-1.1,52.2);
        Square square5 = new Square(1.1,-62.2);

        Square[] squares = new Square[5];
        squares[0] = square1;
        squares[1] = square2;
        squares[2] = square3;
        squares[3] = square4;
        squares[4] = square5;

        for (int i = 0; i < squares.length ; i++) {
           if (squares[i].squareValidation()){
               double area = squares[i].calculateArea();
               double perimeter = squares[i].calculatePerimeter();
               squares[i].printInformation(area,perimeter);
           }
           else {
               squares[i].printInformation();
           }

        }
    }
}

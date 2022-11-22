package com.gyk.java.oop.basics;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] xy = new int[2];
        xy[0] = x;
        xy[1] = y;
        for (int i = 0; i < xy.length; i++) {
            System.out.println();
        }
        return xy;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y +")";
    }

    public double distance(int x, int y){
       return (Math. sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y)));
    }

    public double distance(MyPoint myPoint){
        return (Math.sqrt((myPoint.getX()-this.x)*(myPoint.getX()-this.x)+(myPoint.getY()-this.y)*(myPoint.getY()-this.y)));
    }

    public double distance(){
        return (Math.sqrt((this.x)*(this.x)+(this.x)*(this.x)));
    }

}

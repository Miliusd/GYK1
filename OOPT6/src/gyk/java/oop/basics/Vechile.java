package gyk.java.oop.basics;

public class Vechile {
    private String name;
    private String brand;
    // current vechile fuel in liters
    private int fuel;
    // how much liters of fuel per 100km
    private int consumption;

    public Vechile(String name, String brand, int fuel, int consumption) {
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuel() {
        return fuel;
    }

    public int getConsumption() {
        return consumption;
    }
    public int furthestTravel(){
        return (this.fuel/this.consumption)*100;
    }
}

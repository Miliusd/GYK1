package gyk.java.oop.basics;

public class TravelDestination {
    private String name;
    private String city;
    // in km
    private int distance;

    public TravelDestination(String name, String city, int distance) {
        this.name = name;
        this.city = city;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "TravelDestination{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", distance=" + distance +
                '}';
    }
}

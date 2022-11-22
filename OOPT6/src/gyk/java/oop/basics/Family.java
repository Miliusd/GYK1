package gyk.java.oop.basics;

public class Family {
    private Person[] personInstances;
    private Vechile vechileInstance;
    private TravelDestination travelDestinationInstance;

    public Family() {
    }

    public Family(Person[] personInstances, Vechile vechileInstance, TravelDestination travelDestinationInstance) {
        this.personInstances = personInstances;
        this.vechileInstance = vechileInstance;
        this.travelDestinationInstance = travelDestinationInstance;
    }

    public Person[] getPersonInstances() {
        return personInstances;
    }

    public void setPersonInstances(Person[] personInstances) {
        this.personInstances = personInstances;
    }

    public Vechile getVechileInstance() {
        return vechileInstance;
    }

    public void setVechileInstance(Vechile vechileInstance) {
        this.vechileInstance = vechileInstance;
    }

    public TravelDestination getTravelDestinationInstance() {
        return travelDestinationInstance;
    }

    public void setTravelDestinationInstance(TravelDestination travelDestinationInstance) {
        this.travelDestinationInstance = travelDestinationInstance;
    }
}

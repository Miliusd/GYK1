package gyk.java.oop.basics;

public class TravelApplication {

    static class TravelManager{
    public void changeDestination(Family family,TravelDestination destination){
        if(family.getTravelDestinationInstance().equals((destination))){

        }
        else {
            family.setTravelDestinationInstance(destination);
        }
        System.out.println(family.getTravelDestinationInstance());
    }
    public void travel(Family family){
           if (family.getTravelDestinationInstance().getDistance() < family.getVechileInstance().furthestTravel()){
               family.getTravelDestinationInstance().setDistance(
                       family.getVechileInstance().furthestTravel() - family.getTravelDestinationInstance().getDistance());
               System.out.println("Travel was succesfull. Family still can travel: " + family.getTravelDestinationInstance().getDistance());
           }
           else {
               System.out.println("Travel was not succesfull. Family still needs: " + (family.getTravelDestinationInstance().getDistance()-family.getVechileInstance().furthestTravel())/100*family.getVechileInstance().getConsumption()+" l of fuel.");
           }
    }
    public void printFamilyMembers(Family family){
        for (int i = 0; i < family.getPersonInstances().length; i++) {
            System.out.println(family.getPersonInstances()[i]);
        }
    }
    }

        public static void main (String[]args){
        Person father1 = new Person("Father","BestFather",Gender.MALE.label, 50);
        Person father2 = new Person("Father","GoodFather",Gender.MALE.label, 60);
        Person mother1 = new Person("Mother","BestMother",Gender.FEMALE.label, 40);
        Person mother2 = new Person("Mother","GoodMother",Gender.FEMALE.label, 50);
        Person[] persons = new Person[2];
        persons[0] = father1;
        persons[1] = mother1;
        Person[] persons1 = new Person[2];
        persons1[0] = father2;
        persons1[1] = mother2;
        TravelDestination destination = new TravelDestination("Travel1","London",100);
        TravelDestination destination1 = new TravelDestination("Travel2","Paris",230);
        TravelDestination destination2 = new TravelDestination("Travel3","Berlin",500);
        Vechile vechile = new Vechile("Vechile1","Opel",100,8);
        Vechile vechile1 = new Vechile("Vechile2","BMW",80,60);
        Family family = new Family(persons,vechile,destination);
        Family family1 = new Family(persons1,vechile1,destination1);

        TravelManager manager = new TravelManager();

        manager.changeDestination(family,destination2);
        manager.travel(family);
        manager.travel(family1);
        manager.printFamilyMembers(family);
        manager.printFamilyMembers(family1);



        }

}

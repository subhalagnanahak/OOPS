package Inheritance.Transport;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;


    Car(int noOfDoors, String transmissionType, String model, String name, int noOfTyers) {
        super(name, model, noOfTyers);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        //super.startEngine();

    }
        public void startAC() {
            System.out.println("Start AC " + name);

        }
    }

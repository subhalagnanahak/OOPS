package Transport;

public class motorCycle extends Vehicle {
    public String handleBarStyle ;
    public String suspensionType ;

    motorCycle(String name, String model, int noOfTyers, String handleBarStyle, String suspensionTypee ){
        super (name , model , noOfTyers );
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;

    }
    public void wheelie  () {
        System.out.println ("motorCycle is doing wheelieeee !" + name  );
    }

    public void stopEngine() {
    }

    public void startEngine() {
    }
}

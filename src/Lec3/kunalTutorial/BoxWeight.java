package Lec3.kunalTutorial;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super(0, 0, 0);   // pass whatever default l, w, h Box expects
        this.weight = -1;
    }



    public BoxWeight(double l, double w, double h, double weight) {
        super(l, h, w);   // this one already works correctly
        //used to intialiese values present in parent class.

       // System.out.println (super.weight);

      //  super (l, h , w ) ; // what is this ? call the parent class constructor
        // super class dont what base contains
        this.weight = weight;
    }
}
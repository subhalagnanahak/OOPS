package Lec3.kunalTutorial;

public class BoxWeight extends Box{
    double weight ;

    public BoxWeight(){

        super(box1);
        this.weight = -1;


    }


    public BoxWeight(double weight) {
        super(box1);
        this.weight = weight;
    }

    public BoxWeight(double l , double w ,double h , double weight) {
        super(l, h, w );   // call the parent class constructor
                            // used to initialise values present in parent class
        this.weight = weight;

    }
}

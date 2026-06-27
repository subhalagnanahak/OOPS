package Lec3.kunalTutorial;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super(0, 0, 0);   // pass whatever default l, w, h Box expects
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other);          // calls Box's copy constructor, copies l, h, w
        this.weight = other.weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, h, w);   // must be the first statement, and only called once
        this.weight = weight;
    }
}
package Lec3.kunalTutorial;

public class Box {

    double l;
    double h;
    double w;

    // copy constructor
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    // cube
    Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public void information() {
        System.out.println("running the box");
    }
}

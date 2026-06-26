package Lec3.kunalTutorial;

public class BoxPrice extends BoxWeight
{

    double cost;


    BoxPrice () {
        super();
        this.cost = -1;
    }
    BoxPrice (BoxPrice other){
        super();
        this.cost = -1;
        this.cost = other.cost;
    }

    public BoxPrice(double cost) {
        this.cost = cost;
    }

}

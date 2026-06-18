//public class Main {
void main(String[] args) {
    Student kunal = new Student();
    System.out.println(kunal.name); // → default person
}

// (using Constructor Overloading)

public class Calling_constructors {
}

//}
/* ------------------------------------------------------ */
class Student {
    int rno;
    String name;
    float marks;

    Student() {
        this(13, "default person", 100.23f);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
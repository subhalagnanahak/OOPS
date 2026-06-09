
    import java.util.Scanner;

    public class DOG {

        // Attributes
        String breed;
        int age;
        String color;

        // Setter methods
        public void setBreed(String breed) {
            this.breed = breed;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // Print details
        public void printDetails() {
            System.out.println("Breed: " + breed);
            System.out.println("Color: " + color);
            System.out.println("Age: " + age);
            System.out.println("Dog Class: " + this);
        }

        // ✅ main method is INSIDE the class
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DOG myDog = new DOG();

            System.out.print("Enter breed: ");
            myDog.setBreed(scanner.nextLine());

            System.out.print("Enter color: ");
            myDog.setColor(scanner.nextLine());

            System.out.print("Enter age: ");
            myDog.setAge(scanner.nextInt());

            myDog.printDetails();
            scanner.close();
        }
    }

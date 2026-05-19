
    class Student {
        int id;
        String n;

        public Student(int id, String n) {
            this.id = id;
            this.n = n;
        }
    }

    public class javaclass{
        static void main() {
            Student s1 = new Student(10, "Alice");
            System.out.println(s1.id);
            System.out.println(s1.n);

            Student s2 = new Student(20, "Bob");
            Student s3 = new Student(30, "Charlie");
            System.out.println(s2.id  + s2.n );
        }
    }


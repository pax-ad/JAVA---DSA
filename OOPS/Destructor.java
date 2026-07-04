package OOPs;

public class Destructor {
    //Program to demonstrate destructor in java
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    //Destructor
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destructor is called");
        super.finalize(); // use garbage collector to free up memory , current version of java does not have destructor, but we can use finalize() method to free up memory, but it is not guaranteed that it will be called, so we should not rely on it.
    }
}

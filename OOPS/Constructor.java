package OOPs;

public class Constructor {

    //constructor is a special method which is used to initialize the object of a class
    //it has the same name as the class and it does not have a return type(not even void)

    public static void main(String[] args) {
        Student S1 = new Student(); //non-paramaterized class
         //creating an object of class Student

         Student s1 = new Student("Aman"); // paramaterized

         Student s2 = new Student(s1); //copy constuctor


    } 
}

class Student {
        String name;
        int roll;

        //Non paramaterized constructor
        Student(){
            System.out.println("constructor is called ...");
        }

        //paramaterized constructor
        Student (String name){
            this.name = name;
        }

        //Copy constructor
        Student(Student s) {
         this.name = s.name;
        this.roll = s.roll;
        }   

        


    }

    /*scenario : when i wrote student class inside the classConstructor
    
    Student is an inner (non-static) class, while main() is static.

A static method cannot directly create an object of a non-static inner class, so you'll get an error like:

Cannot make a static reference to the non-static type Student */

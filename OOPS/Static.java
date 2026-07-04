package OOPs;

public class Static {
    //static keyword is used to create class level variables and methods. It is used to access the class level variables and methods without creating an object of the class. 
    //static variables are shared among all the objects of the class. It is used to achieve memory management in java. 
    //static methods can only access static variables and static methods. It cannot access non-static variables and non-static methods. 
    //static block is used to initialize the static variables. It is executed only once when the class is loaded into memory. 
    //static nested class is a nested class that is declared as static. It can access the static members of the outer class. It cannot access the non-static members of the outer class. 
    //static import is used to import the static members of a class. It allows us to access the static members of a class without using the class name.


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.schoolName="K.V.";

        Student s2 = new Student();
        System.out.println(s2.schoolName); //K.V. because static variable is shared among all the objects of the class. It is used to achieve memory management in java.

    }

}


class Student{
    String name;
    int roll;

    static String schoolName;
     //static variable is shared among all the objects of the class. It is used to achieve memory management in java.

     void setName(String name){
        this.name = name;
     }

     String setName(){
        return name;
     }
}
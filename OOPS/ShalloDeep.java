package OOPs;

public class ShalloDeep {
    //shallow : changes reflect 
    //Deep copy : changes don't reflect

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.roll =456;
        s1.password = "abcd"; 
        s1.marks[0]=100;
        s1.marks[1]=90;

        Student s2 = new Student(s1); //copy constructor is called
        s2.password="xyz";
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    //deep copy constructor
    /*Why is this a deep copy?

Because you copied the contents of the array instead of copying the reference. */

    Student(Student s1){ //this is a shallow copy 
        marks = new int[3]; //is actually wasted, because immediately afterwards you overwrite it: this.marks = s1.marks; //this is a shallow copy, because both objects will point to the same array in heap memory
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i]; //this is a deep copy, because both objects will point to different arrays in heap memory
        }
    }
}

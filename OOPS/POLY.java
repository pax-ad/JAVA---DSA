package OOPs;

public class POLY {
    //polymorphism in java
    /*Static - Method overloading (compile time polymorphism)
    
    Dynamic - Method Overridding (run time polymorphism)*/

    //method overloading :
    public static int Calci(int a , int b){
       int sum = a + b ;
       return sum ;
    }

    public static int Calci(int a , int b,int c){
       int sum = a + b + c;
       return sum ;
    }


    public static void main(String[] args) {
        System.out.println(Calci(5,5));
        System.out.println(Calci(5,5,5));
        
        Animal a1 = new Animal();
        a1.eat();   
        Deer D1 = new Deer();   
        D1.eat();
        /*Animal a2 = new Deer();
          a2.eat(); 
          try to write like this
       
    }
}

    //method overriding :
/*parent and class both contain the same function with a different defintion */

class Animal{
    void eat(){
        System.out.println("eat everything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }

}
package OOPs;

public class Inhert {
    //Inheritance in OOPs

    public static void main(String[] args) {
        
    }
}
class Animal{
    void eat(){
        System.out.println("eating");
    }
    void sleep(){
        System.out.println("sleeping");
    }

    String Skin_color (String sc){
        sc = " abc";
        return sc;
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swimming");
    }

    String Skin_color (String sc){
        sc = "xyz";
        return sc;
    }

    void sleep(){
        System.out.println("yup fish does sleep");
    }
}

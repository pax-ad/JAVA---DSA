package OOPs;

public class OOPs {
    
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a object name p1 , by using new keyword we are creating a object of class Pen and memory in system heap is allocated for that object
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip); 
    }

}

    class Pen{
        String color;
        int tip;
        void setColor(String newColor){
            color = newColor;
        }
        void setTip(int newTip){
            tip = newTip;
        }
    }




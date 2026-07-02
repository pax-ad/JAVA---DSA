package OOPs;

public class GetSet {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
    
}

//creating a class for object pen
  class Pen{
        
        private String color;
        private int tip;

        //getter method to get the color of the pen
        String getColor(){ //A getter should not take any parameters because its only job is to return the value of the instance variable.
            return this.color; //this keyword is used to refer to the current object of the class
        }


        int getTip(){
            return this.tip; 
        }

        //setter method to set the color of the pen
        void setColor(String newColor){
            this.color = newColor; 
        }
        
        
        void setTip(int newtip){
            this.tip = newtip; //this is also used for variable shadowing, when the local variable and instance variable have the same name, we can use this keyword to refer to the instance variable
        }
    }


package OOPs;

public class Interface {

    //program to demonstrate interface in java
    //interface is a collection of abstract methods and constants. It is used to achieve abstraction and multiple inheritance in java. 
    // It is a blueprint of a class. It is used to achieve loose coupling between classes. 
    // It is used to achieve polymorphism in java. 
    // It is used to achieve inheritance in java.
    //  It is used to achieve abstraction in java. 
    // It is used to achieve multiple inheritance in java. 
    // It is used to achieve polymorphism in java.
    //  It is used to achieve encapsulation in java. 
    // It is used to achieve inheritance in java.

    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
    }
}
 interface ChessPlayer {
        void moves();
    }

    class Queen implements ChessPlayer {
        @Override
        public void moves() {
            System.out.println("Queen can move in any direction");
        }
    }
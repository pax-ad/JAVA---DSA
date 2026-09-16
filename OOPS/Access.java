package OOPs;

public class Access {
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Aman";
        
        // 1. Set the private password using the setter method
        myAcc.setPassword("1234");
        
        // 2. Read the private password using the getter method
        System.out.print(myAcc.getPassword());
    }
}

class BankAccount {
    public String username;
    private String password;

    /*Since password is private, the class provides a public method public String setPassword(String pwd) to safely change it from the outside. */
    // Setter: Used to modify the private variable
    public void setPassword(String pwd) {
        this.password = pwd;
    }

    // Getter: Used to safely read the private variable
    public String getPassword() {
        return this.password;
    }
}

package OOPs;

public class Access {
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Aman";
       // myAcc.password = "abcdefghi"; 
        // this will give an error because password is private and can only be accessed within the class  
        
        myAcc.setPassword("1234");
        System.out.print( myAcc.setPassword("1234"));
    }

    
}

class BankAccount{
    public String username;
    private String password;

    //we need to make some changes in bankaccount
    public String setPassword(String pwd){
        password = pwd;
        return pwd;
    }
}


    

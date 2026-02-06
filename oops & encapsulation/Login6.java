import java.util.*;
class Account{
    private String password="12345678";
    private int attempts=0;
    Account(String password){
        this.password=password;
    }
      void check(String pass){
        if(password.equals(pass)){
           System.out.println("Login Succesfully");
        }
        else{
            attempts++;
            if(attempts==3){
                System.out.println("Account locked");
            }
            else{
                System.out.println("Wrong passwrd");
            }
        }
       
    }
}
public class Login6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         Account obj=new Account("12345678");
        for(int i=0;i<3;i++){
         String  password=sc.next();
         obj.check(password);
        }
    }
}
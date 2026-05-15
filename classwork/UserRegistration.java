package classwork;
import java.util.*;
public class UserRegistration{

    public static boolean validEmail(String email){
        if(email.contains("@") && email.contains(".")){
            return true;
        }
        return false;
    }

    public static boolean validPassword(String password){
        if((password.length() >= 8) && (password.matches(".*[A-Z].*")) && (password.matches(".*[1-9].*") && password.matches(".*[!@#$%^&*()_+].*"))){
            return true;
        }
        return false;
    }

    public static boolean validUsername(String username){
        if(username.length() != 0){
            return true;
        }
        return false;
    }

    public static String getDomain(String email){
        String domain = email.substring(email.indexOf("@")+1);
        return domain;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        System.out.println("Domain: " + getDomain(email));
        System.out.println("Username: " + username.toLowerCase());
        
        if(validUsername(username) && validEmail(email) && validPassword(password)){
            System.out.println("Registration successful!");
        }
        else{
            System.out.println("Registration failed! Please check your inputs.");
        }
    }
}
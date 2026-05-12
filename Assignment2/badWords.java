package Assignment2;
import java.util.*;

public class badWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String [] badwords = {"bad", "ugly", "stupid"};
        System.out.println("Enter a Line: ");
        String str = sc.nextLine();

        for(int i=0; i<badwords.length; i++){
            String stars = "";
            for(int j=0; j<badwords[i].length(); j++){
                stars += "*";
            }
            str = str.replace(badwords[i], stars);
        }
        System.out.println(str);
    }
}

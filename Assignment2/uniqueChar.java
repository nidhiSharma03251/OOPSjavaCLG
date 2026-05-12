package assignment2;

public class uniqueChar {
    public static void main(String args[]){
        String str = "nidhi";
        boolean notUnique = false;
        boolean [] check = new boolean[26];
        for(int i=0; i<str.length(); i++){
            int index = str.charAt(i) - 'a';
            System.out.println(index);
            if(check[index] == true){
            System.out.println("Not unique");
            notUnique = true;
            break;
            }
            check[index] = true;
        }
        if(notUnique==false){
            System.out.println("Unique");
        }
        
    }
}

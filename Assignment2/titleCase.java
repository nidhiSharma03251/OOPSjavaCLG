package Assignment2;

public class titleCase {
    public static void main(String args[]){
        String str = "hello world";
        String[] words = str.split(" ");
        String titleCase = "";
        for(String word: words){
            titleCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(titleCase);
    }
}

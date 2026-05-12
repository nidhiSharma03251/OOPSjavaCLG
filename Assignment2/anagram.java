package Assignment2;

public class anagram {
    public static boolean checkAnagram(String str1, String str2){
        int count[] = new int[26];

        for(int i=0; i<str1.length(); i++){
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }
        for(int i=0; i<count.length; i++){
            System.out.print(count[i]+ " ");
        }

        for(int c:count){
            if(c!=0){
                System.out.println("Not an anagram");
                return false;
            }
        }
        System.out.println("Anagram");
        return true;
    }
    public static void main(String args[]){
        String str1 = "nidhi";
        String str2 = "hindi";

        System.out.println(checkAnagram(str1, str2));
    }
}

package Assignment2;

public class permutation {
    public static void totalPermutation(String str, int idx, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+ str.substring(i+1);
            totalPermutation(newStr, idx+1, ans+currChar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        totalPermutation(str,0,"");
    }
}

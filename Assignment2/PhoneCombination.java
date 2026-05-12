package Assignment2;

public class PhoneCombination{
    static String[] mapping = {"", "","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void combination(String digits, int index, String ans){
        if(index == digits.length()){
            System.out.println(ans);
            return;
        }

        char currDigit = digits.charAt(index);
        String mappingStr = mapping[currDigit - '0'];

        for(int i=0; i<mappingStr.length(); i++){
            char currChar = mappingStr.charAt(i);
            combination(digits, index+1, ans + currChar);
        }
    }
    public static void main(String args[]){
        String digits = "45";
        combination(digits, 0, "");
    }
}
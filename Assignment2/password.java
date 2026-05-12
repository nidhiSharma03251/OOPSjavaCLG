package Assignment2;

public class password {
    public static int CheckPassword(String str, int n){
        if(str.contains("/")){
            return 0;
        }
        if(str.contains(" ")){
            return 0;
        }
        if(str.startsWith("1") || str.startsWith("2") || str.startsWith("3") || str.startsWith("4") || str.startsWith("5") || str.startsWith("6") || str.startsWith("7") || str.startsWith("8") || str.startsWith("9")){
            return 0;
        }

        int count = 0;
        boolean has4c = false;
        boolean hasUpperCase = false;
        boolean hasDigits = false;

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                hasDigits = true;
            }
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }   
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        if(count >= 4){
            has4c = true;
        }
        if(!hasUpperCase || !has4c || !hasDigits){
            return 0;
        }
        return 1;
    }
    public static void main(String args[]){
        String str="AbcfyoeoAR@12";
        int n=str.length();
        if(CheckPassword(str,n) == 1){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
    }
}

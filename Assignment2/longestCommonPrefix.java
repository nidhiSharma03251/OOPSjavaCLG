package Assignment2;
public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] str){
        if(str.length == 0){
            return "";
        }
        String prefix = str[0];
        for(int i=1; i<str.length; i++){
            while(str[i].startsWith(prefix) == false){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String args[]){
        String str[] = {"flower","flow","flight"};
        String prefix = longestCommonPrefix(str);
        System.out.println("Longest common prefix: " + prefix);
    }
}

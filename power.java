public class power {
    public static void main(String args[]){
        int base = 2;
        int expo = 5;
        int result = 1;
        
        for(int i=1; i<=expo; i++){
            result = result * base;
        }
        System.out.println(base + " raised to the power of " + expo + " is: " + result);
    }
}

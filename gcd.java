public class gcd {
    public static void findGCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
    public static void main(String args[]){
        findGCD(48, 18);
    }
}

// 13. Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers.

public class sumOfPrime {

    public static boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n = 40;

        for(int i=2; i<=n/2; i++){
            if(isPrime(i) && isPrime(n-i)){
                System.out.println(n + " can be expressed as the sum of " + i + " and " + (n-i));
                return;
            }
        }
    }
}

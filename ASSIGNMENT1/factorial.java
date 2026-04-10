// 6. Write a java program to print Factorial of a given number. Use any loop.

public class factorial {

    public static void printFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
    public static void main(String args[]){
        printFactorial(5);
    }
}

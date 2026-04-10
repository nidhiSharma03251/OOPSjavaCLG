// 9. Write a java program to print sum of n terms in the series 1/1! +1/2!+1/3 !.....

public class sequence {

    public static void sequencePrinting(int n){
        double sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + 1.0/factorial(i);
        }
        System.out.println("Sum of " + n + " terms in the series is: " + sum);
    }

    public static int factorial(int a){
        int fact = 1;

        for(int i=1; i<=a ; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        sequencePrinting(5);
    }
}

// Write a java program to print the following sequence:
// 2, 1, 4, 2, 6, 6, 8, 24, 10, and so on up to a given limit.

public class printPattern {

    public static void printpattern(int n){
        int f =2;
        int fact = 1;
        
        for(int i=1; i<=n; i++){
            fact = fact*i;
            System.out.print(f + ", " + fact);
            f=f+2;

            if(i!=n){
                System.out.print(", ");
            }
        }
    }
    public static void main(String args[]){
        printpattern(10);
    }
}

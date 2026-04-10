// Write a java program to print the following sequence:
// 0,-1,1,-4,1,-7,2,-10,3,-13,5,-16,8, ... up to a given limit.

public class fibo5 {

    public static void printFibo(int n){
        int a=0;
        int b=1;
        int neg=-1;
        int count=0;

        while(count<n){
            int c=a+b;
            System.out.print(a + "," + neg);

            if(count < n-1){
                System.out.print(",");
            }

            a=b;
            b=c;
            neg=neg-3;
            count++;
        }
    }
    public static void main(String args[]){
        printFibo(10);
    }
}

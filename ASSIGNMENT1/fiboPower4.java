// Write a java program to print the following sequence:
// 0,2,1,4,1,8,2,16,3,32,5,64,8, ... up to a given limit.

public class fiboPower4 {

    public static void printFiboPower(int n){
        int a=0;
        int b=1;
        int p=1;

        for(int i=2; i<10; i++){
            int c=a+b;
            System.out.print(a + "," +((int)Math.pow(2, p)));

            if(i!=n-1){
                System.out.print(", ");
            }
            a=b;
            b=c;
            p++;
        }
    }
    public static void main(String args[]){
        printFiboPower(10);
    }
}

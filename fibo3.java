public class fibo3 {
    public static void printFiboPrime(int n){
        int a=0;
        int b=1;

        int found=0;
        while (found < n) {
            int c=a+b;
            if(isPrime(c)){
                System.out.print(c+ " ");
                found++;
            }
            a=b;
            b=c;
        }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        printFiboPrime(8);
    }
}



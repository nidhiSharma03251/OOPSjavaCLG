public class sum16 {
    public static void main(String args[]){
    int sum=0;
    for(int i=101; i<200; i++){
        if(i%7==0){
            sum=sum+i;
        }
    }
    System.out.println("Sum of multiples of 7 between 101 and 200: " + sum);
    }
}
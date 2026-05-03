import java.util.Scanner;

public class matrix {
    
    public static void getInput(int a[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }


    public static void printArray(int a[][]){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addElements(int a[][]){
        for(int i=0; i<3; i++){
            int sum=0;
            for(int j=0; j<3; j++){
                if(j==2){
                    sum -= a[i][j];
                }else{
                    sum += a[i][j];
                }
            }
            System.out.print(sum + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[][] =new int[3][3];
        getInput(a);
        printArray(a);
        addElements(a);
    }
}

package classwork;
import java.util.Scanner;

public class subArr {

    public static void getInput(int a[][],int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }


    public static void printArray(int a[][],int n){
        for(int i = 0; i < n - 1; i++){
        for(int j = 0; j < n - 1; j++){
            
            System.out.println("2x2 Submatrix starting at (" + i + "," + j + "):");
            
            for(int x = i; x <= i + 1; x++){
                for(int y = j; y <= j + 1; y++){
                    System.out.print(a[x][y] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        int a[][] = new int[n][n];
        getInput(a,n);
        printArray(a,n);
    }
}    


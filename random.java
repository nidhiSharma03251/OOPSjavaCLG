import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i=0; i<5; i++){
            int randomNum = rand.nextInt(100)+1;
            System.out.print(randomNum + " ");
        }
    }
}

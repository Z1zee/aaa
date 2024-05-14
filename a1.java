package day_19;

import java.util.Random;

public class a1 {
    public static void main(String[] args) {

        Random random = new Random();
        int heads = 0, Tails = 0;
        for (int i= 1; i<=3; i++){
            int coinSide = random.nextInt(1,3);
            if (coinSide == 1){
                System.out.println("Heads");
                heads++;
            }
            else {
                System.out.println("Tails");
                Tails++;
            }
        }
        if ((heads == 3) || (Tails == 3)){
            System.out.println("u won");
        }
        else{
            System.out.println("u lose");
        }
    }
}

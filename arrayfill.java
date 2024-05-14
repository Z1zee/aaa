package day_19;

import java.util.Arrays;
import java.util.Scanner;

public class arrayfill {
    public static void main(String[] args) {
        //Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int[] number = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("scasf" + (i));
            number[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(number));
    }

}

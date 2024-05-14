package day_19;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrayCreation2 {
    public static void main(String[] args) {

        int[] value = {5,10,15,20,25};
        System.out.println(Arrays.toString(value));

           int[] arraySize = new int[5];
           arraySize[0] = 1;
           arraySize[1] = 7;
           arraySize[2] = 3;
           arraySize[3] = 4;
           arraySize[4] = 5;

        //System.out.println("enter the size of an array");

        System.out.println(Arrays.toString(arraySize) + "sdssd");


        System.out.println("enter size of an array:");
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();


        int[] array = new int[sizeOfArray];

        for (int i = 0; i <= array.length; i++) {

            System.out.println("enter values of an array:");
            array[i] = scanner.nextInt();


        }

        for (int i = 0; i <= array.length; i++) {


            if(array[i] == 0){
                System.out.println("printing of an array: " + array[i]);

            }
            else{
                continue;
            }



        }


        System.out.println("size of an arrray is : " + array.length);

//        int[] values = {1000, 1, 934, 23, -5, 500};
//        Arrays.sort(values);
//        System.out.println(Arrays.toString(values));
//        int[] num = new int[10];
//        System.out.println(Arrays.toString(num));
    }
}

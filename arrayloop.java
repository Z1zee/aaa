package day_19;

public class arrayloop {
    public static void main(String[] args) {
        int[] array = new int []{90,23,5,109,12,22,67,34,11,22};
        //Arrays.sort(array);
         //System.out.println("elements of array sorted in ascending order;:");
            for (int i =0; i <array.length-5; i++){
              System.out.println(array[i] + " ");
            //System.out.println(Arrays.toString(array));
         }

//        for (int i = 0; i<5; i++)
//            System.out.println(array[i]);
    }
}

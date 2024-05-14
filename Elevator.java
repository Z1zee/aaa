package day_19;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You are on the 1st floor");
//        System.out.println("Select the floor you want to go to");
//        int currentFloor = scanner.nextInt();
//        System.out.println("elevator on the " + currentFloor + "th floor " + "elevator moved");
//        boolean choice = true;
////        do {
////            System.out.println("Do you want to continue 1YES OR 2NO");
////            int choice1 = scanner.nextShort();
////            while (choice1) {
////                case 1:
////                    System.out.println("rvt");
////                    continue;
////                case 2:
////                    System.out.println("bye");
////                    choice = false;
////                    break;
////            }
//        while (choice);
//        if (currentFloor == 15 || currentFloor == 23) {
//            System.out.println("floor under construction");
//            //System.out.println("Elevator moved " + currentFloor + " times");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are on the 1st floor");
        int currentFloor = 1;
        int count = 0;
        String answer;

        do {
            System.out.println("Select the floor you want to go");
            int floorToSelect = scanner.nextInt();

            if(floorToSelect >= 1 && floorToSelect <= 25){
                if(floorToSelect == 15 || floorToSelect == 23){
                    System.out.println("Under construction");
                    break;
                }
                currentFloor = floorToSelect;
                System.out.println("You are on the " + currentFloor + " floor");
                System.out.println("Do you want to continue (yes/no)");
                answer = scanner.next();
                count++;
            } else{
                System.out.println("Invalid floor selection");
                break;
            }

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("Elevator moved " + count + " times");



    }
}

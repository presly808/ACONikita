package ua.artcode.day1;

import java.util.Scanner;

/**
 * Created by admin on 26.08.2014.
 */
public class Task1 {

    public static void main(String[] args) {

        /*
        * int[] mas = new int[10];
        * _ _ _ _ _ _ 0 0 0
         *
         * byte, short, int, long, char = 0
         * float, double = 0.0;
         * boolean = false
         *
         * Reference type default value is null
         *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Input group size");
        int size = sc.nextInt();
        String[] names = new String[size]; // null , null, null
        int[] ages = new int[size];
        int[] groupNums = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Input name of " + (i+1) +" student"); // String + int + String
            names[i] = sc.next();
            System.out.println("Input age of " + (i+1) +" student"); // String + int + String
            ages[i] = sc.nextInt();
            System.out.println("Input group of " + (i+1) +" student"); // String + int + String
            groupNums[i] = sc.nextInt();
        }

        System.out.println("\nSTUDENTS LIST");
        for (int i = 0; i < size; i++) {
            System.out.println((i+1) + " name : " + names[i] + "; age : " + ages[i] + "; group : " + groupNums[i]);
        }

    }

}

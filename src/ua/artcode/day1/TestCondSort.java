package ua.artcode.day1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by admin on 28.08.2014.
 */
public class TestCondSort {

    //Here we use selection sort
    public static char[] sortWithNoDuplicates(char[] mas){
        char[] duplicates = new char[mas.length];
        int counterForDuplicates = 0;
        int end = mas.length - 1;


        for(int i = 0; i < end; i++){
            char value = mas[i]; //temp ceil for comparing(selection sort)
            int minI = i; //temp index for comparing(selection sort)

            for(int j = i + 1; j <= end; j++){
                if(mas[j] < value){
                    minI = j;
                    value = mas[j];
                } else if(mas[j] == value){
                    duplicates[counterForDuplicates++] = mas[j]; // put into mas for duplicates
                    swap(mas, j, end--);//duplicate go to end position, end limit will decrease
                }
            }

            swap(mas, i, minI);


        }

//        System.out.println(Arrays.toString(Arrays.copyOf(mas, end+1)));

        return duplicates;
    }

    private static void swap(char[] mas, int a, int b){
        char t = mas[a];
        mas[a] = mas[b];
        mas[b] = t;
    }


    public static void main(String[] args) {
        char[] mas = {'4','1','r','N','2','g','5','1','9','g','5','4'};
        char[] duplicates = sortWithNoDuplicates(mas);
        System.out.println("SORTED MAS");
        System.out.println(Arrays.toString(mas));
        System.out.println("DUPLICATES");
        System.out.println(Arrays.toString(duplicates));

    }

}

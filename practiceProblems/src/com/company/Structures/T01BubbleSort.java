package com.company.Structures;


import java.util.Arrays;

public class T01BubbleSort {

    public T01BubbleSort(int[] arrNumber){
        //declarations
        boolean swapped = true;
        int last = arrNumber.length - 1;

        while (swapped){
            swapped = false;

            for (int i = 0; i<last; i++){
                if(arrNumber[i] > arrNumber[i+1]){
                    swap(arrNumber,i,i+1);

                    swapped = true;
                }
            }
            last--;
        }

        System.out.println("Sorted array list: "+ Arrays.toString(arrNumber));
    }

    private static void swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}

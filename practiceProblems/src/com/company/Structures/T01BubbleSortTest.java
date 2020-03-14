package com.company.Structures;


import java.util.ArrayList;
import java.util.Arrays;


public class T01BubbleSortTest {

    public T01BubbleSortTest(int[] arrNum){
        //declarations
        boolean doSwap = true;
        int size = arrNum.length - 1;

        while(doSwap){
            doSwap = false;

            for(int i = 0; i<size; i++){
                if(arrNum[i]>arrNum[i+1]){
                    swap(arrNum, i, i+1);
                    doSwap = true;
                }
            }
            size--;
        }

        System.out.println("Bubble Sort Test: "+ Arrays.toString(arrNum));
    }

    private void swap(int[] arrNum, int from, int to) {
        int temp = arrNum[to];
        arrNum[to] = arrNum[from];
        arrNum[from]=temp;
    }
}

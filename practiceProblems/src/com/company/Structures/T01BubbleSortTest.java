package com.company.Structures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T01BubbleSortTest {

    public T01BubbleSortTest(int[] num){
        //declarations
        boolean doSwapped = true;
        int lastIndex = num.length-1;

        while(doSwapped){
            doSwapped = false;

            for (int i =0; i < lastIndex; i++){
                if(num[i] > num[i+1]){
                    swap(num,i,i+1);
                    doSwapped = true;
                }
            }
            //reduce last
            lastIndex--;
        }

        System.out.println("Sorted Array list: "+ Arrays.toString(num));
    }

    private void swap(int[] num, int from, int to) {
        int temp = num[to];
        num[to] = num[from];
        num[from] = temp;
    }
}

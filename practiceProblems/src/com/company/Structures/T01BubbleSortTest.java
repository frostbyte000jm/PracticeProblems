package com.company.Structures;


import java.util.Arrays;

public class T01BubbleSortTest {

    public T01BubbleSortTest(int[] arrNum){
        //declarations
        boolean doSwaps = true;
        int lastNum = arrNum.length - 1;

        //While loop to keep going over and over for size of array. Have it short when no change
        while(doSwaps){
            doSwaps = false;

            //for loop from 0 to X, each loop will compare current index to next index until > value is pushed to end.
            for(int i = 0; i < lastNum; i++){
                if(arrNum[i]>arrNum[i+1]){
                    swap(arrNum,i,i+1);
                    doSwaps = true;
                }
            }
            lastNum--;
            //doSwaps true when there is a change
            //remove one number form end
        }

        System.out.println("Array Sorted: "+ Arrays.toString(arrNum));

    }

    private void swap(int[] arrNum, int from, int to) {
        int temp = arrNum[to];
        arrNum[to] = arrNum[from];
        arrNum[from]=temp;
    }
}

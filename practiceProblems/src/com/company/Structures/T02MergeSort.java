package com.company.Structures;

import java.util.Arrays;

public class T02MergeSort {

    public T02MergeSort(int[] arrNum){
        //Merge sort needs to be done with recursion.
        mergeSort(arrNum,0,arrNum.length-1);

        System.out.println("Merge Sort Values: "+ Arrays.toString(arrNum));
    }

    private void mergeSort(int[] input, int start, int end) {
        //set mid point
        int mid = (start + end)/2;

        //split in half
        if(start<end){
            mergeSort(input,start,mid);
            mergeSort(input,mid+1,end);
        }

        //create a loop for front to middle, and from middle to last
        int i=0,first = start, last = mid + 1;
        int[] temp = new int[end-start+1];

        //Compare the two values, and sort them.
        while(first<= mid && last <=end){
            temp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        // place the first into temp
        while (first<=mid){
            temp[i++] = input[first++];
        }
        //place the second half into temp
        while (last<=end){
            temp[i++] = input[last++];
        }
        //Drop what is sorted from Temp into Input
        i=0;
        while (start<=end){
            input[start++] = temp[i++];
        }
    }

}

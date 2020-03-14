package com.company.Structures;

import java.util.Arrays;

public class T02MergeSort {

    public T02MergeSort(int[] arrNum){
        //Merge sort needs to be done with recursion.
        mergeSort(arrNum,0,arrNum.length-1);

        System.out.println("Merge Sort Values: "+ Arrays.toString(arrNum));
    }

    private void mergeSort(int[] input, int front, int tail) {
        //set mid point
        int mid = (front + tail)/2;

        //divide and concur. Split in half until everything is separated.
        if(front<tail){
            mergeSort(input,front,mid);
            mergeSort(input,mid+1,tail);
        }

        //declarations for while loops below
        int i=0,firstHalf = front, secondHalf = mid + 1; //i is a TempIndex
        int[] temp = new int[tail-front+1];

        //Compare the two values, and sort them.
        while(firstHalf<= mid && secondHalf <=tail){
            temp[i++] = input[firstHalf] < input[secondHalf] ? input[firstHalf++] : input[secondHalf++];
        }
        // place the firstHalf into temp
        while (firstHalf<=mid){
            temp[i++] = input[firstHalf++];
        }
        //place the secondHalf into temp
        while (secondHalf<=tail){
            temp[i++] = input[secondHalf++];
        }
        //Drop what is sorted from Temp into Input
        i=0;
        while (front<=tail){
            input[front++] = temp[i++];
        }
    }

}

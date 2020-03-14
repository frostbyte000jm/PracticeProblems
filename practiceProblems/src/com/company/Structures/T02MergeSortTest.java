package com.company.Structures;

import java.util.Arrays;

public class T02MergeSortTest {

    public T02MergeSortTest(int[] arrNum){
        mergeSort(arrNum,0,arrNum.length-1);

        System.out.println("Merge Sort Test: "+ Arrays.toString(arrNum));
    }

    private void mergeSort(int[] arrNum, int front, int tail) {
        int mid = (tail + front)/2;

        if(front < tail){
            mergeSort(arrNum,front,mid);
            mergeSort(arrNum,mid+1,tail);
        }

        int i = 0, firstHalf = front, secondHalf = mid+1; //i is temp[] index
        int[] temp = new int[tail-front+1];

        while (firstHalf <= mid && secondHalf <= tail){
            temp[i++] = arrNum[firstHalf] < arrNum[secondHalf] ? arrNum[firstHalf++]: arrNum[secondHalf++];
        }
        while (firstHalf <= mid)
            temp[i++] = arrNum[firstHalf++];
        while (secondHalf <= tail)
            temp[i++] = arrNum[secondHalf++];
        i=0;
        while (front<=tail)
            arrNum[front++] = temp[i++];
    }
}

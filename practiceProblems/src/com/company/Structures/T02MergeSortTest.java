package com.company.Structures;

import java.util.Arrays;

public class T02MergeSortTest {

   public T02MergeSortTest(int[] arrNum){
       mergeSort(arrNum,0,arrNum.length-1);

       System.out.println("Merge Sort Results: "+Arrays.toString(arrNum));
   }

    private void mergeSort(int[] arrNum, int head, int tail) {
       int mid = (head + tail) /2;

       if(head<tail){
           mergeSort(arrNum,head,mid);
           mergeSort(arrNum,mid+1,tail);
       }

       int i=0,firstHalf = head, secondHalf = mid+1;
       int temp[] = new int[tail-head+1];

       while(firstHalf<=mid && secondHalf<=tail){
           temp[i++] = arrNum[firstHalf]<arrNum[secondHalf] ? arrNum[firstHalf++] : arrNum[secondHalf++];
       }
       while (firstHalf<=mid){
           temp[i++] = arrNum[firstHalf++];
       }
       while (secondHalf<=tail){
           temp[i++] = arrNum[secondHalf++];
       }
       i=0;
       while (head<=tail){
           arrNum[head++] = temp[i++];
       }
    }
}

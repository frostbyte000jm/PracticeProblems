package com.company;

import com.company.Structures.T01BubbleSort;
import com.company.Structures.T01BubbleSortTest;
import com.company.Structures.T02MergeSort;
import com.company.Structures.T02MergeSortTest;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        //Test Bubble Sort
        int[] arrNumTest = {87, 57, 370, 110, 90, 610, 02, 710, 140, 203, 150};
        //bubbleSort bs = new bubbleSort(arrNumTest);
        T01BubbleSortTest bst01 = new T01BubbleSortTest(arrNumTest);

        //int[] arrNumTest2 = {1,2,3,4,5,6};
        //T01BubbleSort bs2 = new T01BubbleSort(arrNumTest2);

        T02MergeSort ms1 = new T02MergeSort(arrNumTest);
        T02MergeSortTest ms2 = new T02MergeSortTest(arrNumTest);


    }
}

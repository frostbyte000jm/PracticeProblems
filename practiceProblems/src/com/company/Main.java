package com.company;

import com.company.Structures.T01BubbleSort;
import com.company.Structures.T01BubbleSortTest;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        //Test Bubble Sort
        int[] arrNumTest = {3,5,7,2,4,3,6,1};
        //bubbleSort bs = new bubbleSort(arrNumTest);
        T01BubbleSortTest bst01 = new T01BubbleSortTest(arrNumTest);

        int[] arrNumTest2 = {1,2,3,4,5,6};
        T01BubbleSort bs2 = new T01BubbleSort(arrNumTest2);


    }
}

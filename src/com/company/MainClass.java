package com.company;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int size = 0;
        for(int i : arr) {
            if ((i > 0) && (i % 2 == 0)) {
                size++;
            }
        }
        int[] newArr = new int[size];
        size = 0;
        for(int i : arr){
            if ((i > 0) && (i % 2 == 0)) {
                newArr[size++] = i;
            }
        }
        bubbleSort(newArr);
        for(int i : newArr){
            System.out.println(i);
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}

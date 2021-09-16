package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        for (int i : intList) {
            if ((i > 0) && (i % 2 == 0)) {
                newList.add(i);
            }
        }
        bubbleSort(newList);
        System.out.println(newList);
    }


    static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}

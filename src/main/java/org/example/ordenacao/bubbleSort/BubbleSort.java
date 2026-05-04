package org.example.ordenacao.bubbleSort;

public class BubbleSort {

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++){
            boolean trocou = false;
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            if(!trocou) break;

        }

        return array;
    }
}

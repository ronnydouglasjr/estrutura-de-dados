package org.example.ordenacao.bubbleSort;

public class BubbleSort {

  public static int[] sort(int[] array) {

    for (int i = 0; i < array.length; i++) {
      boolean trocou = false;
      for (int j = 1; j < array.length; j++) {

        int indice = j - 1;

        if (array[indice] > array[j]) {
          int temp = array[indice];
          array[indice] = array[j];
          array[j] = temp;
          trocou = true;
        }
      }
      if (!trocou) break;
    }

    return array;
  }
}

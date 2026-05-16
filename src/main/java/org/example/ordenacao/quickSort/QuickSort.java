package org.example.ordenacao.quickSort;

public class QuickSort {

  public void quickSort(int[] array, int inicio, int fim) {
    if (inicio < fim) {
      int meio = particionar(array, inicio, fim);

      quickSort(array, inicio, meio - 1);
      quickSort(array, meio + 1, fim);
    }
  }

  private int particionar(int[] array, int inicio, int fim) {
    int pivo = array[fim];

    int i = inicio - 1;

    for (int j = inicio; j < fim; j++) {
      if (array[j] <= pivo) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    int temp = array[i + 1];
    array[i + 1] = array[fim];
    array[fim] = temp;

    return i + 1;
  }
}

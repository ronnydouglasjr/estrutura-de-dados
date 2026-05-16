package org.example.ordenacao.mergeSort;

import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;

public class MergSortTest {

  @Test
  public void arrayVazio() {
    int[] array = {};
    int[] resultado = MergeSort.mergeSort(array);

    ArrayAsserts.assertArrayEquals(new int[] {}, resultado);
  }

  @Test
  public void arrayComTresElementos() {
    int[] array = {1, 5, 4};
    int[] resultado = MergeSort.mergeSort(array);

    ArrayAsserts.assertArrayEquals(new int[] {1, 4, 5}, resultado);
  }

  @Test
  public void arrayDesordenado() {
    int[] array = {1, 5, 4, 3, 2, 9, 8, 0, 6, 7, 10};
    int[] resultado = MergeSort.mergeSort(array);

    ArrayAsserts.assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, resultado);
  }
}

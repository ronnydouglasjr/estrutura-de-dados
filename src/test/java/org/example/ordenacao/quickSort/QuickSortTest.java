package org.example.ordenacao.quickSort;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuickSortTest {

  @Test
  public void deveOrdenarArrayDesordenado() {
    int[] array = {1, 5, 4, 3, 2};

    QuickSort quickSort = new QuickSort();
    quickSort.quickSort(array, 0, array.length - 1);

    Assert.assertEquals(array, new int[] {1, 2, 3, 4, 5});
  }

  @Test
  public void arrayComNumerosNegativos() {
    int[] array = {-1, -5, 3, 0, 2};

    QuickSort quickSort = new QuickSort();
    quickSort.quickSort(array, 0, array.length - 1);

    Assert.assertEquals(array, new int[] {-5, -1, 0, 2, 3});
  }
}

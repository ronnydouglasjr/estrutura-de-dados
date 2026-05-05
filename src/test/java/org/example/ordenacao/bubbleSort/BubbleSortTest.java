package org.example.ordenacao.bubbleSort;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

import org.testng.annotations.Test;

public class BubbleSortTest {

  @Test
  void deveOrdenarArrayDesordenado() {

    int[] array = {1, 5, 4, 3, 2};

    int[] resultado = BubbleSort.sort(array);

    assertArrayEquals(new int[] {1, 2, 3, 4, 5}, resultado);
  }
}

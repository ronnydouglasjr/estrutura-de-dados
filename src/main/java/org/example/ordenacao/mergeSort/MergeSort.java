package org.example.ordenacao.mergeSort;

import java.util.Arrays;

public class MergeSort {

  public static int[] mergeSort(int[] array) {
    if (array.length <= 1) return array;

    int meio = array.length / 2;

    int[] esquerdo = mergeSort(Arrays.copyOfRange(array, 0, meio));
    int[] direito = mergeSort(Arrays.copyOfRange(array, meio, array.length));

    return merge(esquerdo, direito);
  }

  private static int[] merge(int[] esquerdo, int[] direito) {
    int[] resultado = new int[esquerdo.length + direito.length];

    int indiceDoEsquerdo = 0;
    int indiceDoDireito = 0;
    int indiceDoResultado = 0;

    while (indiceDoEsquerdo < esquerdo.length && indiceDoDireito < direito.length) {
      if (esquerdo[indiceDoEsquerdo] < direito[indiceDoDireito]) {
        resultado[indiceDoResultado] = esquerdo[indiceDoEsquerdo];
        indiceDoEsquerdo++;
      } else {
        resultado[indiceDoResultado] = direito[indiceDoDireito];
        indiceDoDireito++;
      }
      indiceDoResultado++;
    }

    while (indiceDoEsquerdo < esquerdo.length) {
      resultado[indiceDoResultado] = esquerdo[indiceDoEsquerdo];
      indiceDoEsquerdo++;
      indiceDoResultado++;
    }

    while (indiceDoDireito < direito.length) {
      resultado[indiceDoResultado] = direito[indiceDoDireito];
      indiceDoDireito++;
      indiceDoResultado++;
    }

    return resultado;
  }
}

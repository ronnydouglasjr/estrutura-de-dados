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

    int indiceDoLadoEsquerdo = 0;
    int indiceDoLadoDireito = 0;
    int indiceDoResultado = 0;

    while (indiceDoLadoEsquerdo < esquerdo.length && indiceDoLadoDireito < direito.length) {
      if (esquerdo[indiceDoLadoEsquerdo] < direito[indiceDoLadoDireito]) {
        resultado[indiceDoResultado] = esquerdo[indiceDoLadoEsquerdo];
        indiceDoLadoEsquerdo++;
      } else {
        resultado[indiceDoResultado] = direito[indiceDoLadoDireito];
        indiceDoLadoDireito++;
      }
      indiceDoResultado++;
    }

    while (indiceDoLadoEsquerdo < esquerdo.length) {
      resultado[indiceDoResultado] = esquerdo[indiceDoLadoEsquerdo];
      indiceDoLadoEsquerdo++;
      indiceDoResultado++;
    }

    while (indiceDoLadoDireito < direito.length) {
      resultado[indiceDoResultado] = direito[indiceDoLadoDireito];
      indiceDoLadoDireito++;
      indiceDoResultado++;
    }

    return resultado;
  }
}

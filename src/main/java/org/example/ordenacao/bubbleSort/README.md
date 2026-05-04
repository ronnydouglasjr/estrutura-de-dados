# Bubble Sort

## O que é?

Bubble Sort é um dos algoritmos de ordenação mais simples. A ideia é percorrer o array várias vezes, comparando elementos adjacentes e trocando-os quando estão fora de ordem. A cada passagem, o maior elemento não ordenado "borbulha" até sua posição correta no final do array.

---

## Código

```java
package org.example.ordenacao.bubbleSort;

public class BubbleSort {

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            boolean trocou = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }

        return array;
    }
}
```

---

## Explicação linha a linha

### Loop externo — controla as passagens
```java
for (int i = 0; i < array.length; i++)
```
Cada iteração representa uma passagem completa pelo array. Após cada passagem, pelo menos um elemento estará na sua posição correta (o maior da parte não ordenada).

---

### Flag de otimização
```java
boolean trocou = false;
```
Começa como `false` em cada passagem. Se nenhuma troca ocorrer durante a passagem, significa que o array já está ordenado e podemos parar mais cedo.

---

### Loop interno — compara elementos adjacentes
```java
for (int j = 0; j < array.length - 1 - i; j++)
```
Percorre os elementos ainda não ordenados. O `- 1` evita acessar uma posição fora do array, e o `- i` pula os elementos que já foram ordenados nas passagens anteriores — não há necessidade de verificá-los novamente.

---

### Comparação e troca
```java
if (array[j] > array[j + 1]) {
    int temp = array[j];
    array[j] = array[j + 1];
    array[j + 1] = temp;
    trocou = true;
}
```
Se o elemento da esquerda for maior que o da direita, eles trocam de lugar. A variável `temp` guarda o valor temporariamente para não perdê-lo durante a troca. A flag `trocou` é marcada como `true` para indicar que houve pelo menos uma troca nessa passagem.

---

### Saída antecipada (otimização)
```java
if (!trocou) break;
```
Se após uma passagem completa nenhuma troca ocorreu, o array já está ordenado. O `break` interrompe o loop externo evitando iterações desnecessárias.

---

## Exemplo passo a passo

Array inicial: `[5, 3, 8, 1, 2]`

| Passagem | Comparações | Array após a passagem |
|----------|-------------|----------------------|
| 1ª       | 4           | `[3, 5, 1, 2, 8]`    |
| 2ª       | 3           | `[3, 1, 2, 5, 8]`    |
| 3ª       | 2           | `[1, 2, 3, 5, 8]`    |
| 4ª       | 1           | `[1, 2, 3, 5, 8]` ✅ sem trocas → para |

---

## Complexidade

| Caso         | Tempo    | Descrição                                      |
|--------------|----------|------------------------------------------------|
| Melhor caso  | O(n)     | Array já ordenado — sai na primeira passagem   |
| Caso médio   | O(n²)    | Elementos em ordem aleatória                   |
| Pior caso    | O(n²)    | Array em ordem inversa                         |
| Espaço       | O(1)     | Ordenação in-place, sem memória extra          |

---

## Teste

```java
package org.example.ordenacao;

import org.example.ordenacao.bubbleSort.BubbleSort;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class BubbleSortTest {

    @Test
    void deveOrdenarArrayDesordenado() {
        int[] array = {1, 5, 4, 3, 2};
        int[] resultado = BubbleSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, resultado);
    }
}
```

Para rodar os testes:
```bash
mvn test
```

---

## Quando usar?

O Bubble Sort é indicado apenas para fins **didáticos**. Para uso em produção com arrays grandes, prefira algoritmos mais eficientes como **Merge Sort** ou **Quick Sort**, que têm complexidade O(n log n).

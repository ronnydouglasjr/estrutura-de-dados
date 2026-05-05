# MergeSort em Java

Implementação do algoritmo de ordenação **Merge Sort** em Java, com código legível e nomes de variáveis em português.

---

## 📌 O que é o Merge Sort?

O Merge Sort é um algoritmo de ordenação baseado na estratégia **dividir para conquistar**. Ele divide o array ao meio recursivamente até que cada parte tenha apenas um elemento, e então **mescla** as partes de volta em ordem crescente.

---

## 🧠 Como funciona?

```
Array original: [38, 27, 43, 3, 9, 82, 10, 1]

              [38, 27, 43, 3, 9, 82, 10, 1]
                    /                  \
          [38, 27, 43, 3]          [9, 82, 10, 1]
             /       \               /        \
        [38, 27]    [43, 3]      [9, 82]    [10, 1]
         /    \      /    \      /    \      /    \
       [38]  [27]  [43]  [3]  [9]  [82]  [10]   [1]
         \    /      \    /     \    /      \    /
        [27, 38]    [3, 43]    [9, 82]     [1, 10]
              \        /            \        /
          [3, 27, 38, 43]        [1, 9, 10, 82]
                    \                  /
            [1, 3, 9, 10, 27, 38, 43, 82]
```

---

## 📂 Estrutura do código

```
src/
└── main/
    └── java/
        └── org/example/ordenacao/mergeSort/
            └── MergeSort.java
```

---

## 🔍 Explicação dos métodos

### `mergeSort(int[] array)` — público

Método principal que recebe o array desordenado e retorna um novo array ordenado.

**Passos:**
1. Caso base: se o array tem 0 ou 1 elemento, já está ordenado — retorna ele mesmo.
2. Calcula o índice do meio do array.
3. Chama `mergeSort` recursivamente para a metade **esquerda**.
4. Chama `mergeSort` recursivamente para a metade **direita**.
5. Combina as duas metades ordenadas chamando `merge`.

```java
public static int[] mergeSort(int[] array) {
    if (array.length <= 1) return array;

    int meio = array.length / 2;

    int[] esquerdo = mergeSort(Arrays.copyOfRange(array, 0, meio));
    int[] direito = mergeSort(Arrays.copyOfRange(array, meio, array.length));

    return merge(esquerdo, direito);
}
```

---

### `merge(int[] esquerdo, int[] direito)` — privado

Recebe dois arrays **já ordenados** e os combina em um único array ordenado.

**Passos:**
1. Cria um array resultado com o tamanho total dos dois arrays.
2. Percorre os dois arrays simultaneamente, comparando elemento a elemento.
3. O menor elemento entre os dois é inserido no resultado.
4. Ao esgotar um dos lados, copia os elementos restantes do esquerdo, se houver, e depois os do direito, se houver.

```java
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
```

---

## ⚙️ Como usar

```java
int[] array = {38, 27, 43, 3, 9, 82, 10, 1};
int[] ordenado = MergeSort.mergeSort(array);

System.out.println(Arrays.toString(ordenado));
// Saída: [1, 3, 9, 10, 27, 38, 43, 82]
```

---

## 📊 Complexidade

| Caso        | Tempo       | Espaço  |
|-------------|-------------|---------|
| Melhor caso | O(n log n)  | O(n)    |
| Caso médio  | O(n log n)  | O(n)    |
| Pior caso   | O(n log n)  | O(n)    |

> O Merge Sort sempre divide o array ao meio, independente dos dados, por isso sua complexidade de tempo é sempre **O(n log n)** — mesmo no pior caso.

## 🛠️ Requisitos

- Java 8 ou superior

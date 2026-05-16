# QuickSort em Java

Implementação do algoritmo de ordenação **QuickSort** em Java, utilizando a estratégia de particionamento com pivô no último elemento.

---

## Como funciona

O QuickSort é um algoritmo de ordenação por divisão e conquista. Ele funciona em duas etapas principais:

1. **Particionamento** — escolhe um pivô (neste caso, o último elemento do subarray) e reorganiza os elementos de forma que todos os menores ou iguais ao pivô fiquem à sua esquerda, e os maiores à sua direita.

2. **Recursão** — aplica o mesmo processo recursivamente nas duas metades resultantes do particionamento.

### Exemplo visual

```
Array inicial: [3, 6, 8, 10, 1, 2, 1]
                                    ↑ pivô = 1

Após particionar: [1, 1, 8, 10, 3, 2, 6]
                   ↑ pivô posicionado

Recursão na metade esquerda e direita...

Array final:    [1, 1, 2, 3, 6, 8, 10] ✓
```

---

## Estrutura do código

```
src/
└── main/
    └── java/
        └── org/
            └── example/
                └── ordenacao/
                    └── quickSort/
                        └── QuickSort.java
```

### Métodos

| Método | Visibilidade | Descrição |
|---|---|---|
| `quickSort(int[] array, int inicio, int fim)` | `public` | Método principal que aplica o QuickSort recursivamente |
| `particionar(int[] array, int inicio, int fim)` | `private` | Reorganiza o array em torno do pivô e retorna sua posição final |

---

## Como usar

```java
int[] numeros = {5, 2, 9, 1, 7, 3};

QuickSort qs = new QuickSort();
qs.quickSort(numeros, 0, numeros.length - 1);

// numeros agora: [1, 2, 3, 5, 7, 9]
```

---

## Complexidade

| Caso | Tempo | Espaço |
|---|---|---|
| Melhor caso | O(n log n) | O(log n) |
| Caso médio | O(n log n) | O(log n) |
| Pior caso (array já ordenado) | O(n²) | O(n) |

> **Pior caso** ocorre quando o pivô escolhido é sempre o menor ou maior elemento (ex: array já ordenado com pivô no último elemento). Para evitar isso, pode-se usar uma estratégia de pivô aleatório ou mediana de três.

---

## Requisitos

- Java 8 ou superior

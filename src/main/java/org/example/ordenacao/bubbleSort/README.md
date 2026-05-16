# 🫧 Bubble Sort

Implementação do algoritmo **Bubble Sort** em Java, com otimização de parada antecipada para melhor desempenho em arrays parcialmente ordenados.

---

## 📌 Sobre o algoritmo

O Bubble Sort é um algoritmo de ordenação por comparação que percorre repetidamente o array, compara elementos adjacentes e os troca de posição quando estão fora de ordem. A cada passagem, o maior elemento "borbulha" para o final do array.

Esta implementação inclui uma otimização: se nenhuma troca for realizada em uma passagem completa, o array já está ordenado e o algoritmo para imediatamente.

---

## ⚙️ Como funciona

Dado o array `[5, 3, 8, 1, 2]`:

| Passagem | Array               | Trocas |
|----------|---------------------|--------|
| 1ª       | `[3, 5, 1, 2, 8]`  | Sim    |
| 2ª       | `[3, 1, 2, 5, 8]`  | Sim    |
| 3ª       | `[1, 2, 3, 5, 8]`  | Sim    |
| 4ª       | `[1, 2, 3, 5, 8]`  | Não → para |

---

## 📁 Estrutura

```
src/
└── main/
    └── java/
        └── org/
            └── example/
                └── ordenacao/
                    └── bubbleSort/
                        └── BubbleSort.java
```

---

## 🚀 Como usar

```java
int[] array = {5, 3, 8, 1, 2};
int[] ordenado = BubbleSort.sort(array);

System.out.println(Arrays.toString(ordenado));
// Saída: [1, 2, 3, 5, 8]
```

> **Atenção:** o método ordena o array **in-place**, ou seja, o array original é modificado.

---

## 📊 Complexidade

| Caso         | Tempo    | Espaço |
|--------------|----------|--------|
| Melhor caso  | O(n)     | O(1)   |
| Caso médio   | O(n²)    | O(1)   |
| Pior caso    | O(n²)    | O(1)   |

- **Melhor caso O(n):** ocorre quando o array já está ordenado — a flag `trocou` evita passagens desnecessárias.
- **Estável:** sim, elementos iguais mantêm a ordem relativa.
- **In-place:** não utiliza memória auxiliar proporcional ao tamanho do array.

---

## 🔍 Detalhes da implementação

```java
boolean trocou = false;
```
Flag que detecta se houve alguma troca na passagem atual. Caso não haja, o loop externo é interrompido via `break`, evitando iterações desnecessárias.

```java
for (int j = 1; j < array.length - i; j++)
```
O limite `array.length - i` garante que os últimos `i` elementos (já ordenados) não sejam comparados novamente, reduzindo comparações redundantes.

---

## ✅ Quando usar

| ✅ Indicado para                        | ❌ Evitar quando                        |
|-----------------------------------------|-----------------------------------------|
| Arrays pequenos                         | Arrays grandes (preferir QuickSort/MergeSort) |
| Arrays quase ordenados                  | Performance é crítica                   |
| Fins didáticos e aprendizado            | Ambiente de produção com alto volume    |
package com.casefile.animator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Esta classe contém algoritmos deliberadamente corrompidos. Seu objetivo
 * como detetive é identificar os problemas, corrigir o código e
 * documentar a correção. Cada método aqui possui um identificador de caso
 * (por exemplo, B‑01 ou S‑01) que você deve referenciar ao registrar suas
 * descobertas.
 */
public class CorruptedAlgorithms {

    /**
     * Caso B-01: Implementação corrompida do algoritmo Bubble Sort.
     *
     * Este método deveria ordenar uma lista de inteiros em ordem crescente,
     * mas contém um erro no laço externo que impede a ordenação completa.
     * O resultado atual pode não incluir todos os elementos na comparação
     * final, deixando a lista parcialmente desordenada.
     *
     * @param valores lista de inteiros a ser ordenada
     * @return uma nova lista com os mesmos valores (não necessariamente ordenada)
     */
    public static List<Integer> bubbleSort(List<Integer> valores) {
        // Cria uma cópia para não modificar a lista original
        List<Integer> list = new ArrayList<>(valores);
        int n = list.size();
        // BUG: o laço externo deveria ir até n-1. Aqui vai até n-2, o que faz
        // com que o último elemento nunca seja considerado.
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
        return list;
    }

    /**
     * Caso S-01: Busca sequencial corrompida em uma lista de inteiros.
     *
     * Este método deveria percorrer a lista e retornar {@code true} ao
     * encontrar o número alvo. Entretanto, ele nunca retorna {@code true},
     * mesmo quando o elemento está presente, devido a uma instrução de retorno
     * incorreta. O estudante deve identificar o erro e corrigi‑lo.
     *
     * @param valores lista de inteiros em que procurar
     * @param alvo o valor a ser encontrado
     * @return {@code true} se o valor estiver presente; caso contrário, {@code false}
     */
    public static boolean sequentialSearch(List<Integer> valores, int alvo) {
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) == alvo) {
                // BUG: deveria retornar true quando encontrar o alvo
                return false;
            }
        }
        return false;
    }
}
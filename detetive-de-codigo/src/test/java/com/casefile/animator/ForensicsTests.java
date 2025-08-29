package com.casefile.animator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Testes automatizados para o Desafio do Detetive de Código. Estes testes
 * definem o comportamento esperado dos algoritmos após a correção. No
 * início, os testes falharão, pois os algoritmos estão corrompidos. Após
 * corrigir os métodos em {@link CorruptedAlgorithms}, os testes devem
 * passar.
 */
public class ForensicsTests {

    @Test
    void bubbleSort_sortsAscending() {
        List<Integer> entrada = Arrays.asList(5, 3, 4, 1, 2);
        List<Integer> esperado = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(esperado, CorruptedAlgorithms.bubbleSort(entrada),
            "O Bubble Sort deveria ordenar a lista em ordem crescente");
    }

    @Test
    void bubbleSort_handlesAlreadySorted() {
        List<Integer> entrada = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> esperado = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(esperado, CorruptedAlgorithms.bubbleSort(entrada),
            "O Bubble Sort deveria manter uma lista já ordenada");
    }

    @Test
    void sequentialSearch_findsExisting() {
        List<Integer> entrada = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(CorruptedAlgorithms.sequentialSearch(entrada, 3),
            "A busca sequencial deveria retornar true ao encontrar o valor");
    }

    @Test
    void sequentialSearch_returnsFalseWhenAbsent() {
        List<Integer> entrada = Arrays.asList(1, 2, 3, 4, 5);
        assertFalse(CorruptedAlgorithms.sequentialSearch(entrada, 10),
            "A busca sequencial deveria retornar false quando o valor não está na lista");
    }
}
package com.casefile.animator;

import java.util.Arrays;
import java.util.List;

/**
 * Interface simples para demonstrar os algoritmos corrompidos. Esta classe
 * imprime no console a lista original, tenta ordená‑la usando Bubble Sort
 * corrompido e depois realiza buscas sequenciais. A intenção é ajudar o
 * estudante a reproduzir o erro visualmente antes de entrar nos testes.
 */
public class AnimatorGUI {

    /**
     * Executa a demonstração dos algoritmos. Gera uma lista de números,
     * imprime o estado inicial, executa o Bubble Sort e mostra o resultado,
     * e em seguida testa a busca sequencial.
     */
    public void run() {
        List<Integer> numeros = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println("Lista original: " + numeros);
        List<Integer> ordenada = CorruptedAlgorithms.bubbleSort(numeros);
        System.out.println("Lista ordenada (B‑01): " + ordenada);

        int alvoPresente = 3;
        int alvoAusente = 10;
        boolean resultadoPresente = CorruptedAlgorithms.sequentialSearch(numeros, alvoPresente);
        boolean resultadoAusente = CorruptedAlgorithms.sequentialSearch(numeros, alvoAusente);
        System.out.println("Busca por " + alvoPresente + " (S‑01): " + resultadoPresente);
        System.out.println("Busca por " + alvoAusente + " (S‑01): " + resultadoAusente);
    }
}
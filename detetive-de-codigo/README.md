# Desafio do Detetive de Código: Briefing da Missão

Bem‑vindo ao **Desafio do Detetive de Código**! Você foi convocado para integrar a força especial de Análise Forense Digital. Sua missão é analisar um caso de software corrompido, descobrir a causa raiz e neutralizar a ameaça. Nesta jornada você irá utilizar técnicas de depuração, testes automatizados e, por fim, redigir o *Arquivamento Oficial do Caso* para que outros detetives possam aprender com sua descoberta.

## Protocolo da Investigação (Regras de Engajamento)

Para garantir que nenhuma pista escape e que a investigação seja conduzida de maneira profissional, siga estes passos em ordem:

1. **Analise a Cena do Crime.** Inicie o programa e observe o comportamento inesperado. Em seguida, execute os testes fornecidos para ver o que falha. Preste atenção às mensagens de erro – elas são as primeiras pistas.

2. **Colete as Evidências.** Use o depurador (debugger) de sua IDE favorita para examinar o estado interno do código. A cada descoberta, registre suas observações no arquivo `RELATORIO_FORENSE.md`. Descrever o sintoma, a causa e o local do bug fará diferença na avaliação.

3. **Neutralize a Ameaça.** Corrija o código no arquivo apropriado até que todos os testes passem. Lembre‑se de que as correções devem ser cirúrgicas: apenas o necessário para que o algoritmo volte a se comportar corretamente.

4. **Arquive o Caso (NOVO).** Um bom detetive deixa um rastro de papel limpo. Depois de eliminar o bug, você deve documentar oficialmente sua solução. Adicione um comentário Javadoc completo acima do método que corrigiu. Este resumo é crucial para futuros detetives! Inclua a tag personalizada `@correction-log` para descrever o erro encontrado e como foi corrigido.

5. **Feche o Caso.** Faça o commit de suas modificações usando a mensagem padronizada: `case-closed: Descreve a solução – Caso XXX`. Substitua `XXX` pelo identificador do caso corrigido (por exemplo, `B-01` ou `S-01`).

## Como Arquivar um Caso (Padrão Javadoc)

O Arquivamento Oficial deve ser sucinto e completo. A estrutura do comentário Javadoc deve seguir o modelo abaixo. Explique o que o método faz, seus parâmetros, o valor retornado e, principalmente, registre sua investigação na tag `@correction-log`.

```java
/**
 * Ordena uma lista de inteiros utilizando o algoritmo Bubble Sort.
 * Este método foi alvo de uma investigação forense que corrigiu uma
 * falha crítica no loop principal.
 *
 * @param valores a lista de inteiros a ser ordenada
 * @return a lista ordenada
 *
 * @correction-log Caso B-01: O loop externo não percorria o último
 * elemento. A condição foi ajustada de 'n-2' para 'n-1' para garantir a
 * cobertura completa da lista.
 */
public List<Integer> bubbleSort(List<Integer> valores) {
    // ... código ...
}
```

Adapte o conteúdo às suas correções. Cada caso possui um identificador (por exemplo, `Caso B-01` ou `Caso S-01`). Use esse identificador na tag `@correction-log` ao documentar o método afetado.

## Catálogo de Casos Abertos

Os algoritmos abaixo contém falhas sutis que precisam de sua perícia:

- **Caso B-01 – Bubble Sort Corrompido:** o algoritmo de ordenação Bubble Sort não está percorrendo todos os elementos da lista. O resultado final não fica ordenado corretamente. Identifique o problema e corrija o laço.
- **Caso S-01 – Busca Sequencial Falha:** a busca sequencial deveria retornar `true` quando encontra o número em uma lista, mas sempre retorna `false`, mesmo quando o valor está presente. Descubra por quê e repare o erro.

Resolva cada caso seguindo o protocolo. Sua destreza em registrar evidências e documentar soluções será valorizada tanto quanto a correção em si.

Boa investigação!
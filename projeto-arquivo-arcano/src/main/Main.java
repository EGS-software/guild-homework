/**
 * @author jawc-05
 */
package main;

import hashtable.TabelaHash;
import model.Pergaminho;

public class Main {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" GUILDA 3: O ARQUIVO ARCANO - BIBLIOTECA DA BRASILÂNDIA");
        System.out.println("==================================================\\n");

        int M = 7; // M primo para facilitar a visualização de colisões
        TabelaHash tabela = new TabelaHash(M);

        System.out.println("--- 1. ESTADO INICIAL DA TABELA ---");
        tabela.exibirTabela();

        System.out.println("--- 2. INSERÇÃO E COLISÕES INTENCIONAIS ---");
        // Chaves 7, 14 e 21 colidem todas no índice 0 (mod 7 = 0)
        tabela.inserir(new Pergaminho(7, "Grimório de Fogo", "Arcana", 85));
        tabela.inserir(new Pergaminho(14, "Códice do Gelo", "Elementar", 90));
        tabela.inserir(new Pergaminho(21, "Pergaminho do Trovão", "Evocação", 95));
        tabela.inserir(new Pergaminho(10, "Runa do Vazio", "Adivinhação", 70)); // mod 7 = 3
        tabela.inserir(new Pergaminho(17, "Selo da Proteção", "Invocação", 80)); // mod 7 = 3

        System.out.println("\n--- Testando Inserção de Chave Duplicada (ID 14) ---");
        tabela.inserir(new Pergaminho(14, "Códice Duplicado", "Ilegal", 0));

        tabela.exibirTabela();

        System.out.println("--- 3. BUSCA E CONTAGEM DE COMPARAÇÕES ---");
        tabela.buscar(21); // 1 comparação (topo da lista)
        tabela.buscar(7); // 3 comparações (final da lista)
        tabela.buscar(99); // busca por chave inexistente

        System.out.println("\n--- 4. REMOÇÃO NO CONJUNTO DE COLISÕES ---");
        tabela.remover(14); // Remove nó do meio da colisão do índice 0
        tabela.exibirTabela();

        System.out.println("--- 5. VERIFICAÇÃO DE ACESSO PÓS-REMOÇÃO ---");
        tabela.buscar(21);
        tabela.buscar(7);
    }
}
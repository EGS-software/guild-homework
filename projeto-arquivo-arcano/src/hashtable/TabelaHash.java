/**
 * @author jawc
 */
package hashtable;

import model.Pergaminho;

public class TabelaHash {
    private NoHash[] tabela;
    private int M;
    private int quantidade;

    public TabelaHash(int tamanho){
        if (tamanho <= 0) throw new IllegalArgumentException("O tamanho deve ser maior que zero!!!");
        this.M = tamanho;
        this.tabela = new NoHash[this.M];
        this.quantidade = 0;
    }

    // Função de Dispersão: h(chave) = |chave| mod M
    private int h(int chave) {
        return Math.abs(chave) % M;
    }

    public boolean inserir(Pergaminho pergaminho) {
        if (pergaminho == null) return false;
        int indice = h(pergaminho.getId());

        //VERIFICACAO DE CHAVE DUPLICADA
        NoHash atual = tabela[indice];
        while (atual != null) {
            if (atual.getPergaminho().getId() == pergaminho.getId()){
                System.out.println("ERRO!!!: Chave "+pergaminho.getId()+" já existe na tabela!!!");
                return false;
            }
            atual = atual.getProximo();
        }
        // Inserção no início da lista (O(1))
        NoHash novo = new NoHash(pergaminho);
        novo.setProximo(tabela[indice]);
        tabela[indice] = novo;
        quantidade++;
        return true;
    }

    public Pergaminho buscar(int id){
        int indice = h(id);
        NoHash atual = tabela[indice];
        int comparacoes = 0;

        while (atual != null) {
            comparacoes++;
            if (atual.getPergaminho().getId() == id){
                System.out.printf("Busca ID %d -> Encontrado no índice [%d] em %d comparação(ões).\n", id, indice, comparacoes);
                return atual.getPergaminho();
            }
            atual = atual.getProximo();
        }

        System.out.printf("Busca ID %d -> Não encontrado (%d comparações no índice [%d].\n)", id, comparacoes, indice);
        return null;
    }

    public boolean remover(int id){
        int indice = h(id);
        NoHash atual = tabela[indice];
        NoHash anterior = null;

        while (atual != null) {
            if (atual.getPergaminho().getId() == id){
                if (anterior == null) {
                    tabela[indice] = atual.getProximo();
                } else {
                    anterior.setProximo(atual.getProximo());
                }
                quantidade--;
                System.out.printf("Pergaminho ID %d removido com sucesso do índice [%d].\n", id, indice);
                return true;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
        System.out.printf("Falha ao remover: Pergaminho ID %d não encontrado\n", id);
        return false;
    }

    public void exibirTabela(){
        System.out.println("\n========== ESTADO DA TABELA HASH ==========");
        for (int i = 0; i < M; i++) {
            System.out.printf("[%d] -> ", i);
            NoHash atual = tabela[i];
            if (atual == null) {
                System.out.print("[VAZIO]!!!");
            } else {
                while (atual != null) {
                    System.out.print(atual.getPergaminho() + "-> ");
                    atual = atual.getProximo();
                }
                System.out.print("null");
            }
            System.out.println();
        }
        System.out.printf("Fator de Carga (alpha = N/M): %.2f (%d elementos em %d posições\n", calcularFatorDeCarga(), quantidade, M);
        System.out.println("===========================================\\n");
    }

    private double calcularFatorDeCarga() {
        return (double) quantidade / M;
    }


}

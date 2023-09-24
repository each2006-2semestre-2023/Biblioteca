package com.biblioteca;

public class LivroVenda {

    public LivroEstoque livroDoEstoque;
    public int quantidade;

    public LivroVenda() {

    }

    public LivroVenda(LivroEstoque livroDoEstoque, int quantidade) {
        this.livroDoEstoque = livroDoEstoque;
        this.quantidade = quantidade;
    }

    /*
     * Incrementa um exemplar
     */
    public void IncrementarQuantidade() {
        this.quantidade++;
    }

    /*
     * Incrementa um exemplar
     */
    public void IncrementarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    /*
     * Retorna true se conseguiu pode decrementar ou false se a quantidade já for 0
     */
    public boolean DecrementarQuantidade() {
        if (this.quantidade == 0) {
            return false;
        } else {
            this.quantidade--;
            return true;
        }
    }

    /*
     * Retorna true se conseguiu pode decrementar ou false se a quantidade não for possível decrementar
     */
    public boolean DecrementarQuantidade(int quantidade) {
        if (this.quantidade < quantidade) {
            return false;
        } else {
            this.quantidade -= quantidade;
            return true;
        }
    }

}
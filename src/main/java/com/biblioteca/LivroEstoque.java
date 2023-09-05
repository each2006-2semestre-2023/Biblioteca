package com.biblioteca;

public class LivroEstoque {
    public Livro livro;
    public int exemplares;
    public double valor;

    public LivroEstoque() {

    }

    public LivroEstoque(Livro livro, int exemplares, double valor) {
        this.livro = livro;
        this.exemplares = exemplares;
        this.valor = valor;
    }

    /*
     * Incrementa um exemplar
     */
    public void IncrementarExemplar() {
        this.exemplares++;
    }

    /*
     * Retorna true se conseguiu pode decrementar ou false se a quantidade já for 0
     */
    public boolean DecrementarExemplar() {
        if (this.exemplares == 0) 
        {
            return false;
        } else {
            this.exemplares--;
            return true;
        }
    }
}

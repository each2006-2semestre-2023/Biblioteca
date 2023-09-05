package com.biblioteca;
import java.util.List;

public class Venda {

    public String nomeCliente;
    public String formaPagamento;
    public  double valorDado;
    public List<LivroVenda> livros;

    public Venda() {

    }

    public Venda(String nomeCliente, String formaPagamento, double valorDado, List<LivroVenda> livros) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.valorDado = valorDado;
        this.livros = livros;
    }
}
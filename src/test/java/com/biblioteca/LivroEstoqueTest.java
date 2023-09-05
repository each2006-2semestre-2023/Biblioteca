package com.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class LivroEstoqueTest {

    @Test
    public void testConstrutorComParametros() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);

        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

        Assert.assertEquals(livro, livroEstoque.livro);
        Assert.assertEquals(10, livroEstoque.exemplares);
        Assert.assertEquals(50.0, livroEstoque.valor, 0.01);
    }

    @Test
    public void testConstrutorPadrao() {
        LivroEstoque estoquePadrao = new LivroEstoque();
        Assert.assertNull(estoquePadrao.livro);
        Assert.assertEquals(0, estoquePadrao.exemplares);
        Assert.assertEquals(0.0, estoquePadrao.valor, 0.01);
    }

    @Test
    public void testIncrementarExemplar() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);

        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

        livroEstoque.IncrementarExemplar();
        Assert.assertEquals(11, livroEstoque.exemplares);
        Assert.assertEquals(50.0, livroEstoque.valor, 0.01);
    }

    @Test
    public void testDecrementarExemplarComExemplaresDisponiveis() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);
        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

        Assert.assertTrue(livroEstoque.DecrementarExemplar());
        Assert.assertEquals(9, livroEstoque.exemplares);
        Assert.assertEquals(50.0, livroEstoque.valor, 0.01);
    }

    @Test
    public void testDecrementarExemplarSemExemplaresDisponiveis() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);
        LivroEstoque livroEstoque = new LivroEstoque(livro, 0, 50.0);

        Assert.assertFalse(livroEstoque.DecrementarExemplar());
        Assert.assertEquals(0, livroEstoque.exemplares);
        Assert.assertEquals(50.0, livroEstoque.valor, 0.01);
    }
}

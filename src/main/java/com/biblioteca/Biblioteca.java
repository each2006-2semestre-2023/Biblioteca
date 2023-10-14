package com.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    final ArrayList<Livro> livros;
    final ArrayList<Autor> autores;
    final ArrayList<Editora> editoras;
    final ArrayList<LivroEstoque> estoque;

    public Biblioteca() {
        livros = new ArrayList<Livro>();
        autores = new ArrayList<Autor>();
        editoras = new ArrayList<Editora>();
        estoque = new ArrayList<LivroEstoque>();
    }

    public void AdicionarLivro(Livro livro) {
        for (Livro l : livros) {
            if (l.isbn.equals(livro.isbn)) {
                throw new IllegalArgumentException("Já existe um livro com o mesmo ISBN na biblioteca.");
            }
        }
        this.livros.add(livro);
    }

    public void RemoverLivro(Livro livro) {
        Livro livroARemover = null;
        for (Livro l : livros) {
            if (l.isbn.equals(livro.isbn)) {
                livroARemover = l;
            }
        }
        if (livroARemover == null)
            throw new IllegalArgumentException("Não existe um livro com este ISBN na biblioteca.");
        else
            this.livros.remove(livroARemover);
    }

    public void AdicionarAutor(Autor autor) {
        for (Autor a : autores) {
            if (a.nome.equals(autor.nome) && a.sobrenome.equals(autor.sobrenome)) {
                throw new IllegalArgumentException("Já existe um autor com o mesmo nome e sobrenome na biblioteca.");
            }
        }
        this.autores.add(autor);
    }

    public void RemoverAutor(Autor autor) {
        Autor aremover = null;
        for (Autor a : autores) {
            if (a.nome.equals(autor.nome) && a.sobrenome.equals(autor.sobrenome)) {
                aremover = a;
            }
        }
        if (aremover == null)
            throw new IllegalArgumentException("Não existe um autor com este nome e sobrenome na biblioteca.");
        else
            this.autores.remove(aremover);
    }

    public void AdicionarEditora(Editora editora) {
        for (Editora e : editoras) {
            if (e.nome.equals(editora.nome)) {
                throw new IllegalArgumentException("Já existe uma editora com o mesmo nome na biblioteca.");
            }
        }
        this.editoras.add(editora);
    }

    public void RemoverEditora(Editora editora) 
    {
        Editora aremover = null;
        for (Editora e : editoras) {
            if (e.nome.equals(editora.nome)) {
                aremover = e;
            }
        }
        if (aremover == null)
            throw new IllegalArgumentException("Não existe uma editora com este nome na biblioteca.");
        else
            this.editoras.remove(aremover);
    }

    public void AdicionarEstoque(LivroEstoque livroEstoque) {
         for (LivroEstoque e : estoque) {
            if (e.livro.isbn.equals(livroEstoque.livro.isbn)) {
                throw new IllegalArgumentException("Já existe um livro no estoque com este ISBN na biblioteca.");
            }
        }
        this.estoque.add(livroEstoque);
    }

    public void RemoverEstoque(LivroEstoque livroEstoque) {
        
        LivroEstoque aremover = null;
        for (LivroEstoque e : estoque) {
            if (e.livro.isbn.equals(livroEstoque.livro.isbn)) {
                aremover = e;
            }
        }
        if (aremover == null)
            throw new IllegalArgumentException("Não existe um livro no estoque com este ISBN na biblioteca.");
        else
            this.estoque.remove(aremover);
    }
}

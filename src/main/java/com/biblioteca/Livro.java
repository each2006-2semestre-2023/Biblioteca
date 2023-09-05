package com.biblioteca;
public class Livro {

    public Autor autor;
    public Editora editora;
    public String isbn;
    public String titulo;
    public int paginas;

    public Livro() {

    }

    public Livro(Autor autor, Editora editora, String isbn, String titulo, int paginas) {
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.titulo = titulo;
        this.paginas = paginas;
    }

}
package com.example.noticial_estadao.entity;
import java.util.Date;
public class Noticia {
    private int id;
    private String titulo;
    private Date dataPublicacao;
    private String conteudo;
    private Autor autor;

    public Noticia(int id, String titulo, Date dataPublicacao, String conteudo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.conteudo = conteudo;
        this.autor = autor;
    }
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }


    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Autor getAutor() {
        return autor;
    }
}

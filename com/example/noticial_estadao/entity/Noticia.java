package com.example.noticial_estadao.entity;
import java.text.SimpleDateFormat;
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


    public String getDataPublicacao() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(dataPublicacao);
    }

    public String getConteudo() {
        return conteudo;
    }

    public Autor getAutor() {
        return autor;
    }
}

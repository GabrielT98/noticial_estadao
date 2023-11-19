package com.example.noticial_estadao.model;
import com.example.noticial_estadao.entity.Autor;
import com.example.noticial_estadao.entity.Noticia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.*;
public class NoticiaModel{
    private List<Noticia> noticias;
    public NoticiaModel() {
        this.noticias = new ArrayList<>();
        Autor autor1 = new Autor(1, "João Silva", "Reporter");
        Autor autor2 = new Autor(2, "Maria Fernandes", "Colunista");
        noticias.add(new Noticia(1, "Título da Notícia 1", new Date(), "Conteúdo da notícia 1", autor1));
        noticias.add(new Noticia(2, "Título da Notícia 2", new Date(), "Conteúdo da notícia 2", autor2));
        noticias.add(new Noticia(3, "Título da Notícia 3", new Date(), "Conteúdo da notícia 3", autor1));
        noticias.add(new Noticia(4, "Título da Notícia 4", new Date(), "Conteúdo da notícia 4", autor2));
        noticias.add(new Noticia(5, "Título da Notícia 5", new Date(), "Conteúdo da notícia 5", autor1));
        noticias.add(new Noticia(6, "Título da Notícia 6", new Date(), "Conteúdo da notícia 6", autor2));
    }

    public List<Noticia> buscarUltimas() {
        int start = Math.max(0, noticias.size() - 5);
        return new ArrayList<>(noticias.subList(start, noticias.size()));
    }

    public List<Noticia> buscarPorId(int id) {
        return this.noticias.stream().filter(n-> n.getId() == id).collect(Collectors.toList());
    }
}

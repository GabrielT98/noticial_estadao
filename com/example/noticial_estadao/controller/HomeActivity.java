package com.example.noticial_estadao.controller;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.noticial_estadao.NoticiaAdapter;
import com.example.noticial_estadao.R;
import com.example.noticial_estadao.entity.Noticia;
import com.example.noticial_estadao.model.NoticiaModel;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private NoticiaModel noticiaModel;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        noticiaModel = new NoticiaModel();
        List<Noticia> ultimasNoticias = noticiaModel.buscarUltimas();
        NoticiaAdapter adapter = new NoticiaAdapter(this, ultimasNoticias);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Obtenha a notícia clicada
                Noticia noticiaClicada = ultimasNoticias.get(position);

                // Crie uma Intent para abrir a tela de detalhes
                Intent intent = new Intent(HomeActivity.this, NoticiaActivity.class);

                // Passe os dados da notícia para a atividade de detalhes
                intent.putExtra("titulo", noticiaClicada.getTitulo());
                intent.putExtra("conteudo", noticiaClicada.getConteudo());

                // Inicie a nova atividade
                startActivity(intent);
            }

        });
    }


}

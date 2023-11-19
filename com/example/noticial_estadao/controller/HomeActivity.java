package com.example.noticial_estadao.controller;
import android.os.Bundle;
import android.widget.ListView;
import com.example.noticial_estadao.R;
import com.example.noticial_estadao.entity.Noticia;
import com.example.noticial_estadao.model.NoticiaModel;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private NoticiaModel noticiaModel;
    private ListView listViewNoticias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        noticiaModel = new NoticiaModel();
        List<Noticia> ultimasNoticias = noticiaModel.buscarUltimas();
    }
}

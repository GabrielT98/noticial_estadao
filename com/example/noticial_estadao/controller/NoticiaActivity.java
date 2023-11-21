package com.example.noticial_estadao.controller;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.noticial_estadao.R;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class NoticiaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noticia);


        String titulo = getIntent().getStringExtra("titulo");
        String conteudo = getIntent().getStringExtra("conteudo");

        TextView tituloTextView = findViewById(R.id.tituloTextView);
        TextView conteudoTextView = findViewById(R.id.conteudoTextView);

        tituloTextView.setText(titulo);
        conteudoTextView.setText(conteudo);


        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}

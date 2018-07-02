package ilusoesindustriais.com.locadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Generos extends AppCompatActivity {

    private ImageView acao;
    private ImageView animacao;
    private ImageView aventura;
    private ImageView comedia;
    private ImageView scifi;
    private ImageView terror;
    private ImageView documentario;
    private ImageView musical;
    private ImageView guerra;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generos);

        acao = findViewById(R.id.acaoId);
        animacao = findViewById(R.id.animacaoId);
        aventura = findViewById(R.id.aventuraId);
        comedia = findViewById(R.id.comediaId);
        scifi = findViewById(R.id.scifiId);
        terror = findViewById(R.id.terrorId);
        documentario = findViewById(R.id.documentarioId);
        musical = findViewById(R.id.musicalId);
        guerra = findViewById(R.id.guerraId);


        acao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Generos.this, Acao.class));
            }
        });

        animacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Generos.this, Animacao.class));
            }
        });

        aventura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Generos.this, Aventura.class));
            }
        });

        comedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Generos.this, Comedia.class));
            }
        });

        scifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Generos.this, Scifi.class));
            }
        });

        terror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Generos.this, Terror.class));
            }
        });

        documentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Generos.this, Documentario.class));
            }
        });

        musical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Generos.this, Musical.class));
            }
        });

        guerra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Generos.this, Guerra.class));
            }
        });






    }
}

package ilusoesindustriais.com.locadora;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Animacao extends AppCompatActivity {

    private ImageView seta2;
    private TextView setaTexto2;

    private ImageView dragon;
    private ImageView nemo;
    private ImageView panda;
    private ImageView mente;
    private ImageView toy;
    private ImageView gelo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacao);


        seta2 = findViewById(R.id.setaId2);
        setaTexto2 = findViewById(R.id.setaTextoId2);

        dragon = findViewById(R.id.dragonId);
        nemo = findViewById(R.id.nemoId);
        panda = findViewById(R.id.pandaId);
        mente = findViewById(R.id.menteId);
        toy = findViewById(R.id.toyId);
        gelo = findViewById(R.id.geloId);


        seta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animacao.this, Generos.class));
            }
        });

        setaTexto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animacao.this, Generos.class));
            }
        });



        dragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animacao.this, Dragon.class));
            }
        });

        nemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animacao.this, Nemo.class));
            }
        });

        panda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animacao.this, Panda.class));
            }
        });

        mente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animacao.this, Mente.class));
            }
        });

        toy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animacao.this, Toy.class));
            }
        });

        gelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animacao.this, Gelo.class));
            }
        });


    }
}

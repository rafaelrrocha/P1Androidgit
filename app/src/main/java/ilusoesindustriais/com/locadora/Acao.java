package ilusoesindustriais.com.locadora;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Acao extends AppCompatActivity {


    private ImageView deadpool;
    private ImageView bourne;
    private ImageView dieHard;
    private ImageView bond;
    private ImageView mad;
    private ImageView batman;
    private ImageView seta2;
    private TextView setaTexto2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acao);

        deadpool = findViewById(R.id.deadpoolId);
        bourne = findViewById(R.id.bourneId);
        dieHard = findViewById(R.id.dieHardId);
        bond = findViewById(R.id.bondId);
        mad = findViewById(R.id.madId);
        batman = findViewById(R.id.batmanId);
        seta2 = findViewById(R.id.setaId2);
        setaTexto2 = findViewById(R.id.setaTextoId2);

        deadpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Acao.this, Deadpool.class));
            }
        });

        bourne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Acao.this, Bourne.class));
            }
        });

        dieHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Acao.this, DieHard.class));
            }
        });

        bond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Acao.this, Bond.class));
            }
        });

        mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Acao.this, Mad.class));
            }
        });

        batman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Acao.this, Batman.class));
            }
        });

        seta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Acao.this, Generos.class));
            }
        });

        setaTexto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Acao.this, Generos.class));
            }
        });


}
}
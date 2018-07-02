package ilusoesindustriais.com.locadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Dragon extends AppCompatActivity {

    private ImageView carrinho;
    private TextView carrinhoTexto;

    private ImageView seta;
    private TextView setaTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragon);


        carrinho = findViewById(R.id.carrinhoId);
        carrinhoTexto = findViewById(R.id.carrinhoTextoId);
        seta = findViewById(R.id.setaId);
        setaTexto = findViewById(R.id.setaTextoId);



        carrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Produto Adicionado ao Carrinho", Toast.LENGTH_SHORT).show();
            }
        });


        carrinhoTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Produto Adicionado ao Carrinho", Toast.LENGTH_SHORT).show();
            }
        });

        seta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dragon.this, Animacao.class));
            }
        });

        setaTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dragon.this, Animacao.class));
            }
        });


    }
}

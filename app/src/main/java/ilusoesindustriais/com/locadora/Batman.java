package ilusoesindustriais.com.locadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Batman extends AppCompatActivity {


    private ImageView carrinho;
    private TextView carrinhoTexto;

    private ImageView seta;
    private TextView setaTexto;
    private TextView tituloBatman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batman);


        carrinho = findViewById(R.id.carrinhoId);
        carrinhoTexto = findViewById(R.id.carrinhoTextoId);
        seta = findViewById(R.id.setaId);
        setaTexto = findViewById(R.id.setaTextoId);
        tituloBatman = findViewById(R.id.tituloDieHardId);






        carrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titulo = tituloBatman.getText().toString();
                Intent intent = new Intent(Batman.this, Cart.class);
                intent.putExtra("nome", titulo);

                startActivity( intent );
              //  Toast.makeText(getApplicationContext(), titulo, Toast.LENGTH_SHORT).show();
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
                startActivity(new Intent(Batman.this, Acao.class));
            }
        });

        setaTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Batman.this, Acao.class));
            }
        });


    }
}

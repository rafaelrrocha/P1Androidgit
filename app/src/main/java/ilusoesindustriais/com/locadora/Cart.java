package ilusoesindustriais.com.locadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {

    private ListView cartList;
 //   private String[] filmesEscolhidos = {

  //  };

    ArrayList<String> filmesEscolhidos=new ArrayList<String>();

    private Button checkoutButton;

    int clickCounter=0;
    int Quantidade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


        cartList = findViewById(R.id.cartListId);
        checkoutButton = findViewById(R.id.checkoutButtonId);


        final ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                filmesEscolhidos
        );
        cartList.setAdapter(adaptador);


        Bundle extra = getIntent().getExtras();

        if (extra != null){
            String textoPassado = extra.getString("nome");
           // adaptador.add(textoPassado);
           // adaptador.add(adaptador.getItem(0 + clickCounter));
           // int Quantidade = adaptador.getCount();
            adaptador.insert(textoPassado, 0);
            adaptador.notifyDataSetChanged();
           // Quantidade = Quantidade + 1;
          //  clickCounter++;
        }

        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adaptador.remove(adaptador.getItem(0));
                Toast.makeText(getApplicationContext(), "Aluguel feito com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

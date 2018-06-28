package ilusoesindustriais.com.locadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class LoginRegistradoActivity extends AppCompatActivity {

  //  public  TextView textoEmail;
    private TextView textEmail2;
  //  public  TextView textoSenha;
    private TextView textSenha2;

    private Button botaoConfirmar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_registrado);

        textEmail2 = findViewById(R.id.textEmailId2);
        textSenha2 = findViewById(R.id.textSenhaId2);

        botaoConfirmar2 = findViewById(R.id.botaoConfirmarId2);

       // textEmail2.setText((CharSequence) textEmail);


        botaoConfirmar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String textoEmail2 =  textEmail2.getText().toString();
              String textoSenha2 = textSenha2.getText().toString();

               Bundle extra = getIntent().getExtras();

               String textoPassado = extra.getString("e-mail");
              // textEmail2.setText(textoPassado);

                String textoPassado2 = extra.getString("senha");
              //  textSenha2.setText(textoPassado2);

                if (textoEmail2.equals(textoPassado) && (textoSenha2.equals(textoPassado2))){
                    Toast.makeText(getApplicationContext(), "Login Efetuado com Sucesso!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Dados do Login Incorretos.", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}

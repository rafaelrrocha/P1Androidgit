package ilusoesindustriais.com.locadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextView textNome;
    public TextView textEmail;
    private TextView textTelefone;
    public TextView textSenha;

    private Button botaoConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        textNome = findViewById(R.id.textNomeId);
        textEmail = findViewById(R.id.textEmailId);
        textTelefone = findViewById(R.id.textTelefoneId);
        textSenha = findViewById(R.id.textSenhaId);

        botaoConfirmar = findViewById(R.id.botaoConfirmarId);


        botaoConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNome.getText();
                String textoEmail = textEmail.getText().toString();
                textTelefone.getText();
                String textoSenha = textSenha.getText().toString();

                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                Toast.makeText(getApplicationContext(), "Registrado com sucesso!", Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(LoginActivity.this, LoginRegistradoActivity.class);
                intent.putExtra("e-mail", textoEmail);

              //  startActivity( intent );

                //Intent intent2 = new Intent(LoginActivity.this, LoginRegistradoActivity.class);
                intent.putExtra("senha", textoSenha);

                startActivity( intent );



            }
        });

    }
}

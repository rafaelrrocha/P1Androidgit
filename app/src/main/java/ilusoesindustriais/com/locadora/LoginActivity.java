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
    private TextView textEmail;
    private TextView textTelefone;
    private TextView textSenha;

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
                textEmail.getText();
                textTelefone.getText();
                textSenha.getText();

                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                Toast.makeText(getApplicationContext(), "Registrado com sucesso!", Toast.LENGTH_SHORT).show();



            }
        });

    }
}

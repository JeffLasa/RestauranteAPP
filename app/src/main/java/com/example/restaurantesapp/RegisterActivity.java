package com.example.restaurantesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {

    public final Pattern textPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    private TextInputEditText emailEditText;
    private TextInputEditText passWordEditText;
    private TextInputEditText repeatPasswordEditText;
    private Button registerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                String emailDigitado = bundle.getString("EMAIL");
                String senhaDigitada = bundle.getString("PASS");

                TextInputEditText emailEditText = findViewById(R.id.email_text_input_register_id);
                TextInputEditText passWordEditText = findViewById(R.id.password_text_input_register_id);

                emailEditText.setText(emailDigitado);
                passWordEditText.setText(senhaDigitada);


                registerButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        botaoClicado();
                    }
                });

            }
        }
    }

    public void botaoClicado () {
        emailEditText.setError(null);
        passWordEditText.setError(null);
        repeatPasswordEditText.setError(null);

        if (!emailEditText.getEditableText().toString().equals(repeatPasswordEditText.getEditableText().toString())) {
            emailEditText.setError("As senhas não conferem");
            repeatPasswordEditText.setError("As senhas não conferem");
        } else if (emailEditText.getEditableText().toString().equals("")) {
            emailEditText.setError("Campo obrigatório");
        } else if (emailEditText.getEditableText().toString().equals("")) {
            emailEditText.setError("Campo obrigatório");
        } else {
            Snackbar.make(findViewById(android.R.id.content), "Usuário cadastro com sucesso", Snackbar.LENGTH_INDEFINITE)
                    .setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            irParaMainActivity();
                        }
                    }).setActionTextColor(getResources().getColor(R.color.verde))
                    .show();
        }
    }

    private void irParaMainActivity () {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
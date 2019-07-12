package com.example.restaurantesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {


    private TextView registerButton;
    public final Pattern textPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    private TextInputEditText emailEditText;
    private TextInputEditText passwordEditText;
    private Button loginButton;
    private Button buttonFacebook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                String emailDigitado = bundle.getString("EMAIL");
                String senhaDigitada = bundle.getString("PASS");

                TextInputEditText emailEditText = findViewById(R.id.email_text_input_login_id);
                TextInputEditText passWordEditText = findViewById(R.id.password_text_input_login_id);

                emailEditText.setText(emailDigitado);
                passWordEditText.setText(senhaDigitada);
            }
        }

        emailEditText = findViewById(R.id.email_text_input_login_id);
        passwordEditText = findViewById(R.id.password_text_input_login_id);
        loginButton = findViewById(R.id.button_login_login_id);
        registerButton = findViewById(R.id.button_register_login_id);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logar();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irParaRegister();
            }
        });
    }

    private void logar() {

        String emailDigitado = emailEditText.getEditableText().toString();
        String senhaDigitada = passwordEditText.getEditableText().toString();

        emailEditText.setError(null);
        passwordEditText.setError(null);

        if (emailDigitado.equals("je") && senhaDigitada.equals("123")) {

            Bundle bundle = new Bundle();
            bundle.putSerializable("", emailDigitado);

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtras(bundle);

            startActivity(intent);

        } else {
            emailEditText.setError("Usuário e/ou senha incorreto(s)");
            passwordEditText.setError("Usuário e/ou senha incorreto(s)");
        }
    }

    private void irParaRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
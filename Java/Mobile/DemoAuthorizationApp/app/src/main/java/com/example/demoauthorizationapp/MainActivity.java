package com.example.demoauthorizationapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText emailInput, passwordInput;
    Button loginBtn;
    TextView signupLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginBtn = findViewById(R.id.loginBtn);
        signupLink = findViewById(R.id.signupLink);

        signupLink.setOnClickListener(v -> {
            startActivity(new Intent(this, SignUpActivity.class));
        });

        loginBtn.setOnClickListener(v -> login());
    }

    private void login() {
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();

        SharedPreferences prefs = getSharedPreferences("userData", MODE_PRIVATE);
        String savedEmail = prefs.getString("email", null);
        String savedPassword = prefs.getString("password", null);

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Fill all fields!", Toast.LENGTH_SHORT).show();
        } else if (email.equals(savedEmail) && password.equals(savedPassword)) {
            startActivity(new Intent(this, WelcomeActivity.class));
        } else {
            Toast.makeText(this, "Invalid credentials!", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.demoauthorizationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.example.demoauthorizationapp.utils.Validator;

public class SignUpActivity extends AppCompatActivity {

    EditText emailInput, passwordInput;
    Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        emailInput = findViewById(R.id.signupEmailInput);
        passwordInput = findViewById(R.id.signupPasswordInput);
        signUpBtn = findViewById(R.id.signupBtn);

        signUpBtn.setOnClickListener(v -> {
            String email = emailInput.getText().toString();
            String password = passwordInput.getText().toString();

            if (!Validator.isValidEmail(email)) {
                emailInput.setError("Invalid email format");
                return;
            }
            if (password.length() < 6) {
                passwordInput.setError("Password too short");
                return;
            }

            Intent intent = new Intent(SignUpActivity.this, AccountActivity.class);
            intent.putExtra("email", email);
            intent.putExtra("password", password);
            startActivity(intent);
        });
    }
}

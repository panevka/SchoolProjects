package com.example.demoauthorizationapp;

import android.content.*;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {

    TextView showEmail, showPassword;
    Button goToLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");

        showEmail = findViewById(R.id.showEmail);
        showPassword = findViewById(R.id.showPassword);
        goToLoginBtn = findViewById(R.id.goToLoginBtn);

        showEmail.setText(email);
        showPassword.setText(password);

        SharedPreferences prefs = getSharedPreferences("userData", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("email", email);
        editor.putString("password", password);
        editor.apply();

        goToLoginBtn.setOnClickListener(v ->
                startActivity(new Intent(this, MainActivity.class))
        );
    }
}

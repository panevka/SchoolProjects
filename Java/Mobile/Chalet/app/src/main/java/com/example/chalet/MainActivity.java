package com.example.chalet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int likeCount = 0;
    private TextView likeCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likeCounter = findViewById(R.id.likeCounter);

        Button likeButton = findViewById(R.id.likeButton);
        Button deleteButton = findViewById(R.id.deleteButton);
        Button saveButton = findViewById(R.id.saveButton);

        likeButton.setOnClickListener(view -> {
            likeCount++;
            updateCounter();
        });

        deleteButton.setOnClickListener(view -> {
            if (likeCount > 0) {
                likeCount--;
                updateCounter();
            }
        });

        updateCounter();
    }

    private void updateCounter() {
        likeCounter.setText(likeCount + " polubień");
    }
}

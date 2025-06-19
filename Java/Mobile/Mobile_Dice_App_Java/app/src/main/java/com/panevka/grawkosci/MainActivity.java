package com.panevka.grawkosci;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.grawkosci.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ImageView[] dices;
    Button throwButton, resetButton;
    TextView gameScoreText, overallScoreText;
    int OverallScore;

    public List<Integer> GenerateNumbers(){

        List<Integer> diceNumbers = new ArrayList<>(5);

        for(int i = 0; i<5; i++){
            int randomNumber = (int) (Math.random() * 6) + 1;
            diceNumbers.add(randomNumber);
        }
        return diceNumbers;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        OverallScore = 0;
        overallScoreText = findViewById(R.id.overall_score);
        gameScoreText = findViewById(R.id.game_score);
        throwButton = findViewById(R.id.button_throw);
        resetButton = findViewById(R.id.button_reset);
        dices = new ImageView[]{findViewById(R.id.dice1), findViewById(R.id.dice2), findViewById(R.id.dice3), findViewById(R.id.dice4), findViewById(R.id.dice5)};


        throwButton.setOnClickListener(v -> {
            List<Integer> diceNumbers = GenerateNumbers();
            Log.d("OnClick", "OnClick "+ diceNumbers.toString());
            int sum = 0;

            for(int i : diceNumbers)
                sum += i;

            gameScoreText.setText("Wynik tego losowania: " + sum);
            OverallScore += sum;
            overallScoreText.setText("Wynik gry: " + OverallScore);

            for(int i = 0; i<5; i++) {
                Log.d("b4 switch", "b4 switch "+ diceNumbers);
                switch (diceNumbers.get(i)) {
                    case 1:
                        dices[i].setImageResource(R.drawable.dice_one);
                        Log.d("switch", "switch1 "+ diceNumbers.get(i));
                        break;
                    case 2:
                        dices[i].setImageResource(R.drawable.dice_two);
                        Log.d("switch", "switch2 "+ diceNumbers.get(i));
                        break;
                    case 3:
                        dices[i].setImageResource(R.drawable.dice_three);
                        Log.d("switch", "switch3 "+ diceNumbers.get(i));
                        break;
                    case 4:
                        dices[i].setImageResource(R.drawable.dice_four);
                        Log.d("switch", "switch4 "+ diceNumbers.get(i));
                        break;
                    case 5:
                        dices[i].setImageResource(R.drawable.dice_five);
                        Log.d("switch", "switch5 "+ diceNumbers.get(i));
                        break;
                    case 6:
                        dices[i].setImageResource(R.drawable.dice_six);
                        Log.d("switch", "switch6 "+ diceNumbers.get(i));
                        break;
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(ImageView img : dices){
                    img.setImageResource(R.drawable.dice_question);
                }
                OverallScore = 0;
                gameScoreText.setText("Wynik tego losowania: 0");
                overallScoreText.setText("Wynik gry: " + OverallScore);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

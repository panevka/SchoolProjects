package com.example.formdatabinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nameInput, surnameInput, ageInput;
    RadioGroup genderGroup;
    CheckBox sports, music, technology, art;
    Button selectButton;
    TextView selectedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.edit_name);
        surnameInput = findViewById(R.id.edit_surname);
        ageInput = findViewById(R.id.edit_age);
        genderGroup = findViewById(R.id.radio_group);
        sports = findViewById(R.id.checkbox_sports);
        music = findViewById(R.id.checkbox_music);
        technology = findViewById(R.id.checkbox_technology);
        art = findViewById(R.id.checkbox_art);
        selectButton = findViewById(R.id.button_select);
        selectedText = findViewById(R.id.text_selected);

        selectButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            String surname = surnameInput.getText().toString();
            String age = ageInput.getText().toString();

            if (name.isEmpty() || surname.isEmpty() || age.isEmpty() || genderGroup.getCheckedRadioButtonId() == -1) {
                Toast.makeText(MainActivity.this, "Wprowadź wszystkie dane!", Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton selectedGender = findViewById(genderGroup.getCheckedRadioButtonId());
            String gender = selectedGender.getText().toString();

            StringBuilder interests = new StringBuilder();
            if (sports.isChecked()) interests.append("Sport ");
            if (music.isChecked()) interests.append("Muzyka ");
            if (technology.isChecked()) interests.append("Technologia ");
            if (art.isChecked()) interests.append("Sztuka ");

            String result = "Imię: " + name + "\nNazwisko: " + surname + "\nWiek: " + age + "\nPłeć: " + gender + "\nZainteresowania: " + interests;
            selectedText.setText("Wybrano:\n" + result);

            Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("result", result);
            startActivity(intent);
        });
    }
}

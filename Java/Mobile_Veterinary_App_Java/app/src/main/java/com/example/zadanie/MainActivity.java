package com.example.zadanie;

import android.app.TimePickerDialog;
import android.graphics.Color;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText ownerData, appointmentReason, hourInput;
    TextView ageTextView, summary;
    ListView animalsList;
    String[] animalsItems;
    ArrayAdapter<String> arrayAdapter;
    Button confirmButton;
    String animalType;

    SeekBar slider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ownerData = findViewById(R.id.input_OwnerData);
        appointmentReason = findViewById(R.id.input_AppointmentReason);
        hourInput = findViewById(R.id.input_Hour);
        ageTextView = findViewById(R.id.text_AgeNumber);
        confirmButton = findViewById(R.id.button_Confirm);
        summary = findViewById(R.id.text_Summary);



        animalsList = findViewById(R.id.list_Animals);
        animalsItems = new String[]{"Kot", "Pies", "Świnka Morska"};

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, animalsItems);
        animalsList.setAdapter(arrayAdapter);
        animalsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> myAdapter, View myView, int
                    myItemInt, long mylng) {

               TextView chosenItem = (TextView) myView;
               String itemText = (String) chosenItem.getText();
                animalType = itemText;
               if(itemText.equals(new String("Kot"))){
                   slider.setMax(20);
               } else if (itemText.equals("Pies")) {
                   slider.setMax(18);
               } else{
                   slider.setMax(9);
               }

                for (int i = 0; i < arrayAdapter.getCount(); i++) {
                    String item = arrayAdapter.getItem(i);
                    animalsList.getChildAt(i).setBackgroundColor(Color.parseColor("#90EE90"));
                }

               chosenItem.setBackgroundColor(Color.parseColor("#f573f3"));

            }
        });

        slider = findViewById(R.id.seekbar_Age);

        slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ageTextView.setText(Integer.toString(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                summary.setText(String.join(", ", ownerData.getText().toString(), animalType, ageTextView.getText(), appointmentReason.getText(), hourInput.getText()));
            }
        });


        hourInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        String time = String.format("%02d:%02d", hourOfDay, minute);
                        hourInput.setText(time);
                    }
                }, hour, minute, true);

                timePickerDialog.show();
            }
        });

    }


}
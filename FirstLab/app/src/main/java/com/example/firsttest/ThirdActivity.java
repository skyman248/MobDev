package com.example.firsttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;
import java.util.Calendar;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        DatePicker datePicker = findViewById(R.id.datePicker);
        final TextView textView = findViewById(R.id.textView);

        Calendar today = Calendar.getInstance();

        datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(getApplicationContext(),"onDateChanged",Toast.LENGTH_SHORT).show();
                textView.setText(MessageFormat.format("{0}{1}:{2}:{3}", getString(R.string.date), year, monthOfYear + 1, dayOfMonth));

            }
        });
    }

    public void prevActivity(View view) {
//        Intent intent = new Intent(this, SecondActivity.class);
//        startActivity(intent);
        onBackPressed();

    }
}

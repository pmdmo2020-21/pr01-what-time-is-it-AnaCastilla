package com.example.whattimeisit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView txtDateT, txtDateN, txtTimeT, txtTimeN;
    Date date = new Date();
    SimpleDateFormat sdfD = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdfT = new SimpleDateFormat("HH:mm");
    String dateFormat = sdfD.format(date);
    String timeFormat = sdfT.format(date);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        txtDateT = findViewById(R.id.dateText);
        txtDateN = findViewById(R.id.dateNumber);
        txtTimeT = findViewById(R.id.timeText);
        txtTimeN = findViewById(R.id.timeNumber);

        txtDateN.setText(dateFormat);
        txtTimeN.setText(timeFormat);
    }
}
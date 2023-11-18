package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button startBtn = (Button)findViewById(R.id.startGame);
        Button resetBtn = (Button)findViewById(R.id.resetGame);
        TextView textView = (TextView)findViewById(R.id.gameText);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sample funcionality, set text when button is clicked
                textView.setText("The game was started");
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sample functionality, set text that game was reset
                textView.setText("The game was reset");
            }
        });
    }
}
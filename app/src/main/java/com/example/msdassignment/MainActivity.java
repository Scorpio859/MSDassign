package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //making button instances
        Button heroButton = (Button) findViewById(R.id.herosButton);
        Button perkButton = (Button) findViewById(R.id.perksButton);
        Button modesButton = (Button) findViewById(R.id.modesButton);
        Button trackerButton = (Button) findViewById(R.id.trackerButton);
        Button locButton = (Button) findViewById(R.id.locatButton);

        // onClickListener for the Heros button
        heroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent for storing the info of the new activity
                Intent intent = new Intent(MainActivity.this, HerosActivity.class);
                //starting the activity in intent
                startActivity(intent);
            }
        });

        // onClickListener for the Perk button
        perkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent for storing the info of the new activity
                Intent intent = new Intent(MainActivity.this, ActivityPerks.class);
                //starting the activity in intent
                startActivity(intent);
            }
        });

        // onClickListener for the Game Modes button
        modesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent for storing the info of the new activity
                Intent intent = new Intent(MainActivity.this, ModesActivity.class);
                //starting the activity in intent
                startActivity(intent);
            }
        });

        // onClickListener for the Event Gear Tracker button
        trackerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent for storing the info of the new activity
                Intent intent = new Intent(MainActivity.this, GearActivity.class);
                //starting the activity in intent
                startActivity(intent);
            }
        });

        // onClickListener for the Location button button
        locButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent for storing the info of the new activity
                Intent intent = new Intent(MainActivity.this, ActivityYourLocal.class);
                //starting the activity in intent
                startActivity(intent);
            }
        });
    }
}

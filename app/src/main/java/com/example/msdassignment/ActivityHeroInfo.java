package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHeroInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_info);

        //read the information from the bundle
        Bundle b = getIntent().getExtras();
        String name = b.getString("Name");
        String faction = b.getString("Faction");
        String hClass = b.getString("Class");

        //linking the views to variables
        TextView display_name = (TextView) findViewById(R.id.heroNameDisplay);
        TextView display_faction = (TextView) findViewById(R.id.heroFactionDisplay);
        TextView display_class = (TextView) findViewById(R.id.heroClassDisplay);

        //update views with text
        display_name.setText(name);
        display_faction.setText(faction);
        display_class.setText(hClass);

    }
}
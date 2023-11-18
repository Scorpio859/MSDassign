package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DatabaseErrorHandler;
import android.os.Bundle;
import android.widget.TabHost;

public class PerksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perks);

        TabHost tabHost = (TabHost)findViewById(R.id.perksTab);

        tabHost.setup();

        //setting up spec for offencive perks tab
        TabHost.TabSpec spec = tabHost.newTabSpec("Offencive");
        spec.setContent(R.id.Offensive);
        spec.setIndicator("Offencive");
        //adding tab to tabhost instance
        tabHost.addTab(spec);

        //setting up spec for defencive perks tab
        spec = tabHost.newTabSpec("Defencive");
        spec.setContent(R.id.Defencive);
        spec.setIndicator("Defencive");
        //adding defencive tab
        tabHost.addTab(spec);

        //setting up spec for assistive perks tab
        spec = tabHost.newTabSpec("Assistive");
        spec.setContent(R.id.Assistive);
        spec.setIndicator("Assistive");
        //adding assistive tab
        tabHost.addTab(spec);
    }
}
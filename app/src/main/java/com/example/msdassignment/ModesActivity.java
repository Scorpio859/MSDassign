package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class ModesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);

        TabHost tabHost = (TabHost)findViewById(R.id.modesTab);

        tabHost.setup();

        //setting up spec for 4v4 modes tab
        TabHost.TabSpec spec = tabHost.newTabSpec("4V4 Modes");
        spec.setContent(R.id.fourVfourModes);
        spec.setIndicator("4V4 Modes");
        //adding tab to tabhost instance
        tabHost.addTab(spec);

        //setting up spec for 1V1 modes tab
        spec = tabHost.newTabSpec("1V1 Modes");
        spec.setContent(R.id.oneVoneModes);
        spec.setIndicator("1V1 Modes");
        //adding defencive tab
        tabHost.addTab(spec);

        //setting up spec for 2V2 modes tab
        spec = tabHost.newTabSpec("2V2 Modes");
        spec.setContent(R.id.twoVtwoModes);
        spec.setIndicator("2V2 Modes");
        //adding assistive tab
        tabHost.addTab(spec);
    }
}
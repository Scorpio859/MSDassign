package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class HerosActivity extends AppCompatActivity {

    private ListView listView;
    private String heroNames[] = {
            //list of the heros names
            "Warden",
            "Peacekeeper",
            "Conqueror",
            "Lawbringer"
    };
    private Integer imageid[] = {
            //images from drawable folder
            R.drawable.wardenhead,
            R.drawable.pkhead,
            R.drawable.conqhead,
            R.drawable.lawhead
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heros);

        ListView listView=(ListView)findViewById(R.id.heroList);

        CustomHeroList customHeroList = new CustomHeroList(this, imageid, heroNames);
        listView.setAdapter(customHeroList);

    }
}
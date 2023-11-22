package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class HerosActivity extends AppCompatActivity {

    private ListView listView;
    private String heroNames[] = {
            //list of the heros names
            "Warden", //knights
            "Peacekeeper",
            "Conqueror",
            "Lawbringer",
            "Centurion",
            "Gladiator",
            "Black Prior",
            "Warmonger",
            "Gryphon",
            "Raider", //Vikings
            "Warlord",
            "Berserker",
            "Valkyrie",
            "Highlander",
            "Shaman",
            "Jormungandr"
    };
    private Integer imageid[] = {
            //images from drawable folder
            R.drawable.wardenhead,//knights pics
            R.drawable.pkhead,
            R.drawable.conqhead,
            R.drawable.lawhead,
            R.drawable.centhead,
            R.drawable.gladhead,
            R.drawable.bphead,
            R.drawable.warhead,
            R.drawable.gryphhead,
            R.drawable.raiderhead, //Vikings
            R.drawable.warlordhead,
            R.drawable.zerkhead,
            R.drawable.valkhead,
            R.drawable.hlhead,
            R.drawable.shamanhead,
            R.drawable.jormhead
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
package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class GearActivity extends AppCompatActivity {

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
            "Jormungandr",
            "Kensei", //Samurai
            "Shugoki",
            "Orochi",
            "Nobushi",
            "Shinobi",
            "Aramusha",
            "Hitokiri",
            "Kyoshin",
            "Tiandi", //Wu lin
            "Jiang Jun",
            "Nuxia",
            "Shaolin",
            "Zhanhu",
            "Pirate", //outlanders
            "Medjay",
            "Afeera",
            "Ocelotl"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gear);

        ListView listView=(ListView) findViewById(R.id.gearList);

        CustomGearList customGearList = new CustomGearList(this, heroNames);
        listView.setAdapter(customGearList);
    }
}
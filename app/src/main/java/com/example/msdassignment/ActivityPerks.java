package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ActivityPerks extends AppCompatActivity {

    private ListView listView;
    private String perkNames[] = {
            "Galestorm",
            "Devourer",
            "Early Reaper",
            "Endurance",
            "Survival Instinct",
            "Crush Them",
            "Head Hunter",
            "Aegis",
            "Shields Up",
            "Bastion",
            "Vengeful Barrier",
            "Last Stand",
            "Fresh Focus",
            "Bulk Up",
            "Radiant Rebound",
            "Remedy",
            "Feline Agility",
            "Supersonic",
            "Clever Tactics",
            "Rising Dawn",
            "Rapid Refresh"
    };
    private String perkDescs[] = {
            "On Hero kill, gain movespeed",
            "On execution, heal extra 10 health",
            "On spawn/revived, next attack does bonus damage",
            "On renown level up gain growing stamina cost reduction",
            "When critical health, gain stamina cost reduction",
            "On Hero kill, next attack deals bonus damage",
            "Each new Hero executed increase max health",
            "All shields received are increased",
            "When revived gain 25 health shield",
            "While inside or carrying objective gain damage reduction",
            "When exiting Revenge gain 25 health shield",
            "When critical health gain damage reduction",
            "When exhausted successful defence regenerates 20% stamina",
            "On Renown level gain bonus max health",
            "On spawn/revived gain movespeed bonus",
            "on Hero kill heal 10 health",
            "On Renown level up gain bonus movespeed",
            "When in Revenge gain movespeed and sprint can't be stopped",
            "Capture objectives and healing zones faster",
            "Revived allies gain larger portion of health back",
            "On takedown or revive reduce feat cooldowns"
    };

    private Integer perkImgId[] = {
            R.drawable.gale,
            R.drawable.devo,
            R.drawable.early,
            R.drawable.endur,
            R.drawable.survival,
            R.drawable.crush,
            R.drawable.headhunt,
            R.drawable.aegis, //defensive
            R.drawable.shieldsup,
            R.drawable.bastion,
            R.drawable.vengeful,
            R.drawable.laststand,
            R.drawable.fresh,
            R.drawable.bulkup,
            R.drawable.radiant, //assistive
            R.drawable.remedy,
            R.drawable.feline,
            R.drawable.supersonic,
            R.drawable.tactics,
            R.drawable.rising,
            R.drawable.refresh
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perks);

        ListView listView = (ListView) findViewById(R.id.perkList);

        CustomPerkList customPerkList = new CustomPerkList(this, perkNames, perkDescs, perkImgId);
        listView.setAdapter(customPerkList);
    }
}
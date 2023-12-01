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
            R.drawable.jormhead,
            R.drawable.kenseihead, //Samurai
            R.drawable.gokihead,
            R.drawable.orochihead,
            R.drawable.nobushihead,
            R.drawable.shinobihead,
            R.drawable.aramushahead,
            R.drawable.hitohead,
            R.drawable.kyohead,
            R.drawable.tiandihead, //Wu lin
            R.drawable.jjhead,
            R.drawable.nuxiahead,
            R.drawable.shaolinhead,
            R.drawable.zhanhuhead,
            R.drawable.piratehead, //outlanders
            R.drawable.medjayhead,
            R.drawable.afeerahead,
            R.drawable.ocelhead
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
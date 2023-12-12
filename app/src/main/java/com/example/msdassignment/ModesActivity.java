package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ModesActivity extends AppCompatActivity {

    private ListView modeListView;
    private String modeNames[] = {
            "Dominion",
            "Brawl",
            "Duel",
            "Ranked Duel",
            "Skirmish",
            "Elimination",
            "Tribute",
            "Breach"
    };

    private String playerNums[] = {
            "(4V4)",
            "(2V2)",
            "(1V1)",
            "(1V1)",
            "(4V4)",
            "(4V4)",
            "(4V4)",
            "(4V4)"
    };
    private String modeDescs[] = {
            "Capture and hold key locations on the battlefield to earn points. Once a team passes the 1000 points threshold the enemy team starts 'Breaking'. While 'Breaking' players are not able to respawn, eliminate the enemy team to claim victory",
            "A duo must eliminate the other duo in order to claim a round in a best of 5 series, the first duo to claim 3 rounds emerges victorious",
            "A duel against another player, kill them to score a round in your favour, first player to have 3 rounds won is victorious in the match",
            "Similar to normal dual game mode, but players must complete 8 placement matches to be given a rank, once given a rank players will be matched against others of the same rank, wins and losses move you up or down in the ranks",
            "Kill enemy Heros to gain points for your team, when a team has enough points they can eliminate the enemy team to be victorious, buffs spawn around the map you can claim to give you an advantage",
            "Eliminate players off the enemy team, last team standing wins, if the timer runs out the team with most Heros standing win the match",
            "Claim offerings and place them on your teams shrines, each of the 3 offerings give your team a different buff, if a team claims all 3 offerings and defends them till timer ends they win or if battle time runs out team with most offerings becomes victorious",
            "Attack or Defend a fortress. Attackers must ram through 2 door and eliminate the commander to win. Defenders destroy the ram before the 2 gates are breached or deplete the attackers stocks in the final area to win"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);

        ListView modeListView = (ListView) findViewById(R.id.modesList);

        CustomModesList customModesList = new CustomModesList(this, modeNames, playerNums, modeDescs);
        modeListView.setAdapter(customModesList);
    }
}
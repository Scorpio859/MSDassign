package com.example.msdassignment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomModesList extends ArrayAdapter {

    private String[] modeNames;

    private String[] playerNums;

    private String[] modeDescs;

    private Activity context;

    public CustomModesList(Activity context, String[] modeNames, String[] playerNums, String[] modeDescs) {
        super(context, R.layout.mode_item, modeNames);
        this.context = context;
        this.modeNames = modeNames;
        this.playerNums = playerNums;
        this.modeDescs = modeDescs;
    }

    public View getView(int position, View convertview, ViewGroup parent) {
        View row= convertview;
        LayoutInflater inflater = context.getLayoutInflater();

        if (convertview == null)
            row = inflater.inflate(R.layout.mode_item, null, true);

        TextView modeName = (TextView) row.findViewById(R.id.modeName);
        TextView players = (TextView) row.findViewById(R.id.modePlayers);
        TextView modeDesc = (TextView) row.findViewById(R.id.modeDesc);

        modeName.setText(modeNames[position]);
        players.setText(playerNums[position]);
        modeDesc.setText(modeDescs[position]);


        return row;
    }
}

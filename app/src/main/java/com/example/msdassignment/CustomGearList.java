package com.example.msdassignment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomGearList extends ArrayAdapter {
    private Activity context;
    private String[] heroNames;

    public CustomGearList(Activity context, String[] heroNames){
        super(context, R.layout.gear_row, heroNames);
        this.context = context;
        this.heroNames = heroNames;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent){
        View row=convertview;
        LayoutInflater inflater = context.getLayoutInflater();

        if(convertview==null)
            row=inflater.inflate(R.layout.gear_row, null, true);

        TextView heroName = (TextView) row.findViewById(R.id.gearHero);

        heroName.setText(heroNames[position]);

        return row;
    }
}

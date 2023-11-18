package com.example.msdassignment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customHeroList extends ArrayAdapter {
    private String[] heroNames;
    private Integer[] imageid;
    private Activity context;

    public customHeroList(Activity context, Integer[] imageid, String[] heroNames){
        super(context, R.layout.row_item, heroNames);
        this.context = context;
        this.heroNames = heroNames;
        this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent){
        View row=convertview;
        LayoutInflater inflater = context.getLayoutInflater();

        if(convertview==null)
            row=inflater.inflate(R.layout.row_item, null, true);

        TextView heroName = (TextView)row.findViewById(R.id.heroName);
        ImageView heroImage = (ImageView)row.findViewById(R.id.heroImage);

        heroName.setText(heroNames[position]);
        heroImage.setImageResource(imageid[position]);

        return row;
    }

}

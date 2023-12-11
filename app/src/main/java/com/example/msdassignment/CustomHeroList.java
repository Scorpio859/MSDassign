package com.example.msdassignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomHeroList extends ArrayAdapter {
    private String[] heroNames;
    private Integer[] imageid;
    private Activity context;

    public CustomHeroList(Activity context, Integer[] imageid, String[] heroNames){
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

        //on click listener for the textView
        heroName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "You clicked hero: " + heroNames[position];
                int duration = Toast.LENGTH_LONG;
                //Toast.makeText(CustomHeroList.this.getContext(), text, duration).show();

                // on click open a new view with info on the selected hero
                Intent intent = new Intent(context, ActivityHeroInfo.class);

                //get relevant information for the hero clicked
                String name = heroNames[position];
                String faction = getFaction(position);
                String hClass = getHClass(position);

                //bundle the parameters that we want to pass
                Bundle b = new Bundle();
                b.putString("Name", name);
                b.putString("Faction", faction);
                b.putString("Class", hClass);

                //put info into the intent
                intent.putExtras(b);

                //start new activity
                context.startActivity(intent);
            }
        });

        //on click listener for the imageview
        heroImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "You clicked hero: " + heroNames[position];
                int duration = Toast.LENGTH_LONG;
                //Toast.makeText(CustomHeroList.this.getContext(), text, duration).show();

                // on click open a new view with info on the selected hero
                Intent intent = new Intent(context, ActivityHeroInfo.class);

                //get relevant information for the hero clicked
                String name = heroNames[position];
                String faction = getFaction(position);
                String hClass = getHClass(position);

                //bundle the parameters that we want to pass
                Bundle b = new Bundle();
                b.putString("Name", name);
                b.putString("Faction", faction);
                b.putString("Class", hClass);


                //put info into the intent
                intent.putExtras(b);

                //start new activity
                context.startActivity(intent);
            }
        });

        heroName.setText(heroNames[position]);
        heroImage.setImageResource(imageid[position]);

        return row;
    }

    private String getFaction(int pos) {
        if (pos >=0 && pos <=8) {
            return "Knights";
        } else if (pos >=9 && pos <=15) {
            return "Vikings";
        } else if (pos >=16 && pos <=23) {
            return "Samurai";
        } else if (pos >=24 && pos <=28) {
            return "Wu Lin";
        } else if (pos >=29 && pos <=32) {
            return "Outlanders";
        } else {
            return "Unknown";
        }
    }

    private String getHClass(int pos) {
        if (pos == 0 || pos == 7 || pos == 9 || pos == 16 || pos == 24) {
            return "Vanguard";
        } else if (pos == 1 || pos == 5 || pos == 11 || pos == 14 || pos == 18 || pos == 20 || pos == 26) {
            return "Assassin";
        } else if (pos == 2 || pos == 6 || pos == 10 || pos == 15 || pos == 17 || pos == 22 || pos == 25) {
            return "Heavy";
        } else if (pos == 3 || pos == 4 || pos == 8 || pos == 12 || pos == 13 || pos == 19 || pos == 21 || pos == 23 || pos == 27 || pos == 28 || pos == 29 || pos == 30 || pos == 31 || pos == 32) {
            return "Hybrid";
        } else {
            return "Unknown";
        }
    }

}

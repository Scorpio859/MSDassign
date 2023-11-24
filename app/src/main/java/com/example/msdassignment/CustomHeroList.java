package com.example.msdassignment;

import android.app.Activity;
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
                Toast.makeText(CustomHeroList.this.getContext(), text, duration).show();
            }
        });

        //on click listener for the imageview
        heroImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "You clicked hero: " + heroNames[position];
                int duration = Toast.LENGTH_LONG;
                Toast.makeText(CustomHeroList.this.getContext(), text, duration).show();
            }
        });

        heroName.setText(heroNames[position]);
        heroImage.setImageResource(imageid[position]);

        return row;
    }

}

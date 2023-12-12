package com.example.msdassignment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomPerkList extends ArrayAdapter {

    private String[] perkNames;
    private String[] perkDescs;
    private Integer[] perkImgId;
    private Activity context;

    public CustomPerkList(Activity context, String[] perkNames, String[] perkDesc, Integer[] perkImgId) {
        super(context, R.layout.perk_item, perkNames);
        this.context = context;
        this.perkNames = perkNames;
        this.perkDescs = perkDesc;
        this.perkImgId = perkImgId;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        View row = convertview;
        LayoutInflater inflater = context.getLayoutInflater();

        if (convertview == null)
            row = inflater.inflate(R.layout.perk_item, null, true);

        TextView perkName = (TextView) row.findViewById(R.id.perkName);
        TextView perkDesc = (TextView) row.findViewById(R.id.perkDesc);
        ImageView perkImg = (ImageView) row.findViewById(R.id.perkImg);

        perkName.setText(perkNames[position]);
        perkDesc.setText(perkDescs[position]);
        perkImg.setImageResource(perkImgId[position]);

        return row;
    }
}

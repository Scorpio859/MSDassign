package com.example.msdassignment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.Arrays;

public class CustomGearList extends ArrayAdapter<String> {
    private Activity context;
    private String[] heroNames;
    private boolean[][] checkState;

    public CustomGearList(Activity context, String[] heroNames){
        super(context, R.layout.gear_row, heroNames);
        this.context = context;
        this.heroNames = heroNames;
        this.checkState = new boolean[heroNames.length][13];

        //set checked state as unchecked(false) as default
        for (boolean[] row : checkState) {
            Arrays.fill(row, false);
        }
    }
    
    @Override
    public View getView(int position, View convertview, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();

        View row=convertview;
        if(row==null) {
            row = inflater.inflate(R.layout.gear_row, null);
        }

        //linking all the views
        TextView heroName = (TextView) row.findViewById(R.id.gearHero);
        //body views
        CheckBox headCheckBox = (CheckBox) row.findViewById(R.id.headCheck);
        CheckBox bodyCheckBox = (CheckBox) row.findViewById(R.id.bodyCheck);
        CheckBox armsCheckBox = (CheckBox) row.findViewById(R.id.armsCheck);
        //weapon parts views
        CheckBox wepAcheckBox = (CheckBox) row.findViewById(R.id.wepAcheck);
        CheckBox wepBcheckBox = (CheckBox) row.findViewById(R.id.wepBcheck);
        CheckBox wepCcheckBox = (CheckBox) row.findViewById(R.id.wepCcheck);
        //effects views
        CheckBox idleCheckBox = (CheckBox) row.findViewById(R.id.idleCheck);
        CheckBox unlockedCheckBox = (CheckBox) row.findViewById(R.id.unlockedCheck);
        CheckBox lockedCheckBox = (CheckBox) row.findViewById(R.id.lockedCheck);
        CheckBox exeCheckBox = (CheckBox) row.findViewById(R.id.exeCheck);
        //fashion views
        CheckBox ornCheckBox = (CheckBox) row.findViewById(R.id.ornCheck);
        CheckBox fitCheckBox = (CheckBox) row.findViewById(R.id.fitCheck);
        CheckBox colourCheckBox = (CheckBox) row.findViewById(R.id.colourCheck);



        //setting values of each view
        heroName.setText(heroNames[position]);
        //body views
        headCheckBox.setChecked(checkState[position][0]);
        bodyCheckBox.setChecked(checkState[position][1]);
        armsCheckBox.setChecked(checkState[position][2]);
        //weapon parts views
        wepAcheckBox.setChecked(checkState[position][3]);
        wepBcheckBox.setChecked(checkState[position][4]);
        wepCcheckBox.setChecked(checkState[position][5]);
        //effects views
        idleCheckBox.setChecked(checkState[position][6]);
        unlockedCheckBox.setChecked(checkState[position][7]);
        lockedCheckBox.setChecked(checkState[position][8]);
        exeCheckBox.setChecked(checkState[position][9]);
        //fashion views
        ornCheckBox.setChecked(checkState[position][10]);
        fitCheckBox.setChecked(checkState[position][11]);
        colourCheckBox.setChecked(checkState[position][12]);

        //checkbox checked change listeners for each of the views
        headCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][0] = isChecked;
            }
        });

        bodyCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][1] = isChecked;
            }
        });

        armsCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][2] = isChecked;
            }
        });

        wepAcheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][3] = isChecked;
            }
        });

        wepBcheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][4] = isChecked;
            }
        });

        wepCcheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][5] = isChecked;
            }
        });

        idleCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][6] = isChecked;
            }
        });

        unlockedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][7] = isChecked;
            }
        });

        lockedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][8] = isChecked;
            }
        });

        exeCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][9] = isChecked;
            }
        });

        ornCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][10] = isChecked;
            }
        });

        fitCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][11] = isChecked;
            }
        });

        colourCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkState[position][12] = isChecked;
            }
        });


        return row;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}

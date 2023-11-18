package com.example.msdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class HerosActivity extends AppCompatActivity {

    private ListView listView;
    private String heroNames[] = {
            //list of the heros names
    };
    private Integer imageid[] = {
            //images from drawable folder
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heros);

    }
}
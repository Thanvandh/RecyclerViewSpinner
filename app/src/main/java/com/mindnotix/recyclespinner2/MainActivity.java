package com.mindnotix.recyclespinner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSpinner;
    List<spinnerData> spinnerDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0; i<20; i++){
            spinnerDataList .add(new spinnerData());
        }


        rvSpinner  = (RecyclerView)findViewById(R.id.rvSpinner);

        rvSpinner.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        rvSpinner.setAdapter(new RvAdapter(spinnerDataList));
    }
}

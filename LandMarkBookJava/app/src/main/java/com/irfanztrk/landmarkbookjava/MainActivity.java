package com.irfanztrk.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.irfanztrk.landmarkbookjava.databinding.ActivityDetailsBinding;
import com.irfanztrk.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    //static Landmark chosenLandmark;

    ArrayList<Landmark> landmarkArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        landmarkArrayList=new ArrayList<>();
        //Data
        Landmark pisa=new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eiffel=new Landmark("Eiffel Tower","France",R.drawable.eifel);
        Landmark colosseum=new Landmark("Colosseum","Italy",R.drawable.colleseum);
        Landmark londonBridge= new Landmark("London Bridge","UK",R.drawable.londonbridge);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(londonBridge);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandMarkAdapter landMarkAdapter=new LandMarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landMarkAdapter);
    }
}
package com.irfanztrk.landmarkbookjava;

//import static com.irfanztrk.landmarkbookjava.MainActivity.chosenLandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.irfanztrk.landmarkbookjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent=getIntent();

        //Landmark selectedLandmark=(Landmark) intent.getSerializableExtra("landmark");

       // Landmark selectedLandmark=chosenLandmark;

        Singleton singleton=Singleton.getInstance();
        Landmark selectedLandmark=singleton.getSentLantmark();
        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);




    }
}
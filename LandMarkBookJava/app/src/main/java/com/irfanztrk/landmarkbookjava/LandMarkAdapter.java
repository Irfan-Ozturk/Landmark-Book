package com.irfanztrk.landmarkbookjava;

//import static com.irfanztrk.landmarkbookjava.MainActivity.chosenLandmark;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcelable;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.irfanztrk.landmarkbookjava.databinding.RecyclerRowBinding;

import java.io.Serializable;
import java.util.ArrayList;

public class LandMarkAdapter extends RecyclerView.Adapter<LandMarkAdapter.LandmarkHolder> {


    ArrayList<Landmark> landmarkArrayList;

    public LandMarkAdapter(ArrayList<Landmark> landmarkArrayList) {
        this.landmarkArrayList = landmarkArrayList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(recyclerRowBinding);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {

        holder.binding.recyclerViewTextView.setText(landmarkArrayList.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(holder.itemView.getContext(),DetailsActivity.class);
           //  chosenLandmark=landmarkArrayList.get(position);
               //intent.putExtra("landmark",landmarkArrayList.get(position));
               Singleton singleton=Singleton.getInstance();
               singleton.setSentLantmark(landmarkArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
        
    }

    @Override
    public int getItemCount() {
        return landmarkArrayList.size();

    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{

       private RecyclerRowBinding binding;

        public LandmarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}

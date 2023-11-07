package com.example.myrecyclerview_a189629.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecyclerview_a189629.Flower;
import com.example.myrecyclerview_a189629.FlowerDetailActivity;
import com.example.myrecyclerview_a189629.R;

import java.util.List;

public class FlowerRecyclerViewAdapter extends RecyclerView.Adapter<FlowerRecyclerViewAdapter.FlowerViewHolder> {

    public List<Flower> flowerList;
    private Context context;


    public FlowerRecyclerViewAdapter(Context context, List<Flower> flowerList) {
        this.context = context;
        this.flowerList = flowerList;
    }

    @NonNull
    @Override
    public FlowerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View flower_row = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower_row, null);

        FlowerViewHolder flowerVH = new FlowerViewHolder(flower_row);

        return flowerVH;
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder holder, int position) {
        holder.tvFlowerName.setText(flowerList.get(position).getName());
        holder.imgViewFlowerImage.setImageResource(flowerList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return flowerList.size();
    }

    public class FlowerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView tvFlowerName;
        public ImageView imgViewFlowerImage;


        public FlowerViewHolder(View itemView){
            super(itemView);
            tvFlowerName = itemView.findViewById(R.id.tv_flowerName);
            imgViewFlowerImage = itemView.findViewById(R.id.img_flower);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Flower Name: " +  flowerList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(view.getContext(), FlowerDetailActivity.class);
            intent.putExtra("flowerName", flowerList.get(getAdapterPosition()).getName());

            view.getContext().startActivity(intent);
        }
    }

}

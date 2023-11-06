package com.example.myrecyclerview_a189629.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.myrecyclerview_a189629.Beverage;
import com.example.myrecyclerview_a189629.BeverageDetailActivity;
import com.example.myrecyclerview_a189629.R;

import java.util.List;

public class BeverageRecyclerViewAdapter extends RecyclerView.Adapter<BeverageRecyclerViewAdapter.BeverageViewHolder> {

    public List<Beverage> beverageList;
    private Context context;


    public BeverageRecyclerViewAdapter(Context context, List<Beverage> beverageList) {
        this.context = context;
        this.beverageList = beverageList;
    }

    @NonNull
    @Override
    public BeverageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View beverage_row = LayoutInflater.from(parent.getContext()).inflate(R.layout.beverage_row, null);

        BeverageViewHolder beverageVH = new BeverageViewHolder(beverage_row);

        return beverageVH;
    }

    @Override
    public void onBindViewHolder(@NonNull BeverageViewHolder holder, int position) {
        holder.tvBeverageName.setText(beverageList.get(position).getName());
        holder.imgViewBeverageImage.setImageResource(beverageList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return beverageList.size();
    }

    public class BeverageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView tvBeverageName;
        public ImageView imgViewBeverageImage;


        public BeverageViewHolder(View itemView){
            super(itemView);
            tvBeverageName = itemView.findViewById(R.id.tv_beverageName);
            imgViewBeverageImage = itemView.findViewById(R.id.img_beverage);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Beverage Name: " +  beverageList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(view.getContext(), BeverageDetailActivity.class);
            intent.putExtra("beverageName", beverageList.get(getAdapterPosition()).getName());

            view.getContext().startActivity(intent);
        }
    }

}

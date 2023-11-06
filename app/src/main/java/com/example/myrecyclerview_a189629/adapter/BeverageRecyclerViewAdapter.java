package com.example.myrecyclerview_a189629.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.myrecyclerview_a189629.R;

public class BeverageRecyclerViewAdapter extends RecyclerView.Adapter<BeverageRecyclerViewAdapter.BeverageViewHolder> {
    public class BeverageViewHolder extends RecyclerView.ViewHolder{

        public TextView tvBeverageName;
        public ImageView imgViewBeverageImage;


        public BeverageViewHolder(View itemView){
            tvBeverageName = itemView.findViewById(R.id.tv_beverageName);
            imgViewBeverageImage = itemView.findViewById(R.id.img_beverage);
            super(itemView);
        }

    }

}

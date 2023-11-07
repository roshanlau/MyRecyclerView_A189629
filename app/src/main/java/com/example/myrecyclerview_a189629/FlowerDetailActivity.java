package com.example.myrecyclerview_a189629;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FlowerDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_detail);

        Intent intent = getIntent();

        TextView tvName = findViewById(R.id.tv_flowerName_detailActivity);
        tvName.setText(intent.getStringExtra("flowerName"));
    }
}
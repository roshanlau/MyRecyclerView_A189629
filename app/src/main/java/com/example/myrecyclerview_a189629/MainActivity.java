package com.example.myrecyclerview_a189629;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myrecyclerview_a189629.adapter.FlowerRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<Flower> allFlowerInfo = getAllFlowerInfo();

        FlowerRecyclerViewAdapter flowerRecyclerViewAdapter = new FlowerRecyclerViewAdapter(MainActivity.this, allFlowerInfo);
        recyclerView.setAdapter(flowerRecyclerViewAdapter);

    }

    private List<Flower> getAllFlowerInfo(){
        List<Flower> allFlower = new ArrayList<Flower>();

        allFlower.add(new Flower("Acacias", R.drawable.acacias));
        allFlower.add(new Flower("Acanthus", R.drawable.acanthus));
        allFlower.add(new Flower("Achillea", R.drawable.achillea));
        allFlower.add(new Flower("Aconite", R.drawable.aconite));
        allFlower.add(new Flower("Barberry", R.drawable.barberry));
        allFlower.add(new Flower("Basil", R.drawable.basil));
        allFlower.add(new Flower("Bindweed", R.drawable.bindweed));
        allFlower.add(new Flower("Brittlebush", R.drawable.brittlebush));
        allFlower.add(new Flower("Dahlia", R.drawable.dahlia));
        allFlower.add(new Flower("Dandelion", R.drawable.dandelion));
        allFlower.add(new Flower("Honeyflower", R.drawable.honeyflower));
        allFlower.add(new Flower("Impomoea", R.drawable.ipomoea));
        allFlower.add(new Flower("Japanese Morning Glory", R.drawable.japanesemorningglory));

        return allFlower;

    }
}
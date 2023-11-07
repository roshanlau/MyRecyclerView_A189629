package com.example.myrecyclerview_a189629;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myrecyclerview_a189629.adapter.BeverageRecyclerViewAdapter;

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

        List<Beverage> allBeverageInfo = getAllBeverageInfo();

        BeverageRecyclerViewAdapter beverageRecyclerViewAdapter = new BeverageRecyclerViewAdapter(MainActivity.this, allBeverageInfo);
        recyclerView.setAdapter(beverageRecyclerViewAdapter);

    }

    private List<Beverage> getAllBeverageInfo(){
        List<Beverage> allBeverage = new ArrayList<Beverage>();

        allBeverage.add(new Beverage("Acacias", R.drawable.acacias));
        allBeverage.add(new Beverage("Acanthus", R.drawable.acanthus));
        allBeverage.add(new Beverage("Achillea", R.drawable.achillea));
        allBeverage.add(new Beverage("Aconite", R.drawable.aconite));
        allBeverage.add(new Beverage("Barberry", R.drawable.barberry));
        allBeverage.add(new Beverage("Basil", R.drawable.basil));
        allBeverage.add(new Beverage("Bindweed", R.drawable.bindweed));
        allBeverage.add(new Beverage("Brittlebush", R.drawable.brittlebush));
        allBeverage.add(new Beverage("Dahlia", R.drawable.dahlia));
        allBeverage.add(new Beverage("Dandelion", R.drawable.dandelion));
        allBeverage.add(new Beverage("Honeyflower", R.drawable.honeyflower));
        allBeverage.add(new Beverage("Impomoea", R.drawable.ipomoea));
        allBeverage.add(new Beverage("Japanese Morning Glory", R.drawable.japanesemorningglory));

        return allBeverage;

    }
}
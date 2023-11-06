package com.example.myrecyclerview_a189629;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Beverage> allBeverageInfo = getAllBeverageInfo();

    }

    private List<Beverage> getAllBeverageInfo(){
        List<Beverage> allBeverage = new ArrayList<Beverage>();

        allBeverage.add(new Beverage("Flat White", R.drawable.flat_white));
        allBeverage.add(new Beverage("Affogato", R.drawable.affogato_2));
        allBeverage.add(new Beverage("Cappuccino", R.drawable.cappuccino_1));
        allBeverage.add(new Beverage("Cappuccino", R.drawable.cappuccino_2));
        allBeverage.add(new Beverage("Earl Grey", R.drawable.earl_grey));
        allBeverage.add(new Beverage("Espresso", R.drawable.espresso_1));
        allBeverage.add(new Beverage("Espresso", R.drawable.espresso_2));
        allBeverage.add(new Beverage("Green Tea", R.drawable.green_tea));
        allBeverage.add(new Beverage("Latte", R.drawable.latte_1));
        allBeverage.add(new Beverage("Latte", R.drawable.latte_2));
        allBeverage.add(new Beverage("Long Black", R.drawable.long_black));
        allBeverage.add(new Beverage("Long Black", R.drawable.long_black_2));
        allBeverage.add(new Beverage("Macchiato", R.drawable.macchiato));
        allBeverage.add(new Beverage("Mochaccino", R.drawable.mochaccino));

        return allBeverage;

    }
}
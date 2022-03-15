package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import Product.Banh_Donut;

public class MainActivity extends AppCompatActivity {
    ArrayList<Banh_Donut> listProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listProduct = new ArrayList<>();
        listProduct.add(new Banh_Donut("h1", "Tasty Donut","donut_red_1.png", "Spicy tasty donut family","$10.00"));
        listProduct.add(new Banh_Donut("h2", "Pink Donut","donut_yellow_1.png", "Spicy tasty donut family", "$20.00"));
        listProduct.add(new Banh_Donut("h3", "Floating Donut","green_donut_1.png", "Spicy tasty donut family", "$30.00"));
        listProduct.add(new Banh_Donut("h4", "Tasty Donut","pink_donut_1.png", "Spicy tasty donut family", "$30.00"));

    }
}
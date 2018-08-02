package com.example.evoliris.myapplication;

import android.os.Bundle;

public class SecondActivity extends MainActivity{



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String maValeur;
        maValeur = getIntent().getStringExtra("editTextContent");

    }




}

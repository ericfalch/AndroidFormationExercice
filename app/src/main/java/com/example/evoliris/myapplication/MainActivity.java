package com.example.evoliris.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button appuyer;
    private EditText monTexte;
    private TextView changeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monTexte = (EditText) findViewById(R.id.field);
        appuyer = (Button)findViewById(R.id.button);
        changeView = (Button)findViewById(R.id.nextView);


        Intent intent = new Intent(MainActivity.this, SecondActivity.class); // ou new Intent(this, SecondActivity) | this car on est déjà dans la classe
        intent.putExtra("editTextContent", "maValeur");
        startActivity(intent);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button: break;


        }

    }
}

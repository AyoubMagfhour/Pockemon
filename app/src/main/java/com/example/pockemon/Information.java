package com.example.pockemon;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    ProgressBar progressBar ;
    ImageView imageView;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        int imageId = getIntent().getIntExtra("imageId", 0);
        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(imageId);

        String nouvelleCouleurHex = getIntent().getStringExtra("bc");
        int col = Color.parseColor(nouvelleCouleurHex);
        imageView.setBackgroundColor(col);

        textView = findViewById(R.id.textView);
        String nouveauTexte = getIntent().getStringExtra("pokname");
        textView.setText(nouveauTexte);

        progressBar = findViewById(R.id.progressBar);
        int hp = getIntent().getIntExtra("HP", 0);
        progressBar.setProgress(hp);


        progressBar = findViewById(R.id.progressBar2);
        int attack = getIntent().getIntExtra("attack", 0);
        progressBar.setProgress(attack);

        progressBar = findViewById(R.id.progressBar3);
        int defence = getIntent().getIntExtra("defense", 0);
        progressBar.setProgress(defence);

        progressBar = findViewById(R.id.progressBar4);
        int spattack = getIntent().getIntExtra("sp attack", 0);
        progressBar.setProgress(spattack);

        progressBar = findViewById(R.id.progressBar5);
        int spdefence = getIntent().getIntExtra("sp defence", 0);
        progressBar.setProgress(spdefence);

        progressBar = findViewById(R.id.progressBar6);
        int speed = getIntent().getIntExtra("Speed", 0);
        progressBar.setProgress(speed);










    }
}
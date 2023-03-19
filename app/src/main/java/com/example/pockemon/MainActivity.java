package com.example.pockemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView16);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Information.class);
                intent.putExtra("imageId", R.drawable.jigglypuff);
                intent.putExtra("bc", "#DDBFC7");
                intent.putExtra("pokname", "jigglypuff");
                intent.putExtra("HP", 40);
                intent.putExtra("attack", 20);
                intent.putExtra("defense", 10);
                intent.putExtra("sp attack", 15);
                intent.putExtra("sp defence", 10);
                intent.putExtra("Speed", 10);
                startActivity(intent);
            }
        });

        imageView1 = findViewById(R.id.imageView17);
        imageView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Information.class);
                intent.putExtra("imageId", R.drawable.guzzlord);
                intent.putExtra("bc", "#C8474B54");
                intent.putExtra("pokname", "guzzlord");
                intent.putExtra("HP", 95);
                intent.putExtra("attack", 30);
                intent.putExtra("defense", 20);
                intent.putExtra("sp attack", 30);
                intent.putExtra("sp defence", 20);
                intent.putExtra("Speed", 15);
                startActivity(intent);
            }
        });

        imageView2 = findViewById(R.id.imageView10);
        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Information.class);
                intent.putExtra("imageId", R.drawable.absol);
                intent.putExtra("bc", "#DDBFC7");
                intent.putExtra("pokname", "Absol");
                intent.putExtra("HP", 20);
                intent.putExtra("attack", 40);
                intent.putExtra("defense", 20);
                intent.putExtra("sp attack", 25);
                intent.putExtra("sp defence", 20);
                intent.putExtra("Speed", 25);
                startActivity(intent);
            }
        });

        imageView3 = findViewById(R.id.imageView11);
        imageView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Information.class);
                intent.putExtra("imageId", R.drawable.accelgor);
                intent.putExtra("bc", "#DD3F51B5");
                intent.putExtra("pokname", "Accelgor");
                intent.putExtra("HP", 25);
                intent.putExtra("attack", 25);
                intent.putExtra("defense", 15);
                intent.putExtra("sp attack", 30);
                intent.putExtra("sp defence", 20);
                intent.putExtra("Speed", 45);
                startActivity(intent);
            }
        });


        imageView4 = findViewById(R.id.imageView8);
        imageView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Information.class);
                intent.putExtra("imageId", R.drawable.arcanine );
                intent.putExtra("bc", "#D7FF9800");
                intent.putExtra("pokname", "Arcanine");
                intent.putExtra("HP", 30);
                intent.putExtra("attack", 35);
                intent.putExtra("defense", 25);
                intent.putExtra("sp attack", 30);
                intent.putExtra("sp defence", 25);
                intent.putExtra("Speed", 30);
                startActivity(intent);
            }
        });

        imageView5 = findViewById(R.id.imageView9);
        imageView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Information.class);
                intent.putExtra("imageId", R.drawable.abra );
                intent.putExtra("bc", "#C3FFEB3B");
                intent.putExtra("pokname", "Abra");
                intent.putExtra("HP", 10);
                intent.putExtra("attack", 10);
                intent.putExtra("defense", 5);
                intent.putExtra("sp attack", 35);
                intent.putExtra("sp defence", 20);
                intent.putExtra("Speed", 30);
                startActivity(intent);
            }
        });


        imageView6 = findViewById(R.id.imageView19);
        imageView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Information.class);
                intent.putExtra("imageId", R.drawable.charizard);
                intent.putExtra("bc", "#A4FF9800");
                intent.putExtra("pokname", "Charizard");
                intent.putExtra("HP", 25);
                intent.putExtra("attack", 25);
                intent.putExtra("defense", 25);
                intent.putExtra("sp attack", 35);
                intent.putExtra("sp defence", 25);
                intent.putExtra("Speed", 30);
                startActivity(intent);
            }
        });

        imageView7 = findViewById(R.id.imageView18);
        imageView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Information.class);
                intent.putExtra("imageId", R.drawable.ivysaur);
                intent.putExtra("bc", "#9C00BCD4");
                intent.putExtra("pokname", "Ivysaur");
                intent.putExtra("HP", 20);
                intent.putExtra("attack", 20);
                intent.putExtra("defense", 20);
                intent.putExtra("sp attack", 25);
                intent.putExtra("sp defence", 25);
                intent.putExtra("Speed", 20);
                startActivity(intent);
            }
        });
    }
}

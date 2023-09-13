package com.example.pr14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    ImageView img1, img2, img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_osnovnoe);
        img1 = findViewById(R.id.imageView19);
        img1.setOnClickListener(this);
        img2 = findViewById(R.id.imageView20);
        img2.setOnClickListener(this);
        img3 = findViewById(R.id.imageView21);
        img3.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView19){
            startActivity(new Intent(this,MainActivity.class));
        }
        if(view.getId() == R.id.imageView20){
            startActivity(new Intent(this,glavnoe.class));
        }
        if(view.getId() == R.id.imageView21){
            startActivity(new Intent(this,statistik.class));
        }
    }
}
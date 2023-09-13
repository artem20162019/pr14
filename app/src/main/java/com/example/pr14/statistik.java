package com.example.pr14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class statistik extends AppCompatActivity implements View.OnClickListener {
    ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistik);
        img1 = findViewById(R.id.imageView16);
        img1.setOnClickListener(this);
        img2 = findViewById(R.id.imageView22);
        img2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView22){
            startActivity(new Intent(this,MainActivity.class));
        }
        if(view.getId() == R.id.imageView16){
            startActivity(new Intent(this,Menu.class));
        }
    }
}
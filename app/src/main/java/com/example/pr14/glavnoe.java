package com.example.pr14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class glavnoe extends AppCompatActivity implements View.OnClickListener {
    ImageView iv1, iv2,iv3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavnoe);
        iv1 = findViewById(R.id.imageView5);
        iv1.setOnClickListener(this);
        iv2 = findViewById(R.id.imageView7);
        iv2.setOnClickListener(this);
        iv3 = findViewById(R.id.imageView11);
        iv3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView5){
            startActivity(new Intent(this,MainActivity.class));
        }
        if(view.getId() == R.id.imageView7){
            startActivity(new Intent(this,sports.class));
        }
        if(view.getId() == R.id.imageView11){
            startActivity(new Intent(this,Menu.class));
        }
    }
}
package com.example.pr14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class sports extends AppCompatActivity implements View.OnClickListener {
    ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        img1 = findViewById(R.id.imageView12);
        img1.setOnClickListener(this);
        img2 = findViewById(R.id.imageView13);
        img2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageView12) {
            startActivity(new Intent(this, MainActivity.class));
        }
        if (view.getId() == R.id.imageView13) {
            startActivity(new Intent(this, Menu.class));
        }
    }
}
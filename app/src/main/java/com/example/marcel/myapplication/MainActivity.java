package com.example.marcel.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Spinner spinner;

    String[] buah = {"nanas","anggur","peer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.gambar);
        Glide.with(this).load("https://image.freepik.com/free-vector/abstract-logo-in-flame-shape_1043-44.jpg").into(imageView);

        spinner = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,buah);
        spinner.setAdapter(aa);
    }
}

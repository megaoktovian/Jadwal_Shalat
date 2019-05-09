package com.example.shalatreminder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailSholat extends AppCompatActivity {
    TextView tvDate, tvShubuh,tvDhuhur, tvAshar,  tvMaghrib, tvIsya;
    ImageView ivSholat;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        tvDate = findViewById(R.id.tvdate);
        tvShubuh = findViewById(R.id.tvshubuh);
        tvDhuhur = findViewById(R.id.tvdhuhur);
        tvAshar = findViewById(R.id.tvashar);
        tvMaghrib = findViewById(R.id.tvmaghrib);
        tvIsya = findViewById(R.id.tvisya);
        ivSholat = findViewById(R.id.ivsholat);


        String date = getIntent().getStringExtra("date");
        String shubuh = getIntent().getStringExtra("shubuh");
        String dhuhur = getIntent().getStringExtra("dhuhur");
        String ashar = getIntent().getStringExtra("ashar");
        String maghrib = getIntent().getStringExtra("maghrib");
        String isya = getIntent().getStringExtra("isya");
        int gambar = getIntent().getIntExtra("gambar",0);


        tvDate.setText(date);
        tvShubuh.setText(shubuh);
        tvDhuhur.setText(dhuhur);
        tvAshar.setText(ashar);
        tvMaghrib.setText(maghrib);
        tvIsya.setText(isya);


    }
}

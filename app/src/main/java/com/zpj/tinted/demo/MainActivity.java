package com.zpj.tinted.demo;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zpj.toolbar.demo.R;
import com.zpj.widget.tinted.TintedImageButton;
import com.zpj.widget.tinted.TintedImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TintedImageButton ib0;
    TintedImageButton ib1;
    TintedImageView iv0;
    TintedImageView iv1;
    TintedImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib0 = findViewById(R.id.ib_0);
        ib1 = findViewById(R.id.ib_1);
        iv0 = findViewById(R.id.iv_0);
        iv1 = findViewById(R.id.iv_1);
        iv2 = findViewById(R.id.iv_2);
        Button button = findViewById(R.id.btn_random_color);

        ib0.setOnClickListener(this);
        ib1.setOnClickListener(this);
        iv0.setOnClickListener(this);
        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_random_color:
                ib0.setTint(ColorStateList.valueOf(getRandomColor()));
                ib1.setTint(ColorStateList.valueOf(getRandomColor()));
                iv0.setTint(ColorStateList.valueOf(getRandomColor()));
                iv1.setTint(ColorStateList.valueOf(getRandomColor()));
                iv2.setTint(ColorStateList.valueOf(getRandomColor()));
                break;
            case R.id.ib_0:
                ib0.setTint(ColorStateList.valueOf(getRandomColor()));
                break;
            case R.id.ib_1:
                ib1.setTint(ColorStateList.valueOf(getRandomColor()));
                break;
            case R.id.iv_0:
                iv0.setTint(ColorStateList.valueOf(getRandomColor()));
                break;
            case R.id.iv_1:
                iv1.setTint(ColorStateList.valueOf(getRandomColor()));
                break;
            case R.id.iv_2:
                iv2.setTint(ColorStateList.valueOf(getRandomColor()));
                break;
        }
    }

    private int getRandomColor() {
        return Color.rgb(new Random().nextInt(255),
                new Random().nextInt(255),
                new Random().nextInt(255));
    }

}

package com.silentme.simon.foodreview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.File;

public class ItemShowActivity extends AppCompatActivity {


    int[] images = {
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3,
            R.drawable.f4,
            R.drawable.f5,
            R.drawable.f6,
            R.drawable.f7,
            R.drawable.f8,
            R.drawable.f9,
            R.drawable.f10


    };

    LinearLayout myGallery;
    LinearLayout topLayout;
    Button PlaceBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_show);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        topLayout = (LinearLayout)findViewById(R.id.topLinearLayout);
        PlaceBtn = (Button) findViewById(R.id.placesBtn);

        // ------ test -----

        LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
        for (int i = 0; i < 10; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(2, 2, 0, 0);
            imageView.setImageBitmap(BitmapFactory.decodeResource(
                    getResources(), R.drawable.f1));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            layout.addView(imageView);
        }
        // -----------------------



    }
    }



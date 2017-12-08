package com.silentme.simon.foodreview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GallaryActivity extends AppCompatActivity {


    //------------- initial codes -----------

    GridView grid;
    String[] web = {
            "item1",
            "item2",
            "item3",
            "item4",
            "item5",
            "item6",
            "item7",
            "item8",
            "item9",
            "item10"

    };
    int[] imageId = {
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //---------- Custom GridView Implementation -------------

        CustomGrid adapter = new CustomGrid(GallaryActivity.this, web, imageId);

        grid = (GridView) findViewById(R.id.grid);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(GallaryActivity.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();

                if(web[+position]=="item1"){

                        Intent intent = new Intent(GallaryActivity.this,ItemShowActivity.class);
                        startActivity(intent);

                    }



            }


        });


    }
}

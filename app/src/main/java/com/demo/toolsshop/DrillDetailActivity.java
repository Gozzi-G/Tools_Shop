package com.demo.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrillDetailActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private TextView textViewDrillDescription;
    private ImageView imageViewDrill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_detail);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        textViewTitle = findViewById(R.id.textViewDrillTitle);
        textViewDrillDescription = findViewById(R.id.textViewDrillDescription);
        imageViewDrill = findViewById(R.id.imageViewDrill);

        Intent intent = getIntent();
        if (intent.hasExtra("title") && intent.hasExtra("info") && intent.hasExtra("imageResourceId")) {
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            int imageResourceId = intent.getIntExtra("imageResourceId", -1);
            textViewTitle.setText(title);
            textViewDrillDescription.setText(info);
            imageViewDrill.setImageResource(imageResourceId);
        } else {
            Intent backToDrillCategoryActivity = new Intent(this, DrillDetailActivity.class);
            startActivity(backToDrillCategoryActivity);
        }

    }
}

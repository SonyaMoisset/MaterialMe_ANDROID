package com.example.android.materialme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class DetailActivity extends AppCompatActivity {

    private TextView mSportsTitle;
    private ImageView mSportsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mSportsTitle = (TextView) findViewById(R.id.titleDetail);
        mSportsImage = (ImageView) findViewById(R.id.sportsImageDetail);

        mSportsTitle.setText(getIntent().getStringExtra("title"));

        Glide.with(this).load(getIntent().getIntExtra("image_resource", 0))
                .into(mSportsImage);
    }
}

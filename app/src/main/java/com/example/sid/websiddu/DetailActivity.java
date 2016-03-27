package com.example.sid.websiddu;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Project project = (Project) getIntent().getSerializableExtra("project");

        TextView projectName = (TextView) findViewById(R.id.project_name);
        projectName.setText(project.getTitle());

        ImageView cardBanner = (ImageView) findViewById(R.id.banner_image);

        Picasso.with(getBaseContext()).load(project.getBanner())
                .into(cardBanner);

        WebView content = (WebView) findViewById(R.id.content);
        content.loadData(project.getDescription(), "text/html", null);



    }



}

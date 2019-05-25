package com.example.dell.tarkaribajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class RetailerActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("All Products");
        setSupportActionBar(toolbar);
    }
}

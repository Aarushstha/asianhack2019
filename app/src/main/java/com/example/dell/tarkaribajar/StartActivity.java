package com.example.dell.tarkaribajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    private Button farmer;
    private Button retailer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        farmer=(Button)findViewById(R.id.btnFarmer);
        retailer=(Button)findViewById(R.id.btnRetailer);

        farmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents=new Intent(StartActivity.this,MainActivity.class);
                startActivity(intents);
                finish();
            }
        });

        retailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents=new Intent(StartActivity.this,RsignActivity.class);
                startActivity(intents);
                finish();
            }
        });







    }
}

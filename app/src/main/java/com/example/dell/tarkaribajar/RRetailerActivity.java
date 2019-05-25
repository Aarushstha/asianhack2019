package com.example.dell.tarkaribajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RRetailerActivity extends AppCompatActivity {
    private EditText fusername;
    private EditText fpassword;
    private Button Fregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rretailer);
        fusername = (EditText) findViewById(R.id.txtRegister);
        fpassword = (EditText) findViewById(R.id.registerPassword);
        Fregister = (Button) findViewById(R.id.btnRetailer);

        Fregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(fusername.getText().toString().trim()) && !TextUtils.isEmpty(fpassword.getText().toString().trim())) {

                    Intent intents = new Intent(RRetailerActivity.this, RsignActivity.class);
                    startActivity(intents);
                    finish();
                }


            }
        });

    }
}

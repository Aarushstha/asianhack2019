package com.example.dell.tarkaribajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RsignActivity extends AppCompatActivity {
    private EditText rusername;
    private EditText rpassword;
    private Button rlogin;
    private Button rsign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsign);

        rusername = (EditText) findViewById(R.id.txtUsername1);
        rpassword = (EditText) findViewById(R.id.txtPassword1);
        rlogin = (Button) findViewById(R.id.btnLogin1);
        rsign = (Button) findViewById(R.id.btnSign1);

        rlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(rusername.getText().toString().trim()) && !TextUtils.isEmpty(rpassword.getText().toString().trim())) {
                    Intent intents = new Intent(RsignActivity.this, RetailerActivity.class);
                    startActivity(intents);
                    finish();
                }
                else{
                    Toast.makeText(RsignActivity.this, "Username and password cannot be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents = new Intent(RsignActivity.this, RRetailerActivity.class);
                startActivity(intents);
                finish();
            }
        });

    }
}

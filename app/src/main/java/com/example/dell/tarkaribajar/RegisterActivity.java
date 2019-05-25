package com.example.dell.tarkaribajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText username1;
    private EditText password1;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username1=(EditText)findViewById(R.id.rusername);
        password1=(EditText)findViewById(R.id.rPassword);
        register=(Button)findViewById(R.id.btnRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents=new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(intents);
                finish();
            }
        });

    }
}

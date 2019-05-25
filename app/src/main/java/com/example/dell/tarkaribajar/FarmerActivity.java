 package com.example.dell.tarkaribajar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

 public class FarmerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
     Toolbar toolbar;
     private DrawerLayout mDrawerLayout;
     private ActionBarDrawerToggle mToggle;
     private NavigationView navigationView;
     FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Products");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.navigation_back);
        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        navigationView=(NavigationView) findViewById(R.id.navigationView);
        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        fab=(FloatingActionButton)findViewById(R.id.Fab);
        navigationView.setNavigationItemSelectedListener(this);


    }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         if(mToggle.onOptionsItemSelected(item)){
             return true;
         }

         return super.onOptionsItemSelected(item);
     }

     @Override
     public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id= menuItem.getItemId();
        if (id==R.id.logout){
            Intent intent= new Intent(this, StartActivity.class);
            startActivity(intent);
        }
         return false;
     }
 }

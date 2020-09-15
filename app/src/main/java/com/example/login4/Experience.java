package com.example.login4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class Experience extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    TextView eTitle1, eTitle2, eTitle3, eContent1, eContent2, eContent3;
    private DrawerLayout drawer;
    private NavigationView navigationView;
    DatabaseReference mDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        //TextView
        eTitle1 = (TextView)findViewById(R.id.movie_experience1_title1);
        eTitle2 = (TextView)findViewById(R.id.movie_experience2_title1);
        eTitle3 = (TextView)findViewById(R.id.movie_experience3_title1);
        eContent1 = (TextView)findViewById(R.id.movie_experience1_info1);
        eContent2 = (TextView)findViewById(R.id.movie_experience2_info1);
        eContent3 = (TextView)findViewById(R.id.movie_experience3_info1);

        //take data from firebase
        mDataBase = FirebaseDatabase.getInstance().getReference().child("MovieExperience");
        mDataBase.child("Experience1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String ExperienceName1 = dataSnapshot.child("ExperienceName1").getValue().toString();
                String ExperienceContent1 = dataSnapshot.child("ExperienceContent1").getValue().toString();
                eTitle1.setText(ExperienceName1);
                eContent1.setText(ExperienceContent1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("Experience2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String ExperienceName2 = dataSnapshot.child("ExperienceName2").getValue().toString();
                String ExperienceContent2 = dataSnapshot.child("ExperienceContent2").getValue().toString();
                eTitle2.setText(ExperienceName2);
                eContent2.setText(ExperienceContent2);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("Experience3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String ExperienceName3 = dataSnapshot.child("ExperienceName3").getValue().toString();
                String ExperienceContent3 = dataSnapshot.child("ExperienceContent3").getValue().toString();
                eTitle3.setText(ExperienceName3);
                eContent3.setText(ExperienceContent3);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        drawer=findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;

        switch (item.getItemId())
        {
            case R.id.nav_home:
                intent = new Intent( Experience.this,Home.class);
                startActivity(intent);
                break;
            case R.id.nav_faq:
                intent = new Intent( Experience.this,Faq.class);
                startActivity(intent);
                break;
            case R.id.nav_policy:
                intent = new Intent(Experience.this, Policy.class);
                startActivity(intent);
                break;
            case R.id.experiences:
                intent = new Intent( Experience.this,Experience.class);
                startActivity(intent);
                break;
            case R.id.showtime:
                intent = new Intent( Experience.this,SelectMovie.class);
                startActivity(intent);
                break;
            case R.id.nav_popular:
                intent = new Intent( Experience.this,Popular.class);
                startActivity(intent);
                break;
            case R.id.nav_now_showing:
                intent = new Intent( Experience.this,NowShowing.class);
                startActivity(intent);
                break;
            case R.id.nav_coming_soon:
                intent = new Intent( Experience.this,ComingSoon.class);
                startActivity(intent);
                break;
            case R.id.nav_editAccount:
                intent = new Intent( Experience.this,MainActivity.class);
                startActivity(intent);
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }


}
package com.example.login4;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class NowShowing14Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DatabaseReference databaseReference;
    ImageView imageView14;
    TextView movie_nowShowing14_title1,movie_nowShowing14_subtitle1,movie_nowShowing14_subtitle3;

    private DrawerLayout drawer;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_now_showing14);

        imageView14=findViewById(R.id.imageView14);
        movie_nowShowing14_title1=(TextView)findViewById(R.id.movie_nowShowing14_title1);
        movie_nowShowing14_subtitle1=(TextView)findViewById(R.id.movie_nowShowing14_subtitle1);
        movie_nowShowing14_subtitle3=(TextView)findViewById(R.id.movie_nowShowing14_subtitle3);

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
                intent = new Intent( NowShowing14Activity.this,Home.class);
                startActivity(intent);
                break;
            case R.id.nav_faq:
                intent = new Intent( NowShowing14Activity.this,Faq.class);
                startActivity(intent);
                break;
            case R.id.nav_policy:
                intent = new Intent(NowShowing14Activity.this, Policy.class);
                startActivity(intent);
                break;
            case R.id.experiences:
                intent = new Intent( NowShowing14Activity.this,Experience.class);
                startActivity(intent);
                break;
            case R.id.showtime:
                intent = new Intent( NowShowing14Activity.this,SelectMovie.class);
                startActivity(intent);
                break;
            case R.id.nav_popular:
                intent = new Intent( NowShowing14Activity.this,Popular.class);
                startActivity(intent);
                break;
            case R.id.nav_now_showing:
                intent = new Intent( NowShowing14Activity.this,NowShowing.class);
                startActivity(intent);
                break;
            case R.id.nav_coming_soon:
                intent = new Intent( NowShowing14Activity.this,ComingSoon.class);
                startActivity(intent);
                break;
            case R.id.nav_editAccount:
                intent = new Intent( NowShowing14Activity.this,MainActivity.class);
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

    @Override
    protected void onStart() {
        super.onStart();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("category1").child("NowShowing14");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("MovieName14").getValue().toString();
                String info=dataSnapshot.child("MovieInfo14").getValue().toString();
                String synopsis=dataSnapshot.child("MovieSynopsis14").getValue().toString();
                String link = dataSnapshot.child("MovieImage14").getValue(String.class);

                movie_nowShowing14_subtitle1.setText(synopsis);
                movie_nowShowing14_title1.setText(name);
                movie_nowShowing14_subtitle3.setText(info);
                Picasso.get().load(link).into(imageView14);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
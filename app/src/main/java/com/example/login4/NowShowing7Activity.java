package com.example.login4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class NowShowing7Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    private DatabaseReference databaseReference;
    ImageView imageView7;
    TextView movie_nowShowing7_title1,movie_nowShowing7_subtitle1,movie_nowShowing7_subtitle3;

    private DrawerLayout drawer;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_now_showing7);

        imageView7=findViewById(R.id.imageView7);
        movie_nowShowing7_title1=(TextView)findViewById(R.id.movie_nowShowing7_title1);
        movie_nowShowing7_subtitle1=(TextView)findViewById(R.id.movie_nowShowing7_subtitle1);
        movie_nowShowing7_subtitle3=(TextView)findViewById(R.id.movie_nowShowing7_subtitle3);

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
                intent = new Intent( NowShowing7Activity.this,Home.class);
                startActivity(intent);
                break;
            case R.id.nav_faq:
                intent = new Intent( NowShowing7Activity.this,Faq.class);
                startActivity(intent);
                break;
            case R.id.nav_policy:
                intent = new Intent(NowShowing7Activity.this, Policy.class);
                startActivity(intent);
                break;
            case R.id.experiences:
                intent = new Intent( NowShowing7Activity.this,Experience.class);
                startActivity(intent);
                break;
            case R.id.showtime:
                intent = new Intent( NowShowing7Activity.this,SelectMovie.class);
                startActivity(intent);
                break;
            case R.id.nav_popular:
                intent = new Intent( NowShowing7Activity.this,Popular.class);
                startActivity(intent);
                break;
            case R.id.nav_now_showing:
                intent = new Intent( NowShowing7Activity.this,NowShowing.class);
                startActivity(intent);
                break;
            case R.id.nav_coming_soon:
                intent = new Intent( NowShowing7Activity.this,ComingSoon.class);
                startActivity(intent);
                break;
            case R.id.nav_editAccount:
                intent = new Intent( NowShowing7Activity.this,MainActivity.class);
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
        databaseReference = FirebaseDatabase.getInstance().getReference().child("category1").child("NowShowing7");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("MovieName7").getValue().toString();
                String info=dataSnapshot.child("MovieInfo7").getValue().toString();
                String synopsis=dataSnapshot.child("MovieSynopsis7").getValue().toString();
                String link = dataSnapshot.child("MovieImage7").getValue(String.class);

                movie_nowShowing7_subtitle1.setText(synopsis);
                movie_nowShowing7_title1.setText(name);
                movie_nowShowing7_subtitle3.setText(info);
                Picasso.get().load(link).into(imageView7);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
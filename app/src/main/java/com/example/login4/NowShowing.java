package com.example.login4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class NowShowing extends AppCompatActivity {

    TextView mnName1, mnName2, mnName3, mnName4, mnName5, mnName6, mnName7, mnName8,
            mnName9, mnName10, mnName11, mnName12, mnName13, mnName14, mnName15, mnName16, mnName17;
    ImageView mnImage1, mnImage2, mnImage3, mnImage4, mnImage5, mnImage6, mnImage7, mnImage8,
            mnImage9, mnImage10, mnImage11, mnImage12, mnImage13, mnImage14, mnImage15, mnImage16, mnImage17;
    DatabaseReference mDataBase;

    public void back_nowShowing(View view){
        // This is close page
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_showing);
        //Intent intent = getIntent();
        //ImageView
        mnImage1 = (ImageView)findViewById(R.id.movie_nowShowing1_image1);
        mnImage2 = (ImageView)findViewById(R.id.movie_nowShowing2_image1);
        mnImage3 = (ImageView)findViewById(R.id.movie_nowShowing3_image1);
        mnImage4 = (ImageView)findViewById(R.id.movie_nowShowing4_image1);
        mnImage5 = (ImageView)findViewById(R.id.movie_nowShowing5_image1);
        mnImage6 = (ImageView)findViewById(R.id.movie_nowShowing6_image1);
        mnImage7 = (ImageView)findViewById(R.id.movie_nowShowing7_image1);
        mnImage8 = (ImageView)findViewById(R.id.movie_nowShowing8_image1);
        mnImage9 = (ImageView)findViewById(R.id.movie_nowShowing9_image1);
        mnImage10 = (ImageView)findViewById(R.id.movie_nowShowing10_image1);
        mnImage11 = (ImageView)findViewById(R.id.movie_nowShowing11_image1);
        mnImage12 = (ImageView)findViewById(R.id.movie_nowShowing12_image1);
        mnImage13 = (ImageView)findViewById(R.id.movie_nowShowing13_image1);
        mnImage14 = (ImageView)findViewById(R.id.movie_nowShowing14_image1);
        mnImage15 = (ImageView)findViewById(R.id.movie_nowShowing15_image1);
        mnImage16 = (ImageView)findViewById(R.id.movie_nowShowing16_image1);
        mnImage17 = (ImageView)findViewById(R.id.movie_nowShowing17_image1);

        //TextView
        mnName1 = (TextView)findViewById(R.id.movie_nowShowing1_title1);
        mnName2 = (TextView)findViewById(R.id.movie_nowShowing2_title1);
        mnName3 = (TextView)findViewById(R.id.movie_nowShowing3_title1);
        mnName4 = (TextView)findViewById(R.id.movie_nowShowing4_title1);
        mnName5 = (TextView)findViewById(R.id.movie_nowShowing5_title1);
        mnName6 = (TextView)findViewById(R.id.movie_nowShowing6_title1);
        mnName7 = (TextView)findViewById(R.id.movie_nowShowing7_title1);
        mnName8 = (TextView)findViewById(R.id.movie_nowShowing8_title1);
        mnName9 = (TextView)findViewById(R.id.movie_nowShowing9_title1);
        mnName10 = (TextView)findViewById(R.id.movie_nowShowing10_title1);
        mnName11 = (TextView)findViewById(R.id.movie_nowShowing11_title1);
        mnName12 = (TextView)findViewById(R.id.movie_nowShowing12_title1);
        mnName13 = (TextView)findViewById(R.id.movie_nowShowing13_title1);
        mnName14 = (TextView)findViewById(R.id.movie_nowShowing14_title1);
        mnName15 = (TextView)findViewById(R.id.movie_nowShowing15_title1);
        mnName16 = (TextView)findViewById(R.id.movie_nowShowing16_title1);
        mnName17 = (TextView)findViewById(R.id.movie_nowShowing17_title1);

        mnImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing1();
            }

        });

        mnImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing2();
            }

        });

        mnImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing3();
            }

        });

        mnImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing4();
            }

        });

        mnImage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing5();
            }

        });

        mnImage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing6();
            }

        });

        mnImage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing7();
            }

        });

        mnImage8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing8();
            }

        });

        mnImage9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing9();
            }

        });

        mnImage10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing10();
            }

        });

        mnImage11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing11();
            }

        });

        mnImage12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing12();
            }

        });

        mnImage13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing13();
            }

        });

        mnImage14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing14();
            }

        });

        mnImage15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing15();
            }

        });

        mnImage16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing16();
            }

        });

        mnImage17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowShowing17();
            }

        });

        //take data from firebase
        mDataBase = FirebaseDatabase.getInstance().getReference().child("category1");

        mDataBase.child("Nowshowing1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage1").getValue(String.class);
                String MovieName1 = dataSnapshot.child("MovieName1").getValue().toString();
                Picasso.get().load(link).into(mnImage1);
                mnName1.setText(MovieName1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("Nowshowing2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage2").getValue(String.class);
                String MovieName2 = dataSnapshot.child("MovieName2").getValue().toString();
                Picasso.get().load(link).into(mnImage2);
                mnName2.setText(MovieName2);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage3").getValue(String.class);
                String MovieName3 = dataSnapshot.child("MovieName3").getValue().toString();
                Picasso.get().load(link).into(mnImage3);
                mnName3.setText(MovieName3);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage4").getValue(String.class);
                String MovieName4 = dataSnapshot.child("MovieName4").getValue().toString();
                Picasso.get().load(link).into(mnImage4);
                mnName4.setText(MovieName4);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage5").getValue(String.class);
                String MovieName5 = dataSnapshot.child("MovieName5").getValue().toString();
                Picasso.get().load(link).into(mnImage5);
                mnName5.setText(MovieName5);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage6").getValue(String.class);
                String MovieName6 = dataSnapshot.child("MovieName6").getValue().toString();
                Picasso.get().load(link).into(mnImage6);
                mnName6.setText(MovieName6);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage7").getValue(String.class);
                String MovieName7 = dataSnapshot.child("MovieName7").getValue().toString();
                Picasso.get().load(link).into(mnImage7);
                mnName7.setText(MovieName7);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage8").getValue(String.class);
                String MovieName8 = dataSnapshot.child("MovieName8").getValue().toString();
                Picasso.get().load(link).into(mnImage8);
                mnName8.setText(MovieName8);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage9").getValue(String.class);
                String MovieName9 = dataSnapshot.child("MovieName9").getValue().toString();
                Picasso.get().load(link).into(mnImage9);
                mnName9.setText(MovieName9);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage10").getValue(String.class);
                String MovieName10 = dataSnapshot.child("MovieName10").getValue().toString();
                Picasso.get().load(link).into(mnImage10);
                mnName10.setText(MovieName10);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing11").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage11").getValue(String.class);
                String MovieName11 = dataSnapshot.child("MovieName11").getValue().toString();
                Picasso.get().load(link).into(mnImage11);
                mnName11.setText(MovieName11);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing12").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage12").getValue(String.class);
                String MovieName12 = dataSnapshot.child("MovieName12").getValue().toString();
                Picasso.get().load(link).into(mnImage12);
                mnName12.setText(MovieName12);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing13").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage13").getValue(String.class);
                String MovieName13 = dataSnapshot.child("MovieName13").getValue().toString();
                Picasso.get().load(link).into(mnImage13);
                mnName13.setText(MovieName13);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing14").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage14").getValue(String.class);
                String MovieName14 = dataSnapshot.child("MovieName14").getValue().toString();
                Picasso.get().load(link).into(mnImage14);
                mnName14.setText(MovieName14);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing15").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage15").getValue(String.class);
                String MovieName15 = dataSnapshot.child("MovieName15").getValue().toString();
                Picasso.get().load(link).into(mnImage15);
                mnName15.setText(MovieName15);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing16").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage16").getValue(String.class);
                String MovieName16 = dataSnapshot.child("MovieName16").getValue().toString();
                Picasso.get().load(link).into(mnImage16);
                mnName16.setText(MovieName16);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing17").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage17").getValue(String.class);
                String MovieName17 = dataSnapshot.child("MovieName17").getValue().toString();
                Picasso.get().load(link).into(mnImage17);
                mnName17.setText(MovieName17);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }

    public void openNowShowing1(){
        Intent intent = new Intent(this, NowShowing1Activity.class);
        startActivity(intent);
    }

    public void openNowShowing2(){
        Intent intent = new Intent(this, NowShowing2Activity.class);
        startActivity(intent);
    }

    public void openNowShowing3(){
        Intent intent = new Intent(this, NowShowing3Activity.class);
        startActivity(intent);
    }

    public void openNowShowing4(){
        Intent intent = new Intent(this, NowShowing4Activity.class);
        startActivity(intent);
    }

    public void openNowShowing5(){
        Intent intent = new Intent(this, NowShowing5Activity.class);
        startActivity(intent);
    }

    public void openNowShowing6(){
        Intent intent = new Intent(this, NowShowing6Activity.class);
        startActivity(intent);
    }

    public void openNowShowing7(){
        Intent intent = new Intent(this, NowShowing7Activity.class);
        startActivity(intent);
    }

    public void openNowShowing8(){
        Intent intent = new Intent(this, NowShowing8Activity.class);
        startActivity(intent);
    }

    public void openNowShowing9(){
        Intent intent = new Intent(this, NowShowing9Activity.class);
        startActivity(intent);
    }

    public void openNowShowing10(){
        Intent intent = new Intent(this, NowShowing10Activity.class);
        startActivity(intent);
    }

    public void openNowShowing11(){
        Intent intent = new Intent(this, NowShowing11Activity.class);
        startActivity(intent);
    }

    public void openNowShowing12(){
        Intent intent = new Intent(this, NowShowing12Activity.class);
        startActivity(intent);
    }

    public void openNowShowing13(){
        Intent intent = new Intent(this, NowShowing13Activity.class);
        startActivity(intent);
    }

    public void openNowShowing14(){
        Intent intent = new Intent(this, NowShowing14Activity.class);
        startActivity(intent);
    }

    public void openNowShowing15(){
        Intent intent = new Intent(this, NowShowing15Activity.class);
        startActivity(intent);
    }

    public void openNowShowing16(){
        Intent intent = new Intent(this, NowShowing16Activity.class);
        startActivity(intent);
    }

    public void openNowShowing17(){
        Intent intent = new Intent(this, NowShowing17Activity.class);
        startActivity(intent);
    }

}
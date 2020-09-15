package com.example.login4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SelectSeat extends AppCompatActivity {
    private static final String LOG_TAG =
            ShowTime.class.getSimpleName();
    public static String EXTRA_MESSAGE =
            "com.example.android.login4.extra.MESSAGE";
    public static String EXTRA_COUNT =
            "com.example.android.login4.extra.COUNT";
    public static String EXTRA_MOVIEDETAIL =
            "com.example.android.login4.extra.MOVIEDEATIL";
    public static String EXTRA_MOVIENAME =
            "com.example.android.login4.extra.MOVIENAME";
    public static String tag = "";
    public static Integer intCount = 0;
    public static String movieDetail;
    public static String movieName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_seat);
        Intent intent = getIntent();
        String message = intent.getStringExtra(ShowTime.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.movie_title);
        textView.setText(message);
        String location = intent.getStringExtra(ShowTime.EXTRA_LOCATION);
        String date = intent.getStringExtra(ShowTime.EXTRA_DATE);
        String time = intent.getStringExtra(ShowTime.EXTRA_TIME);
        TextView textView1 = findViewById(R.id.movie_detail);
        textView1.setText(String.format("%s\n%s, %s", location, date, time));
        movieDetail = textView1.getText().toString();
        movieName = textView.getText().toString();
    }


    public void onCheckboxClicked(View view) {
        // is the view now checked.
        boolean checked = ((CheckBox) view).isChecked();

        // check which checkbox is checked?
        switch (view.getId()) {
            case R.id.A1:
                if (checked){
                    tag = tag + "A1 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.A2:
                if (checked){
                    tag = tag + "A2 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.A3:
                if (checked){
                    tag = tag + "A3 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.A4:
                if (checked){
                    tag = tag + "A4 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.A5:
                if (checked){
                    tag = tag + "A5 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.A6:
                if (checked){
                    tag = tag + "A6 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.B1:
                if (checked){
                    tag = tag + "B1 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.B2:
                if (checked){
                    tag = tag + "B2 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.B3:
                if (checked){
                    tag = tag + "B3 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.B4:
                if (checked){
                    tag = tag + "B4 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.B5:
                if (checked){
                    tag = tag + "B5 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.B6:
                if (checked){
                    tag = tag + "B6 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.C1:
                if (checked){
                    tag = tag + "C1 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.C2:
                if (checked){
                    tag = tag + "C2 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.C3:
                if (checked){
                    tag = tag + "C3 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.C4:
                if (checked){
                    tag = tag + "C4 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.C5:
                if (checked){
                    tag = tag + "C5 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.C6:
                if (checked){
                    tag = tag + "C6 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.D1:
                if (checked){
                    tag = tag + "D1 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.D2:
                if (checked){
                    tag = tag + "D2 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.D3:
                if (checked){
                    tag = tag + "D3 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.D4:
                if (checked){
                    tag = tag + "D4 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.D5:
                if (checked){
                    tag = tag + "D5 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.D6:
                if (checked){
                    tag = tag + "D6 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.E1:
                if (checked){
                    tag = tag + "E1 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.E2:
                if (checked){
                    tag = tag + "E2 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.E3:
                if (checked){
                    tag = tag + "E3 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.E4:
                if (checked){
                    tag = tag + "E4 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.E5:
                if (checked){
                    tag = tag + "E5 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.E6:
                if (checked){
                    tag = tag + "E6 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.F1:
                if (checked){
                    tag = tag + "F1 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.F2:
                if (checked){
                    tag = tag + "F2 ";
                    intCount+=1;
                }else {
                    intCount -= 1;
                }
                break;
            case R.id.F3:
                if (checked){
                    tag = tag + "F3 ";
                    intCount+=1;
                }else {
                intCount -= 1;
            }
                break;
            case R.id.F4:
                if (checked){
                    tag = tag + "F4 ";
                intCount+=1;
            }else {
                intCount -= 1;
            }
                break;
            case R.id.F5:
                if (checked){
                    tag = tag + "F5 ";
                intCount+=1;
            }else {
                intCount -= 1;
            }
                break;
            case R.id.F6:
                if (checked){
                    tag = tag + "F6 ";
                intCount+=1;
            }else {
                intCount -= 1;
            }
                break;
        }
    }

    public void launchEComboActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, ConfirmTicket.class);
        intent.putExtra(EXTRA_MESSAGE, tag);
        intent.putExtra(EXTRA_COUNT, intCount.toString());
        movieDetail = movieDetail +"\n"+ tag;
        intent.putExtra(EXTRA_MOVIEDETAIL, movieDetail);
        intent.putExtra(EXTRA_MOVIENAME,movieName);
        startActivity(intent);
    }
}
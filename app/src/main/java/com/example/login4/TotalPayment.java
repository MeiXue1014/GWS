package com.example.login4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class TotalPayment extends AppCompatActivity {
    private TextView adult;
    private TextView children;
    private TextView adultprice;
    private TextView childrenprice;
    private TextView combolist;
    private TextView comboprice;
    private TextView totalprice;
    private Button btnConfirm;

    public static String movieDetail;
    public static String movieName;
    public static String code;

    private Ticket ticket;
    private DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_payment);

        // Write a message to the database
        ticket = new Ticket();
        ref = FirebaseDatabase.getInstance().getReference().child("Ticket");


        Intent intent = getIntent();
        String message1 = intent.getStringExtra(ECombo.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(ECombo.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(ECombo.EXTRA_MESSAGE3);
        String message4 = intent.getStringExtra(ECombo.EXTRA_MESSAGE4);
        String ticketPrice = intent.getStringExtra(ECombo.EXTRA_TICKETPRICE);
        String comboName = intent.getStringExtra(ECombo.EXTRA_COMBONAME);
        String comboPrice = intent.getStringExtra(ECombo.EXTRA_COMBOPRICE);
        String comboTotal = intent.getStringExtra(ECombo.EXTRA_COMBOTOTAL);
        movieDetail = intent.getStringExtra(ECombo.EXTRA_MOVIEDETAIL);
        movieName = intent.getStringExtra(ECombo.EXTRA_MOVIENAME);

        TextView adult = findViewById(R.id.adult);
        TextView children = findViewById(R.id.children);
        TextView adultprice = findViewById(R.id.adultprice);
        TextView childrenprice = findViewById(R.id.childrenprice);
        TextView combolist = findViewById(R.id.combolist);
        TextView comboprice = findViewById(R.id.comboprice);
        TextView totalprice = findViewById(R.id.totalprice);
        Button btnConfirm = findViewById(R.id.btnConfirm);

        adult.setText(message1);
        children.setText(message2);
        adultprice.setText(message3);
        childrenprice.setText(message4);
        combolist.setText(comboName);
        comboprice.setText(comboPrice);
        totalprice.setText(String.format("RM %s.00", String.valueOf((Integer.parseInt(ticketPrice)) +
                (Integer.parseInt(comboTotal)))));

        btnConfirm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                code = getRandomNumberString();
                ticket.setTicketName(movieName);
                ticket.setTicketDetail(movieDetail);
                ticket.setCode(code);
                ref.child("ticket5").setValue(ticket);
                Toast.makeText(TotalPayment.this,R.string.toast_message1,Toast.LENGTH_LONG).show();
            }
        });
    }


    public static String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }

}
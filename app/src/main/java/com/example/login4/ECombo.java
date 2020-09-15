package com.example.login4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ECombo extends AppCompatActivity {
    private static final String LOG_TAG =
            ConfirmTicket.class.getSimpleName();
    public static final String EXTRA_MESSAGE1 =
            "com.example.android.login4.extra.MESSAGE1";
    public static final String EXTRA_MESSAGE2 =
            "com.example.android.login4.extra.MESSAGE2";
    public static final String EXTRA_MESSAGE3 =
            "com.example.android.login4.extra.MESSAGE3";
    public static final String EXTRA_MESSAGE4 =
            "com.example.android.login4.extra.MESSAGE4";
    public static final String EXTRA_TICKETPRICE =
            "com.example.android.login4.extra.TICKETPRICE";
    public static final String EXTRA_COMBONAME =
            "com.example.android.login4.extra.COMBONAME";
    public static final String EXTRA_COMBOPRICE =
            "com.example.android.login4.extra.COMBOPRICE";
    public static final String EXTRA_COMBOTOTAL =
            "com.example.android.login4.extra.COMBOTOTAL";

    public static final String EXTRA_MOVIEDETAIL =
            "com.example.android.login4.extra.MOVIEDEATIL";
    public static final String EXTRA_MOVIENAME =
            "com.example.android.login4.extra.MOVIENAME";

    public static String movieDetail;
    public static String movieName;

    private TextView nuggetno;
    private TextView friesno;
    private TextView hotdogno;
    private TextView cheesewedgesno;
    private TextView chickenburgerno;
    private TextView popcornno;
    private TextView cocacolano;
    private TextView sevenupno;
    private TextView hundredplusno;
    private TextView spriteno;
    private TextView hotdogsetno;
    private TextView popcornsetno;
    private TextView nuggetsetno;
    private TextView totalprice;
    private Integer total = 0;

    private Button nuggetplus;
    private Button friesplus;
    private Button hotdogplus;
    private Button cheesewedgesplus;
    private Button chickenburgerplus;
    private Button popcornplus;
    private Button cocacolaplus;
    private Button sevenupplus;
    private Button hundredplusplus;
    private Button spriteplus;
    private Button hotdogsetplus;
    private Button popcornsetplus;
    private Button nuggetsetplus;

    private Button nuggetminus;
    private Button friesminus;
    private Button hotdogminus;
    private Button cheesewedgesminus;
    private Button chickenburgerminus;
    private Button popcornminus;
    private Button cocacolaminus;
    private Button sevenupminus;
    private Button hundredplusminus;
    private Button spriteminus;
    private Button hotdogsetminus;
    private Button popcornsetminus;
    private Button nuggetsetminus;
    private Button confirm;

    public String message1;
    public String message2;
    public String message3;
    public String message4;
    public String ticketPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_combo);

        Intent intent = getIntent();
        message1 = intent.getStringExtra(ConfirmTicket.EXTRA_MESSAGE1);
        message2 = intent.getStringExtra(ConfirmTicket.EXTRA_MESSAGE2);
        message3 = intent.getStringExtra(ConfirmTicket.EXTRA_MESSAGE3);
        message4 = intent.getStringExtra(ConfirmTicket.EXTRA_MESSAGE4);
        ticketPrice = intent.getStringExtra(ConfirmTicket.EXTRA_TICKETPRICE);

        movieDetail = intent.getStringExtra(ConfirmTicket.EXTRA_MOVIEDETAIL);
        movieName = intent.getStringExtra(ConfirmTicket.EXTRA_MOVIENAME);

        final TextView nuggetno = findViewById(R.id.nuggetno);
        final TextView friesno = findViewById(R.id.friesno);
        final TextView hotdogno = findViewById(R.id.hotdogno);
        final TextView cheesewedgesno = findViewById(R.id.cheesewedgesno);
        final TextView chickenburgerno = findViewById(R.id.chickenburgerno);
        final TextView popcornno = findViewById(R.id.popcornno);
        final TextView cocacolano = findViewById(R.id.cocacolano);
        final TextView sevenupno = findViewById(R.id.sevenupno);
        final TextView hundredplusno = findViewById(R.id.hundredplusno);
        final TextView spriteno = findViewById(R.id.spriteno);
        final TextView hotdogsetno = findViewById(R.id.hotdogsetno);
        final TextView popcornsetno = findViewById(R.id.popcornsetno);
        final TextView nuggetsetno = findViewById(R.id.nuggetsetno);
        final TextView totalprice = findViewById(R.id.totalprice);

        final Button nuggetminus = findViewById(R.id.nuggetminus);
        final Button friesminus = findViewById(R.id.friesminus);
        final Button hotdogminus = findViewById(R.id.hotdogminus);
        final Button cheesewedgesminus = findViewById(R.id.cheesewedgesminus);
        final Button chickenburgerminus = findViewById(R.id.chickenburgerminus);
        final Button popcornminus = findViewById(R.id.popcornminus);
        final Button cocacolaminus = findViewById(R.id.cocacolaminus);
        final Button sevenupminus = findViewById(R.id.sevenupminus);
        final Button hundredplusminus = findViewById(R.id.hundredplusminus);
        final Button spriteminus = findViewById(R.id.spriteminus);
        final Button hotdogsetminus = findViewById(R.id.hotdogsetminus);
        final Button popcornsetminus = findViewById(R.id.popcornsetminus);
        final Button nuggetsetminus = findViewById(R.id.nuggetsetminus);

        final Button nuggetplus = findViewById(R.id.nuggetplus);
        final Button friesplus = findViewById(R.id.friesplus);
        final Button hotdogplus = findViewById(R.id.hotdogplus);
        final Button cheesewedgesplus = findViewById(R.id.cheesewedgesplus);
        final Button chickenburgerplus = findViewById(R.id.chickenburgerplus);
        final Button popcornplus = findViewById(R.id.popcornplus);
        final Button cocacolaplus = findViewById(R.id.cocacolaplus);
        final Button sevenupplus = findViewById(R.id.sevenupplus);
        final Button hundredplusplus = findViewById(R.id.hundredplusplus);
        final Button spriteplus = findViewById(R.id.spriteplus);
        final Button hotdogsetplus = findViewById(R.id.hotdogsetplus);
        final Button popcornsetplus = findViewById(R.id.popcornsetplus);
        final Button nuggetsetplus = findViewById(R.id.nuggetsetplus);

        final Button confirm = findViewById(R.id.btnConfirm);

        nuggetminus.setClickable(false);
        friesminus.setClickable(false);
        hotdogminus.setClickable(false);
        cheesewedgesminus.setClickable(false);
        chickenburgerminus.setClickable(false);
        popcornminus.setClickable(false);
        cocacolaminus.setClickable(false);
        sevenupminus.setClickable(false);
        hundredplusminus.setClickable(false);
        hotdogsetminus.setClickable(false);
        popcornsetminus.setClickable(false);
        nuggetsetminus.setClickable(false);

        confirm.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d(LOG_TAG, "Button clicked!");
                Intent intent = new Intent(ECombo.this, TotalPayment.class);
                intent.putExtra(EXTRA_MESSAGE1, message1);
                intent.putExtra(EXTRA_MESSAGE2, message2);
                intent.putExtra(EXTRA_MESSAGE3, message3);
                intent.putExtra(EXTRA_MESSAGE4, message4);
                intent.putExtra(EXTRA_TICKETPRICE, ticketPrice);
                intent.putExtra(EXTRA_MOVIEDETAIL, movieDetail);
                intent.putExtra(EXTRA_MOVIENAME,movieName);

                String comboName = "";
                String comboPrice = "";
                Integer combototal = 0;

                if (Integer.parseInt(nuggetno.getText().toString()) != 0){
                    comboName = comboName + "Nugget X " + nuggetno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(nuggetno.getText().toString())) * 11))) + "\n";
                    combototal = combototal + (Integer.parseInt(nuggetno.getText().toString())) * 11;
                }
                if (Integer.parseInt(friesno.getText().toString()) != 0){
                    comboName = comboName + "Fried Fries X " + friesno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(friesno.getText().toString())) * 6))) + "\n";
                    combototal = combototal + (Integer.parseInt(friesno.getText().toString())) * 6;
                }
                if (Integer.parseInt(hotdogno.getText().toString()) != 0){
                    comboName = comboName + "Hotdog X " + hotdogno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(hotdogno.getText().toString())) * 6))) + "\n";
                    combototal = combototal + (Integer.parseInt(hotdogno.getText().toString())) * 6;
                }
                if (Integer.parseInt(cheesewedgesno.getText().toString()) != 0){
                    comboName = comboName + "Cheese Wedges X " + cheesewedgesno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(cheesewedgesno.getText().toString())) * 5))) + "\n";
                    combototal = combototal + (Integer.parseInt(cheesewedgesno.getText().toString())) * 5;
                }
                if (Integer.parseInt(chickenburgerno.getText().toString()) != 0){
                    comboName = comboName + "Chicken Burger X " + chickenburgerno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(chickenburgerno.getText().toString())) * 5))) + "\n";
                    combototal = combototal + (Integer.parseInt(chickenburgerno.getText().toString())) * 5;
                }
                if (Integer.parseInt(popcornno.getText().toString()) != 0){
                    comboName = comboName + "Popcorn Caramel X " + popcornno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(popcornno.getText().toString())) * 5))) + "\n";
                    combototal = combototal + (Integer.parseInt(popcornno.getText().toString())) * 5;
                }
                if (Integer.parseInt(cocacolano.getText().toString()) != 0){
                    comboName = comboName + "Coca Cola X " + cocacolano.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(cocacolano.getText().toString())) * 3))) + "\n";
                    combototal = combototal + (Integer.parseInt(cocacolano.getText().toString())) * 3;
                }
                if (Integer.parseInt(sevenupno.getText().toString()) != 0){
                    comboName = comboName + "7 Up X " + sevenupno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(sevenupno.getText().toString())) * 3))) + "\n";
                    combototal = combototal + (Integer.parseInt(sevenupno.getText().toString())) * 3;
                }
                if (Integer.parseInt(hundredplusno.getText().toString()) != 0){
                    comboName = comboName + "100 Plus X " + hundredplusno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(hundredplusno.getText().toString())) * 3))) + "\n";
                    combototal = combototal + (Integer.parseInt(hundredplusno.getText().toString())) * 3;
                }
                if (Integer.parseInt(spriteno.getText().toString()) != 0){
                    comboName = comboName + "Sprite X " + spriteno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(spriteno.getText().toString())) * 3))) + "\n";
                    combototal = combototal + (Integer.parseInt(spriteno.getText().toString())) * 3;
                }
                if (Integer.parseInt(hotdogsetno.getText().toString()) != 0){
                    comboName = comboName + "Hotdog Set X " + hotdogsetno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(hotdogsetno.getText().toString())) * 8))) + "\n";
                    combototal = combototal + (Integer.parseInt(hotdogsetno.getText().toString())) * 8;
                }
                if (Integer.parseInt(popcornsetno.getText().toString()) != 0){
                    comboName = comboName + "Popcorn Set X " + popcornsetno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(popcornsetno.getText().toString())) * 7))) + "\n";
                    combototal = combototal + (Integer.parseInt(popcornsetno.getText().toString())) * 7;
                }
                if (Integer.parseInt(nuggetsetno.getText().toString()) != 0){
                    comboName = comboName + "Nugget Set X " + nuggetsetno.getText().toString() + "\n";
                    comboPrice = comboPrice + (String.format("RM %s.00", String.valueOf
                            ((Integer.parseInt(nuggetsetno.getText().toString())) * 13))) + "\n";
                    combototal = combototal + (Integer.parseInt(nuggetsetno.getText().toString())) * 13;
                }

                intent.putExtra(EXTRA_COMBONAME, comboName);
                intent.putExtra(EXTRA_COMBOPRICE, comboPrice);
                intent.putExtra(EXTRA_COMBOTOTAL, String.valueOf(combototal));

                startActivity(intent);
            }
        });

        nuggetminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                nuggetno.setText(String.format("%s", String.valueOf(Integer.parseInt(nuggetno.getText().toString()) - 1)));
                total-=11;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(nuggetno.getText().toString()) <= 0){
                    nuggetminus.setClickable(false);
                }else{
                    nuggetminus.setClickable(true);
                }
            }
        });

        friesminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                friesno.setText(String.format("%s", String.valueOf(Integer.parseInt(friesno.getText().toString()) - 1)));
                total-=6;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(friesno.getText().toString()) <= 0){
                    friesminus.setClickable(false);
                }else{
                    friesminus.setClickable(true);
                }
            }
        });

        hotdogminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                hotdogno.setText(String.format("%s", String.valueOf(Integer.parseInt(hotdogno.getText().toString()) - 1)));
                total-=6;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(hotdogno.getText().toString()) <= 0){
                    hotdogminus.setClickable(false);
                }else{
                    hotdogminus.setClickable(true);
                }
            }
        });

        cheesewedgesminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                cheesewedgesno.setText(String.format("%s", String.valueOf(Integer.parseInt(cheesewedgesno.getText().toString()) - 1)));
                total-=5;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(cheesewedgesno.getText().toString()) <= 0){
                    cheesewedgesminus.setClickable(false);
                }else{
                    cheesewedgesminus.setClickable(true);
                }
            }
        });

        chickenburgerminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                chickenburgerno.setText(String.format("%s", String.valueOf(Integer.parseInt(chickenburgerno.getText().toString()) - 1)));
                total-=5;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(chickenburgerno.getText().toString()) <= 0){
                    chickenburgerminus.setClickable(false);
                }else{
                    chickenburgerminus.setClickable(true);
                }
            }
        });

        popcornminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                popcornno.setText(String.format("%s", String.valueOf(Integer.parseInt(popcornno.getText().toString()) - 1)));
                total-=5;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(popcornno.getText().toString()) <= 0){
                    popcornminus.setClickable(false);
                }else{
                    popcornminus.setClickable(true);
                }
            }
        });

        cocacolaminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                cocacolano.setText(String.format("%s", String.valueOf(Integer.parseInt(cocacolano.getText().toString()) - 1)));
                total-=3;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(cocacolano.getText().toString()) <= 0){
                    cocacolaminus.setClickable(false);
                }else{
                    cocacolaminus.setClickable(true);
                }
            }
        });

        sevenupminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                sevenupno.setText(String.format("%s", String.valueOf(Integer.parseInt(sevenupno.getText().toString()) - 1)));
                total-=3;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(sevenupno.getText().toString()) <= 0){
                    sevenupminus.setClickable(false);
                }else{
                    sevenupminus.setClickable(true);
                }
            }
        });

        hundredplusminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                hundredplusno.setText(String.format("%s", String.valueOf(Integer.parseInt(hundredplusno.getText().toString()) - 1)));
                total-=3;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(hundredplusno.getText().toString()) <= 0){
                    hundredplusminus.setClickable(false);
                }else{
                    hundredplusminus.setClickable(true);
                }
            }
        });

        spriteminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                spriteno.setText(String.format("%s", String.valueOf(Integer.parseInt(spriteno.getText().toString()) - 1)));
                total-=3;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(spriteno.getText().toString()) <= 0){
                    spriteminus.setClickable(false);
                }else{
                    spriteminus.setClickable(true);
                }
            }
        });

        hotdogsetminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                hotdogsetno.setText(String.format("%s", String.valueOf(Integer.parseInt(hotdogsetno.getText().toString()) - 1)));
                total-=8;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(hotdogsetno.getText().toString()) <= 0){
                    hotdogsetminus.setClickable(false);
                }else{
                    hotdogsetminus.setClickable(true);
                }
            }
        });

        popcornsetminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                popcornsetno.setText(String.format("%s", String.valueOf(Integer.parseInt(popcornsetno.getText().toString()) - 1)));
                total-=7;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(popcornsetno.getText().toString()) <= 0){
                    popcornsetminus.setClickable(false);
                }else{
                    popcornsetminus.setClickable(true);
                }
            }
        });

        nuggetsetminus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                nuggetsetno.setText(String.format("%s", String.valueOf(Integer.parseInt(nuggetsetno.getText().toString()) - 1)));
                total-=13;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));

                if (Integer.parseInt(nuggetsetno.getText().toString()) <= 0){
                    nuggetsetminus.setClickable(false);
                }else{
                    nuggetsetminus.setClickable(true);
                }
            }
        });

        nuggetplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                nuggetno.setText(String.format("%s", String.valueOf(Integer.parseInt(nuggetno.getText().toString()) + 1)));
                total+=11;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        friesplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                friesno.setText(String.format("%s", String.valueOf(Integer.parseInt(friesno.getText().toString()) + 1)));
                total+=6;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        hotdogplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                hotdogno.setText(String.format("%s", String.valueOf(Integer.parseInt(hotdogno.getText().toString()) + 1)));
                total+=6;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        cheesewedgesplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                cheesewedgesno.setText(String.format("%s", String.valueOf(Integer.parseInt(cheesewedgesno.getText().toString()) + 1)));
                total+=5;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        chickenburgerplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                chickenburgerno.setText(String.format("%s", String.valueOf(Integer.parseInt(chickenburgerno.getText().toString()) + 1)));
                total+=5;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        popcornplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                popcornno.setText(String.format("%s", String.valueOf(Integer.parseInt(popcornno.getText().toString()) + 1)));
                total+=5;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        cocacolaplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                cocacolano.setText(String.format("%s", String.valueOf(Integer.parseInt(cocacolano.getText().toString()) + 1)));
                total+=3;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        sevenupplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                sevenupno.setText(String.format("%s", String.valueOf(Integer.parseInt(sevenupno.getText().toString()) + 1)));
                total+=3;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        hundredplusplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                hundredplusno.setText(String.format("%s", String.valueOf(Integer.parseInt(hundredplusno.getText().toString()) + 1)));
                total+=3;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        spriteplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                spriteno.setText(String.format("%s", String.valueOf(Integer.parseInt(spriteno.getText().toString()) + 1)));
                total+=3;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        hotdogsetplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                hotdogsetno.setText(String.format("%s", String.valueOf(Integer.parseInt(hotdogsetno.getText().toString()) + 1)));
                total+=8;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        popcornsetplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                popcornsetno.setText(String.format("%s", String.valueOf(Integer.parseInt(popcornsetno.getText().toString()) + 1)));
                total+=7;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });

        nuggetsetplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                nuggetsetno.setText(String.format("%s", String.valueOf(Integer.parseInt(nuggetsetno.getText().toString()) + 1)));
                total+=13;
                totalprice.setText(String.format("RM %s.00", String.valueOf(total)));
            }
        });
    }
}
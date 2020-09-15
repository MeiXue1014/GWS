package com.example.login4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.login4.SelectSeat.intCount;

public class ConfirmTicket extends AppCompatActivity {
    private static final String LOG_TAG =
            SelectSeat.class.getSimpleName();
    public static String EXTRA_MESSAGE1 =
            "com.example.android.login4.extra.MESSAGE1";
    public static String EXTRA_MESSAGE2 =
            "com.example.android.login4.extra.MESSAGE2";
    public static String EXTRA_MESSAGE3 =
            "com.example.android.login4.extra.MESSAGE3";
    public static String EXTRA_MESSAGE4 =
            "com.example.android.login4.extra.MESSAGE4";
    public static String EXTRA_TICKETPRICE =
            "com.example.android.login4.extra.TICKETPRICE";
    public static String EXTRA_MOVIEDETAIL =
            "com.example.android.login4.extra.MOVIEDEATIL";
    public static String EXTRA_MOVIENAME =
            "com.example.android.login4.extra.MOVIENAME";

    public static String movieDetail;
    public static String movieName;

    private TextView adult;
    private TextView children;
    private Button adultplus;
    private Button childrenplus;
    private Button adultminus;
    private Button childrenminus;
    private TextView noadult;
    private TextView nochildren;
    private Button confirm;
    private TextView adultprice;
    private TextView childrenprice;
    private TextView totalprice;

    private int intAdult = Integer.parseInt(String.valueOf(intCount));
    private int intChildren = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_ticket);
        Intent intent = getIntent();
        String message = intent.getStringExtra(SelectSeat.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.seatlist);
        textView.setText(message);
        movieDetail = intent.getStringExtra(SelectSeat.EXTRA_MOVIEDETAIL);
        movieName = intent.getStringExtra(SelectSeat.EXTRA_MOVIENAME);

        final String intCount = intent.getStringExtra(SelectSeat.EXTRA_COUNT);

        final TextView adult = findViewById(R.id.adultno);
        final TextView children = findViewById(R.id.childrenno);
        final TextView noadult = findViewById(R.id.adult);
        final TextView nochildren = findViewById(R.id.children);
        final Button adultplus = findViewById(R.id.adultplus);
        final Button childrenplus = findViewById(R.id.childrenplus);
        final Button adultminus = findViewById(R.id.adultminus);
        final Button childrenminus = findViewById(R.id.childrenminus);
        final Button confirm = findViewById(R.id.btnConfirm);
        final TextView adultprice = findViewById(R.id.adultprice);
        final TextView childrenprice = findViewById(R.id.childrenprice);
        final TextView totalprice = findViewById(R.id.totalprice);

        adult.setText(intCount);
        noadult.setText(String.format("Adult X %s", intCount));
        Integer count = Integer.parseInt(intCount);

        adultprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(adult.getText().toString()) * 15)));
        childrenprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(children.getText().toString()) * 9)));
        totalprice.setText(String.format("RM %s.00", String.valueOf((Integer.parseInt(adult.getText().toString()) * 15) +
                (Integer.parseInt(children.getText().toString()) * 9))));

        Integer total = Integer.parseInt(adult.getText().toString()) + Integer.parseInt(children.getText().toString());
        if (total >= count) {
            adultplus.setClickable(false);
            childrenplus.setClickable(false);
        } else {
            adultplus.setClickable(true);
            childrenplus.setClickable(true);
        }

        if (total == count) {
            confirm.setClickable(true);
        } else {
            confirm.setClickable(false);
        }

        if (Integer.parseInt(adult.getText().toString()) <= 0) {
            adultminus.setClickable(false);
        }
        if (Integer.parseInt(children.getText().toString()) <= 0) {
            childrenminus.setClickable(false);
        }
        if (Integer.parseInt(children.getText().toString()) > 0) {
            childrenminus.setClickable(true);
        }
        if (Integer.parseInt(adult.getText().toString()) > 0) {
            adultminus.setClickable(true);
        }

        noadult.setText(String.format("Adult X %s", adult.getText().toString()));
        nochildren.setText(String.format("Children X %s", children.getText().toString()));

        adultprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(adult.getText().toString()) * 15)));
        childrenprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(children.getText().toString()) * 9)));
        totalprice.setText(String.format("RM %s.00", String.valueOf((Integer.parseInt(adult.getText().toString()) * 15) +
                (Integer.parseInt(children.getText().toString()) * 9))));

        adultplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intAdult++;
                adult.setText(String.valueOf(intAdult).trim());

                Integer count = Integer.parseInt(intCount.toString());
                Integer total = Integer.parseInt(adult.getText().toString()) + Integer.parseInt(children.getText().toString());
                if (total >= count) {
                    adultplus.setClickable(false);
                    childrenplus.setClickable(false);
                } else {
                    adultplus.setClickable(true);
                    childrenplus.setClickable(true);
                    childrenminus.setClickable(true);

                }

                if (total == count) {
                    confirm.setClickable(true);
                } else {
                    confirm.setClickable(false);
                }

                if (Integer.parseInt(adult.getText().toString()) <= 0) {
                    adultminus.setClickable(false);
                }
                if (Integer.parseInt(children.getText().toString()) <= 0) {
                    childrenminus.setClickable(false);
                }
                if (Integer.parseInt(children.getText().toString()) > 0) {
                    childrenminus.setClickable(true);
                }
                if (Integer.parseInt(adult.getText().toString()) > 0) {
                    adultminus.setClickable(true);
                }

                noadult.setText(String.format("Adult X %s", adult.getText().toString()));
                nochildren.setText(String.format("Children X %s", children.getText().toString()));

                adultprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(adult.getText().toString()) * 15)));
                childrenprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(children.getText().toString()) * 9)));
                totalprice.setText(String.format("RM %s.00", String.valueOf((Integer.parseInt(adult.getText().toString()) * 15) +
                        (Integer.parseInt(children.getText().toString()) * 9))));
            }
        });

        adultminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intAdult--;
                adult.setText(String.valueOf(intAdult).trim());

                Integer count = Integer.parseInt(intCount.toString());
                Integer total = Integer.parseInt(adult.getText().toString()) + Integer.parseInt(children.getText().toString());
                if (total >= count) {
                    adultplus.setClickable(false);
                    childrenplus.setClickable(false);
                } else {
                    adultplus.setClickable(true);
                    childrenplus.setClickable(true);
                    childrenminus.setClickable(true);

                }

                if (total == count) {
                    confirm.setClickable(true);
                } else {
                    confirm.setClickable(false);
                }

                if (Integer.parseInt(adult.getText().toString()) <= 0) {
                    adultminus.setClickable(false);
                }
                if (Integer.parseInt(children.getText().toString()) <= 0) {
                    childrenminus.setClickable(false);
                }
                if (Integer.parseInt(children.getText().toString()) > 0) {
                    childrenminus.setClickable(true);
                }
                if (Integer.parseInt(adult.getText().toString()) > 0) {
                    adultminus.setClickable(true);
                }

                noadult.setText(String.format("Adult X %s", adult.getText().toString()));
                nochildren.setText(String.format("Children X %s", children.getText().toString()));

                adultprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(adult.getText().toString()) * 15)));
                childrenprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(children.getText().toString()) * 9)));
                totalprice.setText(String.format("RM %s.00", String.valueOf((Integer.parseInt(adult.getText().toString()) * 15) +
                        (Integer.parseInt(children.getText().toString()) * 9))));
            }
        });

        childrenplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intChildren++;
                children.setText(String.valueOf(intChildren).trim());

                Integer count = Integer.parseInt(intCount.toString());
                Integer total = Integer.parseInt(adult.getText().toString()) + Integer.parseInt(children.getText().toString());
                if (total >= count) {
                    adultplus.setClickable(false);
                    childrenplus.setClickable(false);
                } else {
                    adultplus.setClickable(true);
                    childrenplus.setClickable(true);
                    childrenminus.setClickable(true);

                }

                if (total == count) {
                    confirm.setClickable(true);
                } else {
                    confirm.setClickable(false);
                }

                if (Integer.parseInt(adult.getText().toString()) <= 0) {
                    adultminus.setClickable(false);
                }
                if (Integer.parseInt(children.getText().toString()) <= 0) {
                    childrenminus.setClickable(false);
                }
                if (Integer.parseInt(children.getText().toString()) > 0) {
                    childrenminus.setClickable(true);
                }
                if (Integer.parseInt(adult.getText().toString()) > 0) {
                    adultminus.setClickable(true);
                }

                noadult.setText(String.format("Adult X %s", adult.getText().toString()));
                nochildren.setText(String.format("Children X %s", children.getText().toString()));

                adultprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(adult.getText().toString()) * 15)));
                childrenprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(children.getText().toString()) * 9)));
                totalprice.setText(String.format("RM %s.00", String.valueOf((Integer.parseInt(adult.getText().toString()) * 15) +
                        (Integer.parseInt(children.getText().toString()) * 9))));
            }
        });

        childrenminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intChildren--;
                children.setText(String.valueOf(intChildren).trim());

                Integer count = Integer.parseInt(intCount.toString());
                Integer total = Integer.parseInt(adult.getText().toString()) + Integer.parseInt(children.getText().toString());
                if (total >= count) {
                    adultplus.setClickable(false);
                    childrenplus.setClickable(false);
                } else {
                    adultplus.setClickable(true);
                    childrenplus.setClickable(true);
                    childrenminus.setClickable(true);

                }

                if (total == count) {
                    confirm.setClickable(true);
                } else {
                    confirm.setClickable(false);
                }

                if (Integer.parseInt(adult.getText().toString()) <= 0) {
                    adultminus.setClickable(false);
                }
                if (Integer.parseInt(children.getText().toString()) <= 0) {
                    childrenminus.setClickable(false);
                }
                if (Integer.parseInt(children.getText().toString()) > 0) {
                    childrenminus.setClickable(true);
                }
                if (Integer.parseInt(adult.getText().toString()) > 0) {
                    adultminus.setClickable(true);
                }

                noadult.setText(String.format("Adult X %s", adult.getText().toString()));
                nochildren.setText(String.format("Children X %s", children.getText().toString()));

                adultprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(adult.getText().toString()) * 15)));
                childrenprice.setText(String.format("RM %s.00", String.valueOf(Integer.parseInt(children.getText().toString()) * 9)));
                totalprice.setText(String.format("RM %s.00", String.valueOf((Integer.parseInt(adult.getText().toString()) * 15) +
                        (Integer.parseInt(children.getText().toString()) * 9))));
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(LOG_TAG, "Button clicked!");
                Intent intent = new Intent(ConfirmTicket.this, ECombo.class);
                String message1 = noadult.getText().toString();
                String message2 = nochildren.getText().toString();
                String message3 = adultprice.getText().toString();
                String message4 = childrenprice.getText().toString();
                String ticketPrice = String.valueOf((Integer.parseInt(adult.getText().toString()) * 15) +
                        (Integer.parseInt(children.getText().toString()) * 9));
                intent.putExtra(EXTRA_MESSAGE1, message1);
                intent.putExtra(EXTRA_MESSAGE2, message2);
                intent.putExtra(EXTRA_MESSAGE3, message3);
                intent.putExtra(EXTRA_MESSAGE4, message4);
                intent.putExtra(EXTRA_TICKETPRICE, ticketPrice);

                intent.putExtra(EXTRA_MOVIEDETAIL, movieDetail);
                intent.putExtra(EXTRA_MOVIENAME, movieName);

                startActivity(intent);
            }
        });
    }
}
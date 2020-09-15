package com.example.login4;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MyTicket extends AppCompatActivity {
    private TextView movie1name;
    private TextView movie1detail;
    private TextView movie2name;
    private TextView movie2detail;
    private TextView movie3name;
    private TextView movie3detail;
    private TextView movie4name;
    private TextView movie4detail;
    private TextView movie5name;
    private TextView movie5detail;
    private ImageView movie1;
    private ImageView movie2;
    private ImageView movie3;
    private ImageView movie4;
    private ImageView movie5;
    private TextView movie1code;
    private TextView movie2code;
    private TextView movie3code;
    private TextView movie4code;
    private TextView movie5code;
    private DatabaseReference mDatabase;

    public static class Ticket {

        public String ticketName;
        public String ticketDetail;
        public String code;

        public Ticket(String ticketName, String ticketDetail, String code) {
            // ...
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_ticket);

        final ImageView movie1 = findViewById(R.id.movie1);
        final ImageView movie2 = findViewById(R.id.movie2);
        final ImageView movie3 = findViewById(R.id.movie3);
        final ImageView movie4 = findViewById(R.id.movie4);
        final ImageView movie5 = findViewById(R.id.movie5);
        final TextView movie1name = findViewById(R.id.movie1name);
        final TextView movie1detail = findViewById(R.id.movie1detail);
        final TextView movie2name = findViewById(R.id.movie2name);
        final TextView movie2detail = findViewById(R.id.movie2detail);
        final TextView movie3name = findViewById(R.id.movie3name);
        final TextView movie3detail = findViewById(R.id.movie3detail);
        final TextView movie4name = findViewById(R.id.movie4name);
        final TextView movie4detail = findViewById(R.id.movie4detail);
        final TextView movie5name = findViewById(R.id.movie5name);
        final TextView movie5detail = findViewById(R.id.movie5detail);
        final TextView movie1code = findViewById(R.id.movie1code);
        final TextView movie2code = findViewById(R.id.movie2code);
        final TextView movie3code = findViewById(R.id.movie3code);
        final TextView movie4code = findViewById(R.id.movie4code);
        final TextView movie5code = findViewById(R.id.movie5code);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Ticket");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String name1 = snapshot.child("ticket1").child("ticketName").getValue().toString();
                String detail1 = snapshot.child("ticket1").child("ticketDetail").getValue().toString();
                String code1 = snapshot.child("ticket1").child("code").getValue().toString();

                movie1name.setText(name1);
                movie1detail.setText(detail1);
                movie1code.setText(code1);

                switch (name1) {
                    case "MY Hero Academia:Heros Rising":
                        movie1.setImageResource(R.drawable.my_hero_academia___heros_rising);
                        break;
                    case "Jumanji:The Next Level":
                        movie1.setImageResource(R.drawable.jumanji2);
                        break;
                    case "Digimon Adventure:Last Evolution Kizuna":
                        movie1.setImageResource(R.drawable.digimon_adventure___last_evolution_kizuna);
                        break;
                    case "Underwater 2020":
                        movie1.setImageResource(R.drawable.underwater);
                        break;
                    case "Hitman:Agent Jun 2020":
                        movie1.setImageResource(R.drawable.hitman___agent_jun);
                        break;
                    case "Baba Yaga:Terror of the Dark Forest":
                        movie1.setImageResource(R.drawable.baba_yaga___terror_of_the_dark_forest);
                        break;
                    case "The Grudge 2020":
                        movie1.setImageResource(R.drawable.the_grudge_2020);
                        break;
                    case "Bloodshot 2020":
                        movie1.setImageResource(R.drawable.bloodshot);
                        break;
                    case "Howling Village 2020":
                        movie1.setImageResource(R.drawable.howling_village_2020);
                        break;
                    case "Fantasy Island":
                        movie1.setImageResource(R.drawable.fantasy_island);
                        break;
                    case "The Old Guard":
                        movie1.setImageResource(R.drawable.the_old_guard);
                        break;
                    case "Onward":
                        movie1.setImageResource(R.drawable.onward_);
                        break;
                    case "Black Water: Abyss":
                        movie1.setImageResource(R.drawable.black_water___abyss);
                        break;
                    case "The Jack In The Box":
                        movie1.setImageResource(R.drawable.the_jack_in_the_box);
                        break;
                    case "Scoob!":
                        movie1.setImageResource(R.drawable.scoob_2020);
                        break;
                    case "A choo":
                        movie1.setImageResource(R.drawable.a_choo_2020);
                        break;
                    case "Demon Slayer Party":
                        movie1.setImageResource(R.drawable.demon_slayer_party);
                        break;
                    case "":
                        movie1.setImageResource(R.color.design_default_color_on_secondary);
                        break;
                }

                String name2 = snapshot.child("ticket2").child("ticketName").getValue().toString();
                String detail2 = snapshot.child("ticket2").child("ticketDetail").getValue().toString();
                String code2 = snapshot.child("ticket2").child("code").getValue().toString();

                movie2name.setText(name2);
                movie2detail.setText(detail2);
                movie2code.setText(code2);

                switch (name2) {
                    case "MY Hero Academia:Heros Rising":
                        movie2.setImageResource(R.drawable.my_hero_academia___heros_rising);
                        break;
                    case "Jumanji:The Next Level":
                        movie2.setImageResource(R.drawable.jumanji2);
                        break;
                    case "Digimon Adventure:Last Evolution Kizuna":
                        movie2.setImageResource(R.drawable.digimon_adventure___last_evolution_kizuna);
                        break;
                    case "Underwater 2020":
                        movie2.setImageResource(R.drawable.underwater);
                        break;
                    case "Hitman:Agent Jun 2020":
                        movie2.setImageResource(R.drawable.hitman___agent_jun);
                        break;
                    case "Baba Yaga:Terror of the Dark Forest":
                        movie2.setImageResource(R.drawable.baba_yaga___terror_of_the_dark_forest);
                        break;
                    case "The Grudge 2020":
                        movie2.setImageResource(R.drawable.the_grudge_2020);
                        break;
                    case "Bloodshot 2020":
                        movie2.setImageResource(R.drawable.bloodshot);
                        break;
                    case "Howling Village 2020":
                        movie2.setImageResource(R.drawable.howling_village_2020);
                        break;
                    case "Fantasy Island":
                        movie2.setImageResource(R.drawable.fantasy_island);
                        break;
                    case "The Old Guard":
                        movie2.setImageResource(R.drawable.the_old_guard);
                        break;
                    case "Onward":
                        movie2.setImageResource(R.drawable.onward_);
                        break;
                    case "Black Water: Abyss":
                        movie2.setImageResource(R.drawable.black_water___abyss);
                        break;
                    case "The Jack In The Box":
                        movie2.setImageResource(R.drawable.the_jack_in_the_box);
                        break;
                    case "Scoob!":
                        movie2.setImageResource(R.drawable.scoob_2020);
                        break;
                    case "A choo":
                        movie2.setImageResource(R.drawable.a_choo_2020);
                        break;
                    case "Demon Slayer Party":
                        movie2.setImageResource(R.drawable.demon_slayer_party);
                        break;
                    case "":
                        movie2.setImageResource(R.color.design_default_color_on_secondary);
                        break;
                }

                String name3 = snapshot.child("ticket3").child("ticketName").getValue().toString();
                String detail3 = snapshot.child("ticket3").child("ticketDetail").getValue().toString();
                String code3 = snapshot.child("ticket3").child("code").getValue().toString();

                movie3name.setText(name3);
                movie3detail.setText(detail3);
                movie3code.setText(code3);

                switch (name3) {
                    case "MY Hero Academia:Heros Rising":
                        movie3.setImageResource(R.drawable.my_hero_academia___heros_rising);
                        break;
                    case "Jumanji:The Next Level":
                        movie3.setImageResource(R.drawable.jumanji2);
                        break;
                    case "Digimon Adventure:Last Evolution Kizuna":
                        movie3.setImageResource(R.drawable.digimon_adventure___last_evolution_kizuna);
                        break;
                    case "Underwater 2020":
                        movie3.setImageResource(R.drawable.underwater);
                        break;
                    case "Hitman:Agent Jun 2020":
                        movie3.setImageResource(R.drawable.hitman___agent_jun);
                        break;
                    case "Baba Yaga:Terror of the Dark Forest":
                        movie3.setImageResource(R.drawable.baba_yaga___terror_of_the_dark_forest);
                        break;
                    case "The Grudge 2020":
                        movie3.setImageResource(R.drawable.the_grudge_2020);
                        break;
                    case "Bloodshot 2020":
                        movie3.setImageResource(R.drawable.bloodshot);
                        break;
                    case "Howling Village 2020":
                        movie3.setImageResource(R.drawable.howling_village_2020);
                        break;
                    case "Fantasy Island":
                        movie3.setImageResource(R.drawable.fantasy_island);
                        break;
                    case "The Old Guard":
                        movie3.setImageResource(R.drawable.the_old_guard);
                        break;
                    case "Onward":
                        movie3.setImageResource(R.drawable.onward_);
                        break;
                    case "Black Water: Abyss":
                        movie3.setImageResource(R.drawable.black_water___abyss);
                        break;
                    case "The Jack In The Box":
                        movie3.setImageResource(R.drawable.the_jack_in_the_box);
                        break;
                    case "Scoob!":
                        movie3.setImageResource(R.drawable.scoob_2020);
                        break;
                    case "A choo":
                        movie3.setImageResource(R.drawable.a_choo_2020);
                        break;
                    case "Demon Slayer Party":
                        movie3.setImageResource(R.drawable.demon_slayer_party);
                        break;
                    case "":
                        movie3.setImageResource(R.color.design_default_color_on_secondary);
                        break;
                }

                String name4 = snapshot.child("ticket4").child("ticketName").getValue().toString();
                String detail4 = snapshot.child("ticket4").child("ticketDetail").getValue().toString();
                String code4 = snapshot.child("ticket4").child("code").getValue().toString();

                movie4name.setText(name4);
                movie4detail.setText(detail4);
                movie4code.setText(code4);

                switch (name4) {
                    case "MY Hero Academia:Heros Rising":
                        movie4.setImageResource(R.drawable.my_hero_academia___heros_rising);
                        break;
                    case "Jumanji:The Next Level":
                        movie4.setImageResource(R.drawable.jumanji2);
                        break;
                    case "Digimon Adventure:Last Evolution Kizuna":
                        movie4.setImageResource(R.drawable.digimon_adventure___last_evolution_kizuna);
                        break;
                    case "Underwater 2020":
                        movie4.setImageResource(R.drawable.underwater);
                        break;
                    case "Hitman:Agent Jun 2020":
                        movie4.setImageResource(R.drawable.hitman___agent_jun);
                        break;
                    case "Baba Yaga:Terror of the Dark Forest":
                        movie4.setImageResource(R.drawable.baba_yaga___terror_of_the_dark_forest);
                        break;
                    case "The Grudge 2020":
                        movie4.setImageResource(R.drawable.the_grudge_2020);
                        break;
                    case "Bloodshot 2020":
                        movie4.setImageResource(R.drawable.bloodshot);
                        break;
                    case "Howling Village 2020":
                        movie4.setImageResource(R.drawable.howling_village_2020);
                        break;
                    case "Fantasy Island":
                        movie4.setImageResource(R.drawable.fantasy_island);
                        break;
                    case "The Old Guard":
                        movie4.setImageResource(R.drawable.the_old_guard);
                        break;
                    case "Onward":
                        movie4.setImageResource(R.drawable.onward_);
                        break;
                    case "Black Water: Abyss":
                        movie4.setImageResource(R.drawable.black_water___abyss);
                        break;
                    case "The Jack In The Box":
                        movie4.setImageResource(R.drawable.the_jack_in_the_box);
                        break;
                    case "Scoob!":
                        movie4.setImageResource(R.drawable.scoob_2020);
                        break;
                    case "A choo":
                        movie4.setImageResource(R.drawable.a_choo_2020);
                        break;
                    case "Demon Slayer Party":
                        movie4.setImageResource(R.drawable.demon_slayer_party);
                        break;
                    case "":
                        movie4.setImageResource(R.color.design_default_color_on_secondary);
                        break;
                }

                String name5 = snapshot.child("ticket5").child("ticketName").getValue().toString();
                String detail5 = snapshot.child("ticket5").child("ticketDetail").getValue().toString();
                String code5 = snapshot.child("ticket5").child("code").getValue().toString();

                movie5name.setText(name5);
                movie5detail.setText(detail5);
                movie5code.setText(code5);

                if (name5 == "MY Hero Academia:Heros Rising"){
                    movie5.setImageResource(R.drawable.my_hero_academia___heros_rising);
                }else if (name5 == "Jumanji:The Next Level"){
                    movie5.setImageResource(R.drawable.jumanji2);
                }else if (name5 == "Digimon Adventure:Last Evolution Kizuna"){
                    movie5.setImageResource(R.drawable.digimon_adventure___last_evolution_kizuna);
                }else if (name5 == "Underwater 2020"){
                    movie5.setImageResource(R.drawable.underwater);
                }else if (name5 == "Hitman:Agent Jun 2020"){
                    movie5.setImageResource(R.drawable.hitman___agent_jun);
                }else if (name5 == "Baba Yaga:Terror of the Dark Forest"){
                    movie5.setImageResource(R.drawable.baba_yaga___terror_of_the_dark_forest);
                }else if (name5 == "The Grudge 2020"){
                    movie5.setImageResource(R.drawable.the_grudge_2020);
                }else if (name5 == "Bloodshot 2020"){
                    movie5.setImageResource(R.drawable.bloodshot);
                }else if (name5 == "Howling Village 2020"){
                    movie5.setImageResource(R.drawable.howling_village_2020);
                }else if (name5 == "Fantasy Island"){
                    movie5.setImageResource(R.drawable.fantasy_island);
                }else if (name5 == "The Old Guard"){
                    movie5.setImageResource(R.drawable.the_old_guard);
                }else if (name5 == "Onward"){
                    movie5.setImageResource(R.drawable.onward_);
                }else if (name5 == "Black Water: Abyss"){
                    movie5.setImageResource(R.drawable.black_water___abyss);
                }else if (name5 == "The Jack In The Box"){
                    movie5.setImageResource(R.drawable.the_jack_in_the_box);
                }else if (name5 == "Scoob!"){
                    movie5.setImageResource(R.drawable.scoob_2020);
                }else if (name5 == "A choo"){
                    movie5.setImageResource(R.drawable.a_choo_2020);
                }else if (name5 == "Demon Slayer Party"){
                    movie5.setImageResource(R.drawable.demon_slayer_party);
                }else if (name5 == ""){
                    movie5.setImageResource(R.color.design_default_color_on_secondary);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
package com.example.warriorfight;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Arena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arena);
        MediaPlayer mpPrepareToFight = MediaPlayer.create(Arena.this ,R.raw.prepare);
        mpPrepareToFight.start();

        //recovery value of player choose
            TextView tvPlayerChoose = findViewById(R.id.tvPlayerSelected);
            Intent intent = getIntent();
            String printPlayer = intent.getStringExtra("EXTRA_NAME");
            tvPlayerChoose.setText(printPlayer + " is ready to fight !" );

            ImageView imagePlayer = findViewById(R.id.ivPlayer);
            ImageView imageEnnemy = findViewById(R.id.ivEnnemy);
            //Condition to view image player .equals for compare String

            if(printPlayer.equals("Conan")){
                imageEnnemy.setImageDrawable(getDrawable(R.drawable.uraken));
                imagePlayer.setImageDrawable(getDrawable(R.drawable.conanfight));
            }

            if(printPlayer.equals("cadhilac")){
                imageEnnemy.setImageDrawable(getDrawable(R.drawable.conanfight));
                imagePlayer.setImageDrawable(getDrawable(R.drawable.uraken));
            }

            if(printPlayer.equals("Gimli")){
                imageEnnemy.setImageDrawable(getDrawable(R.drawable.uraken));
                imagePlayer.setImageDrawable(getDrawable(R.drawable.gimlifight));
            }

        Button startFight = findViewById(R.id.btStartFight);
        startFight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mp1 = MediaPlayer.create(Arena.this,R.raw.sword);
                mp1.start();

                //recovery value of player choose
                TextView tvPlayerChoose = findViewById(R.id.tvPlayerSelected);
                Intent intent = getIntent();
                String printPlayer = intent.getStringExtra("EXTRA_NAME");
                tvPlayerChoose.setText(printPlayer + " is ready to fight !");
                //Create object instance
                final Extraterrestrial extraterrestrial1 = new Extraterrestrial("Cadhilac" , 20);
                final Human human1 = new Human("Conan" , 30);
                final Dwarf dwarf1 = new Dwarf("Gimli" , 30);


                while (!human1.isKo() && !extraterrestrial1.isKo()) {
                    human1.spell();
                    extraterrestrial1.takeHit(human1.getAttackWarrior());
                    if (!extraterrestrial1.isKo()) {
                        human1.takeHit(extraterrestrial1.getAttackWarrior());
                    }
                }
                if (human1.isKo()) {
                    ImageView backgroundChange = findViewById(R.id.ivBlood);
                    backgroundChange.setImageDrawable(getDrawable(R.drawable.blood));
                    Toast.makeText(Arena.this, "Conan is ko", Toast.LENGTH_LONG).show();
                    System.out.println("Conan is ko ");
                } else {
                    Toast.makeText(Arena.this, "Cadhilac is ko", Toast.LENGTH_LONG).show();
                    System.out.println("Cadhilac is ko ");
                }

                ImageView backgroundChange = findViewById(R.id.ivBlood);
                backgroundChange.setImageDrawable(getDrawable(R.drawable.blood));

            }
        });

    }



}

package com.example.warriorfight;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheFighters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_fighters);

        Button chooseCadilhac = findViewById(R.id.btChooseCadilhac);
        chooseCadilhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button chooseConan = findViewById(R.id.btChooseConan);
        chooseConan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button chooseGimli = findViewById(R.id.btChooseGimli);
        chooseGimli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button enterInArena = findViewById(R.id.btEnterArena);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.prepare);
        enterInArena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent enterInArena = new Intent(TheFighters.this, Arena.class);
                startActivity(enterInArena);


            }
        });


    }
}

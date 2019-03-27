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

        final Button chooseCadilhac = findViewById(R.id.btChooseCadilhac);
        chooseCadilhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chooseCadilhac = "cadhilac";
                Intent goFighters = new Intent(TheFighters.this, Arena.class);
                goFighters.putExtra("EXTRA_NAME", chooseCadilhac);
                startActivity(goFighters);
            }
        });
        Button chooseConan = findViewById(R.id.btChooseConan);
        chooseConan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chooseConan = "Conan";
                Intent goFighters = new Intent(TheFighters.this, Arena.class);
                goFighters.putExtra("EXTRA_NAME" , chooseConan);
                startActivity(goFighters);
            }
        });
        Button chooseGimli = findViewById(R.id.btChooseGimli);
        chooseGimli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chooseGimli = "Gimli";
                Intent goFighters = new Intent(TheFighters.this, Arena.class);
                goFighters.putExtra("EXTRA_NAME" , chooseGimli);
                startActivity(goFighters);
            }
        });

    }
}

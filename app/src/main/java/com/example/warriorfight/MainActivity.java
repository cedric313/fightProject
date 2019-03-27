package com.example.warriorfight;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btSelectPlayer = findViewById(R.id.btSelectPlayer);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.mka);
        btSelectPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent goArena = new Intent(MainActivity.this, TheFighters.class);
                startActivity(goArena);
            }
        });
    }
}

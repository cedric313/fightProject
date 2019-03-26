package com.example.warriorfight;

import android.content.Intent;
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
        btSelectPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goFighters = new Intent(MainActivity.this, TheFighters.class);
                startActivity(goFighters);
            }
        });
    }
}

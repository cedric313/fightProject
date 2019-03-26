package com.example.warriorfight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Arena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arena);



            Conan conan1 = new Conan(30);
            Cadilhac cadilhac1 = new Cadilhac(30);
            Gimli gimli1 = new Gimli(30);

        Button startFight = findViewById(R.id.btStartFight);
        startFight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
            cadilhac1.cadilhacFightVsConan();
            conan1.takeHit(cadilhac1.getAttack());
            System.out.println(conan1.getLife());

            cadilhac1.cadilhacFightVsGimli();
            gimli1.takeHit(cadilhac1.getAttack());
            System.out.println(gimli1.getLife());
    }
}

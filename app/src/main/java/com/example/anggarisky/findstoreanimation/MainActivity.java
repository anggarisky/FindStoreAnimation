package com.example.anggarisky.findstoreanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView light, storeone, storetwo, storethree;
    Button btnstop;
    TextView checking;

    Animation roting, stores, stores2, stores3, btnanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        light = (ImageView) findViewById(R.id.light);
        storeone = (ImageView) findViewById(R.id.storeone);
        storetwo = (ImageView) findViewById(R.id.storetwo);
        storethree = (ImageView) findViewById(R.id.storethree);


        btnstop = (Button) findViewById(R.id.btnstop);

        checking = (TextView) findViewById(R.id.checking);

        roting = AnimationUtils.loadAnimation(this, R.anim.roting);
        stores = AnimationUtils.loadAnimation(this, R.anim.stores);
        stores2 = AnimationUtils.loadAnimation(this, R.anim.stores2);
        stores3 = AnimationUtils.loadAnimation(this, R.anim.stores3);
        btnanim = AnimationUtils.loadAnimation(this, R.anim.btnanim);

        light.startAnimation(roting);

        storeone.startAnimation(stores);
        storetwo.startAnimation(stores2);
        storethree.startAnimation(stores3);

        btnstop.startAnimation(btnanim);

        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                light.clearAnimation();
            }
        });



    }
}

package com.ayomi.happybirthdayomo_p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper v_flipper;

    int[] images = {
            R.drawable.ommop,
            //R.drawable.group,
            R.drawable.omo,
            //R.drawable.a4,
            R.drawable.omop,
            R.drawable.omopp,
            R.drawable.oomop,
            R.drawable.pomo,
            //R.drawable.b6,
            //R.drawable.b7,
            //R.drawable.c,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v_flipper = findViewById(R.id.v_flipper);
        for (int image : images) {
            flip_image(image);
        }
    }

    private void flip_image(int i) {
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);
        v_flipper.addView(view);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.fade_in);
        v_flipper.setOutAnimation(this, android.R.anim.fade_out);
    }

}

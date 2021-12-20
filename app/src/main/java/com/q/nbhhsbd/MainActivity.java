package com.q.nbhhsbd;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer sound01 = MediaPlayer.create(this, R.raw.sound_01);
        final MediaPlayer sound02 = MediaPlayer.create(this, R.raw.sound_02);

        ImageButton play01 = (ImageButton) this.findViewById(R.id.imageButton01);
        ImageButton play02 = (ImageButton) this.findViewById(R.id.imageButton02);

        play01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound01.start();
            }
        });

        play02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound02.start();
            }
        });
    }

}


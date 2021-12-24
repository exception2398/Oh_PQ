package com.q.nbhhsbd;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer l001 = MediaPlayer.create(this, R.raw.nbhh001);
        final MediaPlayer l002 = MediaPlayer.create(this, R.raw.nbhh002);
        final MediaPlayer l003 = MediaPlayer.create(this, R.raw.nbhh003);
        final MediaPlayer l004 = MediaPlayer.create(this, R.raw.nbhh004);
        final MediaPlayer l005 = MediaPlayer.create(this, R.raw.nbhh005);
        final MediaPlayer l006 = MediaPlayer.create(this, R.raw.nbhh006);
        final MediaPlayer l007 = MediaPlayer.create(this, R.raw.nbhh007);
        final MediaPlayer l008 = MediaPlayer.create(this, R.raw.nbhh008);
        final MediaPlayer l009 = MediaPlayer.create(this, R.raw.nbhh009);
        final MediaPlayer l010 = MediaPlayer.create(this, R.raw.nbhh010);
        final MediaPlayer l011 = MediaPlayer.create(this, R.raw.nbhh011);
        final MediaPlayer l012 = MediaPlayer.create(this, R.raw.nbhh012);
        final MediaPlayer opq = MediaPlayer.create(this, R.raw.nbhhopq);

        ImageButton play01 = (ImageButton) this.findViewById(R.id.imageButton01);
        ImageButton play02 = (ImageButton) this.findViewById(R.id.imageButton02);

        play01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int min = 1;
                int max = 12;
                int randomNum = rand.nextInt((max - min) + 1) + min;
                switch(randomNum) {
                    case 1:
                        l001.start();
                        break;
                    case 2:
                        l002.start();
                        break;
                    case 3:
                        l003.start();
                        break;
                    case 4:
                        l004.start();
                        break;
                    case 5:
                        l005.start();
                        break;
                    case 6:
                        l006.start();
                        break;
                    case 7:
                        l007.start();
                        break;
                    case 8:
                        l008.start();
                        break;
                    case 9:
                        l009.start();
                        break;
                    case 10:
                        l010.start();
                        break;
                    case 11:
                        l011.start();
                        break;
                    case 12:
                        l012.start();
                        break;
                }
            }
        });

        play02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opq.start();
            }
        });
    }

}


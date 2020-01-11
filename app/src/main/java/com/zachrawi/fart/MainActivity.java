package com.zachrawi.fart;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final SoundPool soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        final int soundId = soundPool.load(getApplicationContext(), R.raw.fart, 1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundId, 1.0f, 1.0f, 0, 0, 1);
            }
        });
    }
}

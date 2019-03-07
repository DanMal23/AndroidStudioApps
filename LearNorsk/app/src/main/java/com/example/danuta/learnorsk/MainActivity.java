package com.example.danuta.learnorsk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    MediaPlayer tallLytt, maanterLytt, ukedagerLytt, dagligerutinerLydd, oljeLydd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tallLytt = MediaPlayer.create(this, R.raw.tall);
        maanterLytt = MediaPlayer.create(this, R.raw.maanter);
        ukedagerLytt = MediaPlayer.create(this, R.raw.ukedager);
        dagligerutinerLydd = MediaPlayer.create(this, R.raw.dagligerutiner);
        oljeLydd = MediaPlayer.create(this, R.raw.olje);

        Switch switch_looping = (Switch) findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tallLytt.setLooping(isChecked);
                maanterLytt.setLooping(isChecked);
                ukedagerLytt.setLooping(isChecked);
                dagligerutinerLydd.setLooping(isChecked);
                oljeLydd.setLooping(isChecked);
            }
        });
    }
    public void playTall (View v) {
        tallLytt.start();
    }
    public void playMaanter (View v) {
        maanterLytt.start();
    }
    public void playUkedager (View v) {
        ukedagerLytt.start();
    }
    public void playRutiner (View v) {
        dagligerutinerLydd.start();
    }
    public void playOlje (View v) {
        oljeLydd.start();
    }
    public void pauseMusic (View v) {
        if(tallLytt.isPlaying())
            tallLytt.pause();
        if(maanterLytt.isPlaying())
            maanterLytt.pause();
        if(ukedagerLytt.isPlaying())
            ukedagerLytt.pause();
        if(dagligerutinerLydd.isPlaying())
            dagligerutinerLydd.pause();
        if(oljeLydd.isPlaying())
            oljeLydd.pause();
    }

    public void onOpen1(View view)  {
        Intent in = new Intent( MainActivity.this, SecondActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen2(View view)  {
        Intent in = new Intent( MainActivity.this, ThirdActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen3(View view)  {
        Intent in = new Intent( MainActivity.this, FourthActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen4(View view)  {
        Intent in = new Intent( MainActivity.this, FifthActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen5(View view)  {
        Intent in = new Intent( MainActivity.this, SixActivity.class);  //Alt+Enter
        startActivity(in);
    }
}

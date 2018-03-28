package uk.ac.napier.annoyingsoundapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        final MediaPlayer dixiehorn = MediaPlayer.create(this, R.raw.dixiehorn);
        Button play_dixiehorn = (Button) this.findViewById(R.id.play_dixiehorn);

        play_dixiehorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dixiehorn.start();

            }
        });

         final MediaPlayer fart1 = MediaPlayer.create(this, R.raw.fart1);
         Button play_fart1 = (Button) this.findViewById(R.id.play_fart1);

         play_fart1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 fart1.start();
             }
         });

         final MediaPlayer fart2 = MediaPlayer.create(this,R.raw.fart2);
         Button play_fart2 =(Button) this.findViewById(R.id.play_fart2);

         play_fart2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 fart2.start();
             }
         });

         final MediaPlayer siren = MediaPlayer.create(this,R.raw.siren);
         Button play_siren =(Button) this.findViewById(R.id.play_siren);

         play_siren.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 siren.start();
             }
         });


    }
}

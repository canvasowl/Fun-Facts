package com.punyweblab.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends Activity {

    private FactBook mFactbook = new FactBook();
    private BackgroundColor mBackgroundColor = new BackgroundColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign variables
        // final MediaPlayer buttonSound = MediaPlayer.create(this, R.raw.button);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final RelativeLayout factScreen = (RelativeLayout) findViewById(R.id.screen);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactbook.getFact();
                //buttonSound.start();
                factLabel.setText(fact);
                factScreen.setBackgroundColor(Color.parseColor(mBackgroundColor.getColor()));
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}

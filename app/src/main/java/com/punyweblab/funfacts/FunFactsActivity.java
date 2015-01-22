package com.punyweblab.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class FunFactsActivity extends Activity {

    private FactBook mFactbook = new FactBook();
    private BackgroundColor mBackgroundColor = new BackgroundColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign variables
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout factScreen = (RelativeLayout) findViewById(R.id.screen);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactbook.getFact();
                factLabel.setText(fact);
                factScreen.setBackgroundColor(Color.parseColor(mBackgroundColor.getColor()));
            }
        };

        showFactButton.setOnClickListener(listener);

        // Lets create a toast and show it
        String toast_msg = "This is my sample toast.";
        Toast mToast  = Toast.makeText(this, toast_msg, Toast.LENGTH_LONG);
        mToast.show();


        // Log data
        Log.d("FunFactsActivity", "This is my custom tag");
    }

}

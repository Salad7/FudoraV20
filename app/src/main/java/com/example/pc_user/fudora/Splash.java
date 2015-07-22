package com.example.pc_user.fudora;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by msalad on 6/9/2015.
 */
public class Splash extends Activity  {

    private final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle onSaveState)
    {
        super.onCreate(onSaveState);
        setContentView(R.layout.splash);
        ActionBar actionbar;
        actionbar = getActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00FFBF")));
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash.this, Home.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
    public void startNext()
    {
        Intent intent = new Intent(this,Home.class);
         startActivity(intent);

        finish();


    }
}

package com.example.pc_user.fudora;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by msalad on 6/16/2015.
 */
public class LocalSearchFragment extends Fragment {

    private TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
         //tv = (TextView) getView().findViewById(R.id.textView1);
         //tv.startAnimation(getBlinkAnimation());
        return inflater.inflate(R.layout.local_search, container,false);

    }
    public Animation getBlinkAnimation()
    {
        Animation animation = new AlphaAnimation(1, 0);         // Change alpha from fully visible to invisible
        animation.setDuration(300);                             // duration - half a second
        animation.setInterpolator(new LinearInterpolator());    // do not alter animation rate
        animation.setRepeatCount(1);                            // Repeat animation infinitely
        animation.setRepeatMode(Animation.REVERSE);             // Reverse animation at the end so the button will fade back in

        return animation;

    }




}

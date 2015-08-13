package com.example.pc_user.fudora;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by msalad on 6/16/2015.
 */
public class LocalSearchFragment extends Fragment {

    private TextView tv;
    ExpandableListView eventList;
    EventAdapter adapter;
    HashMap<String, List<String>> event_Details;
    List<String> event_List;
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        v = inflater.inflate(R.layout.local_search,container,false);

        eventList = (ExpandableListView) v.findViewById(R.id.exp_list_users);
        event_Details = EventData.getInfo();
        event_List = new ArrayList<>(event_Details.keySet());
        adapter = new EventAdapter(v.getContext(), event_Details, event_List);
        eventList.setAdapter(adapter);


        // TODO Auto-generated method stub
         //tv = (TextView) getView().findViewById(R.id.textView1);
         //tv.startAnimation(getBlinkAnimation());
        return v;

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

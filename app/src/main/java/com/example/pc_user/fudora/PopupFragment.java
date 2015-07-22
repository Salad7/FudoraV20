package com.example.pc_user.fudora;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by msalad on 6/3/2015.
 */
public class PopupFragment extends Fragment {

    @Override
    public void onCreate(Bundle onSavedState)
    {
        super.onCreate(onSavedState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle onSavedState)
    {
        View v = inflater.inflate(R.layout.popupfragmentview, parent,false);
            return v;
    }



}

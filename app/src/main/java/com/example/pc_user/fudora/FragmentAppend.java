package com.example.pc_user.fudora;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by msalad on 6/18/2015.
 */
public class FragmentAppend extends Fragment {



public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
{

    View v;
    v =inflater.inflate(R.layout.fragment_append,container,true);

    Button clickme = (Button) v.findViewById(R.id.button);

    clickme.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });
//    EditText title = (EditText) getView().findViewById(R.id.editText);
//
//    bundle.putInt(title.toString(),1);

    //TESTING
//    String message = "1";
//    Intent intent = new Intent(getActivity().getBaseContext(),
//           Home.class);
//    intent.putExtra("1",1);
//    getActivity().startActivity(intent);
    //TESTING
    return v;
}

}

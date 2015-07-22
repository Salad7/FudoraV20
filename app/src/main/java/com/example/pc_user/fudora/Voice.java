package com.example.pc_user.fudora;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msalad on 6/5/2015.
 */
public class Voice extends Activity implements View.OnClickListener {

    private ListView lv;
    private Button btn;
   static final int check = 1111;

@Override
protected void onCreate(Bundle onSaveState)
{
    super.onCreate(onSaveState);
    setContentView(R.layout.voice);

    lv = (ListView) findViewById(R.id.listView);
    btn = (Button) findViewById(R.id.btn_voice);
    btn.setOnClickListener(this);

}

    public void onClick(View v)
    {
        Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_PROMPT,"Speak up son");
        startActivityForResult(i, check);
    }

    protected void onActivityResult(int r, int d, Intent i)
    {
        if(r == check && d == RESULT_OK)
        {
            ArrayList<String> results = i.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,results));
        }
        super.onActivityResult(r,d,i);

    }

}

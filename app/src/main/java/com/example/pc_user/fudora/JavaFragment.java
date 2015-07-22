package com.example.pc_user.fudora;


        import android.content.Context;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.ListFragment;
        import android.text.Layout;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.RelativeLayout;
        import android.widget.Spinner;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.ArrayList;

public class   JavaFragment extends Fragment {


    Toast intro;
    EditText[] words;
    String[] textArray = {"Shrimp","Tacos","Chicken","Turkey"};
    Integer[] imageArray = {R.drawable.shrimp, R.drawable.taco, R.drawable.chicken, R.drawable.turkey} ;

    ListView l;
    RelativeLayout manLayout,voiceLayout;
    Button voiceSearch;
    Button manualSearch;
    TextView manual_text_hint;
    TextView text;
    ImageView imageView;

    Spinner spinner;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View v;
        v = inflater.inflate(R.layout.java_layout,container,false);
        manLayout = (RelativeLayout) v.findViewById(R.id.manualLayout);
        voiceLayout = (RelativeLayout) v.findViewById(R.id.voiceLayout);


        //l = (ListView) v.findViewById(R.id.manualListView);
//        words[0] = ed; Crash here
//        words[1] = ed2; Crash here
//        words[2] = ed3; Crash here

        voiceSearch = (Button) v.findViewById(R.id.switch_voice);
        voiceSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manLayout.setVisibility(View.GONE);
                //voiceSearch.setVisibility(View.VISIBLE);
                voiceLayout.setVisibility(View.VISIBLE);
            }
        });


        manualSearch = (Button) v.findViewById(R.id.button3);
        manualSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voiceLayout.setVisibility(View.GONE);
                manLayout.setVisibility(View.VISIBLE);
            }
        });

        manual_text_hint = (TextView) v.findViewById(R.id.manual_txt);
        manual_text_hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introToast();
            }
        });

        text = (TextView) v.findViewById(R.id.spinnerTextView);
        imageView = (ImageView) v.findViewById(R.id.spinnerImages);
        spinner = (Spinner) v.findViewById(R.id.spinner);
        //ArrayAdapter adapterS = ArrayAdapter.createFromResource(v.getContext(),R.array.Spinner_Items,android.R.layout.simple_spinner_item);
        ArrayAdapter adapter = new SpinnerAdapter(v.getContext(), R.layout.spinner_value_layout, textArray, imageArray);
        spinner.setAdapter(adapter);

       //ArrayAdapter<String> adapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_list_item_1,test);
       //Works with String, not with EditText
      // l.setAdapter(adapter);
        return v;
    }

    public void introToast()
    {
        intro = (Toast.makeText(getView().getContext(),"Select from the drop down above foods",Toast.LENGTH_SHORT));
        intro.show();
    }
}
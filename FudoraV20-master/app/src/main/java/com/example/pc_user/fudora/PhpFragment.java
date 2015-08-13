
//Changed because we want to replace this whole class with fragment_append

package com.example.pc_user.fudora;


        import android.app.Activity;
        import android.app.AlertDialog;
        import android.app.Dialog;
        import android.content.Context;
        import android.content.DialogInterface;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.ArrayList;

public class PhpFragment extends Fragment {

    SendMessage SM;
    Context mContext;
    TextView textHintT,textHintP,textHintA,textHintD;
    Toast toastT,toastP,toastA,toastD;

    public PhpFragment()
    {
        mContext = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub


        View v = inflater.inflate(R.layout.php_layout, container, false);
        textHintT = ((TextView) v.findViewById(R.id.title_txt));
        textHintP = ((TextView) v.findViewById(R.id.purpose_txt));
        textHintA = ((TextView) v.findViewById(R.id.address_txt));
        textHintD = ((TextView) v.findViewById(R.id.date_txt));

        textHintT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            toastT_m();
            }
        });
        textHintP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastP_m();
            }
        });
        textHintA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastA_m();
            }
        });
        textHintD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastD_m();
            }
        });

return v;
}

    public void toastT_m()
    {
        toastT = (Toast.makeText(getView().getContext(),"Enter a title for your event",Toast.LENGTH_SHORT));
        toastT.show();

    }
    public void toastP_m()
    {
        toastP = (Toast.makeText(getView().getContext(),"A brief explanation of your event",Toast.LENGTH_SHORT));
        toastP.show();

    }
    public void toastA_m()
    {
        toastA = (Toast.makeText(getView().getContext(),"Where is the event held",Toast.LENGTH_SHORT));
        toastA.show();

    }
    public void toastD_m()
    {
        toastD = (Toast.makeText(getView().getContext(),"When is the event held - date and time",Toast.LENGTH_SHORT));
        toastD.show();

    }

    interface SendMessage
    {
        public void sendData(String message);
    }



    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
        SM = (SendMessage) activity;
        }
        catch(ClassCastException e)
        {
            throw new ClassCastException("You need to implement that send data method");
        }
    }

}


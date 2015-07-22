
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

public class PhpFragment extends Fragment {

    SendMessage SM;
    Context mContext;

    public PhpFragment()
    {
        mContext = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub


        View view = inflater.inflate(R.layout.php_layout, container, false);





   // ImageButton add = (ImageButton) getView().findViewById(R.id.addimage);
    //add.setOnClickListener(new View.OnClickListener()

//    {
//        @Override
//        public void onClick (View v){openOptionsMenu();
//    }
//    }
//
//    );
        //--------Old
       // ImageButton btn = (ImageButton) view.findViewById(R.id.addimage);
        //final TextView tv = (TextView) view.findViewById(R.id.textView9);


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String Message;
//                Message = tv.getText().toString();
//                 SM.sendData(Message);
//            }
//        });
        //---------Old
//        new AlertDialog.Builder(AlertDialogActivity.this)
//                .setTitle("Delete entry")
//                .setMessage("Are you sure you want to delete this entry?")
//                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int which) {
//                        // continue with delete
//                    }
//                })
//                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int which) {
//                        // do nothing
//                    }
//                })
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .show();
return view;
}

    interface SendMessage
    {
        public void sendData(String message);
    }

//
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(mContext);
//        alertDialogBuilder.setTitle("Really?");
//        alertDialogBuilder.setMessage("Are you sure?");
//        //null should be your on click listener
//        alertDialogBuilder.setPositiveButton("OK", null);
//        alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//            }
//        });
//        return alertDialogBuilder.create();
//    }

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



//package com.example.pc_user.fudora;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.EditText;
//
//import org.apache.http.cookie.SM;
//
///**
//* Created by msalad on 6/18/2015.
//*/
//public class PhpFragment extends Fragment {
//
//    SendMessage SM;
//
//    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        View v;
//        v =inflater.inflate(R.layout.php_layout,container,true);
//
//
//
//
////    EditText title = (EditText) getView().findViewById(R.id.editText);
////
////    bundle.putInt(title.toString(),1);
//
//        //TESTING
////    String message = "1";
////    Intent intent = new Intent(getActivity().getBaseContext(),
////           Home.class);
////    intent.putExtra("1",1);
////    getActivity().startActivity(intent);
//        //TESTING
//        return v;
//    }
//    interface SendMessage
//    {
//        public void sendData(String message);
//    }
//
//        @Override
//    public void onAttach(Activity activity)
//    {
//        super.onAttach(activity);
//        try
//        {
//        SM = (SendMessage) activity;
//        }
//        catch(ClassCastException e)
//        {
//            throw new ClassCastException("You need to implement that send data method");
//        }
//    }
//
//}



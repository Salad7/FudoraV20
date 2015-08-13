package com.example.pc_user.fudora;

import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by msalad on 8/12/2015.
 */
public class UserArrayList extends ArrayList {



    public static String title = "Information Session - Duke Energy";
    public static String date = "08/24/2015 - 11:00AM";
    public static String purpose = "Dukes in town!";
    public static String location = "Woodward Manor Room 120";

    UserArrayList()
    {


    }

    public String getTitle()
    {
        return title;
    }
    public String getDate()
    {
        return date;
    }
    public String getPurpose()
    {
        return purpose;
    }
    public String getLocation()
    {
        return location;
    }
}

package com.example.pc_user.fudora;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by msalad on 8/12/2015.
 */
public class EventData {


        public static HashMap<String, List<String>> getInfo()
        {
            HashMap<String, List<String>> eventDetails = new HashMap<String, List<String>>();

            List<String> User_A = new ArrayList<String>();
            List<String> User_B = new ArrayList<String>();
            List<String> User_C= new ArrayList<String>();
            //Titles (Titles have been commented out due to redundancy)
            //User_A.add(new UserArrayList().getTitle());

            //Purposes
            User_A.add(new UserArrayList().getPurpose());
            User_B.add("STARS meeting this week, -> GitHub!");
            User_C.add("App Ventures! the ins and outs of XML");
            //Locations
            User_A.add(new UserArrayList().getLocation());
            User_B.add("Woodward 211");
            User_C.add("Fretwell 1121");
            //Dates (Format should be changed*)
            User_A.add(new UserArrayList().getDate());
            User_B.add("08/31/2015 - 3:00PM");
            User_C.add("09/11/2015 - 4:30PM");
            eventDetails.put("User"+"\n"+User_A.get(0), User_A);
            eventDetails.put("Salad7"+"\n"+"STARS",User_B);
            eventDetails.put("Palacios07"+"\n"+"App Ventures",User_C);
            return eventDetails;


    }
}

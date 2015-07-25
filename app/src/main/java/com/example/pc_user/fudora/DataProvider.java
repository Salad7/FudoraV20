package com.example.pc_user.fudora;

/**
 * Created by msalad on 7/25/2015.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataProvider {

    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>> FoodDetails = new HashMap<String, List<String>>();

        List<String> Meat_c = new ArrayList<String>();
        Meat_c.add("Chicken");
        List<String> Seafood_c = new ArrayList<String>();
        Seafood_c.add("Seafood");
        List<String> Veggies_c= new ArrayList<String>();
        Veggies_c.add("Kelp");
        List<String> Desert_c = new ArrayList<String>();
        Desert_c.add("Lava Cake");

        FoodDetails.put("Meat", Meat_c);
        FoodDetails.put("Seafood Movies", Seafood_c);
        FoodDetails.put("Veggies Movies", Veggies_c);
        FoodDetails.put("Desert Movies", Desert_c);

        return FoodDetails;

    }

}
package com.example.pc_user.fudora;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class Home extends FragmentActivity implements ActionBar.TabListener , PhpFragment.SendMessage {
    ActionBar actionbar;
    ViewPager viewpager;
    FragmentPageAdapter ft;
    public static final String Key = "Custom";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (savedInstanceState == null)
        {

        }

        viewpager = (ViewPager) findViewById(R.id.pager);
        ft = new FragmentPageAdapter(getSupportFragmentManager());



        actionbar = getActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00FFBF")));
        actionbar.setStackedBackgroundDrawable(new ColorDrawable(Color.parseColor("#00FFBF")));
        viewpager.setAdapter(ft);
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionbar.addTab(actionbar.newTab().setIcon(R.drawable.search3).setTabListener(this));
        actionbar.addTab(actionbar.newTab().setIcon(R.drawable.create2).setTabListener(this));
        actionbar.addTab(actionbar.newTab().setIcon(R.drawable.eye).setTabListener(this));
        actionbar.addTab(actionbar.newTab().setIcon(R.drawable.settings).setTabListener(this));
        actionbar.addTab(actionbar.newTab().setIcon(R.drawable.account2).setTabListener(this));

        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                actionbar.setSelectedNavigationItem(arg0);

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        });
    }




    @Override
    public void sendData(String message)
    {
//    //JavaFragment f2 = (JavaFragment) getFragmentManager().findFragmentById(R.id.xx);
    }

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        viewpager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        // TODO Auto-generated method stub

    }


}
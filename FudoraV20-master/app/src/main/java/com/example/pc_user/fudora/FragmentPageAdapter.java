package com.example.pc_user.fudora;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
public class FragmentPageAdapter extends FragmentPagerAdapter {
    public FragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int arg0) {
        // TODO Auto-generated method stub
        switch (arg0) {
            case 0:
                return new JavaFragment();
            case 1:
                return new PhpFragment();
            case 2:
                return new LocalSearchFragment();
            case 3:
                return new DotnetFragment();
            default:
                break;
        }
        return null;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 4;
    }
}
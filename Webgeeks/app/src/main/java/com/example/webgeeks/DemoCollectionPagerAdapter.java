package com.example.webgeeks;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class DemoCollectionPagerAdapter extends FragmentPagerAdapter {
    public DemoCollectionPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        if(position==0)
        {
            fragment=new FragmentA();
        }
        if(position==1)
        {
            fragment=new FragmentB();
        }
        if(position==2)
        {
            fragment=new FragmentC();
        }
        return fragment;
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}

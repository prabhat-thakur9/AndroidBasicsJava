package com.example.scrolltabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends FragmentActivity {
ViewPager viewPager=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.pager);
        FragmentManager manager=getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(manager));
    }

 class MyAdapter extends FragmentPagerAdapter {
     public MyAdapter(@NonNull FragmentManager fm) {
         super(fm);
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
     }

     @Override
     public int getCount() {
         return 3;
     }

     @Nullable
     @Override
     public CharSequence getPageTitle(int position) {
         if(position==0)
         {
             return "Page 1";
         }
         if(position==1)
         {
             return "Page 2";
         }
         if(position==2)
         {
             return "Page 3";
         }
         return null;
     }

}}
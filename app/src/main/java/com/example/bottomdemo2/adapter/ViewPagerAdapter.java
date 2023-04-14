package com.example.bottomdemo2.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.bottomdemo2.fragment.FragmentCafe;
import com.example.bottomdemo2.fragment.FragmentHome;
import com.example.bottomdemo2.fragment.FragmentSearch;
import com.example.bottomdemo2.fragment.fragmentNotification;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int pageNum = 4;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int bahavior) {
        super(fm,bahavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new FragmentHome();
            case 1: return new fragmentNotification();
            case 2: return new FragmentSearch();
            case 3: return new FragmentCafe();
            default: return new FragmentHome();
        }
    }

    @Override
    public int getCount() {
        return pageNum;
    }
}

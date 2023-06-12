package com.example.assertsdownloadproject.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.assertsdownloadproject.Fragments.CutFileFragment;
import com.example.assertsdownloadproject.Fragments.MonogramFragment;
import com.example.assertsdownloadproject.Fragments.ShapesFragment;
import com.example.assertsdownloadproject.Fragments.WatercolorFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new CutFileFragment();
        }
        else if (position==1){
            return new MonogramFragment() ;
        }
        else if (position==2){
            return new ShapesFragment();
        }
        else{
            return new WatercolorFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "Cut File";
        }
        else if (position==1){
            return "Monogram";
        }
        else if (position==2){
            return "Shapes";
        }
        else{
            return "Watercolor";
        }
    }
}

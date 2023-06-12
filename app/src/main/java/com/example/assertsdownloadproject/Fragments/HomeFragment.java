package com.example.assertsdownloadproject.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.assertsdownloadproject.Adapters.ViewPagerAdapter;
import com.example.assertsdownloadproject.R;
import com.example.assertsdownloadproject.SubscriptionActivity;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {
    TabLayout tablayout;
    ViewPager viewPager;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tablayout= view.findViewById(R.id.tab);
        viewPager= view.findViewById(R.id.view_pager);
        button=view.findViewById(R.id.pro);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SubscriptionActivity.class));
            }
        });

        ViewPagerAdapter myAdapter=new ViewPagerAdapter(getActivity().getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);
        tablayout.setupWithViewPager(viewPager);

    }
}
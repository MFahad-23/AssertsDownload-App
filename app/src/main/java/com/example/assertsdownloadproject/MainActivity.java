package com.example.assertsdownloadproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.assertsdownloadproject.Fragments.HomeFragment;
import com.example.assertsdownloadproject.Fragments.StuffFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {
    SmoothBottomBar bottom_navigation_menu;
    RelativeLayout relativeLayout;
    FloatingActionButton floatingActionButton;

    HomeFragment first=new HomeFragment();
    StuffFragment second=new StuffFragment();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom_navigation_menu = (SmoothBottomBar) findViewById(R.id.bottom_navigation_menu);
        relativeLayout = (RelativeLayout) findViewById(R.id.layout_changer);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.preview_file);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Flaoting Action Button",Toast.LENGTH_SHORT).show();
            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.layout_changer,first).commit();
        bottom_navigation_menu.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                if (i==0) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.layout_changer,first).commit();
                }
                else{
                    getSupportFragmentManager().beginTransaction().replace(R.id.layout_changer,second).commit();

                }
                return false;
            }
        });

        /* Fragments Replacement :- *//*
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_changer,first).commit();
        bottom_navigation_menu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.home:
                        fragment = new HomeFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.search:
                        fragment = new StuffFragment();
                        loadFragment(fragment);
                        return true;
                }
                return false;
            }

            private void loadFragment(Fragment fragment) {
                // load fragment
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layout_changer, fragment);
                transaction.commit();
            }
        });*/
    }
}
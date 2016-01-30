package com.tacoma.uw.leebui99.yaker.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tacoma.uw.leebui99.yaker.R;

public class MainActivities extends AppCompatActivity
                            implements MenuFragment.LauncherMenuListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activities);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, new MenuFragment()).commit();
    }


    @Override
    public void launchMenu() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new ColorSection()).commit();
    }
}

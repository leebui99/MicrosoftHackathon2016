package com.tacoma.uw.leebui99.yaker.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tacoma.uw.leebui99.yaker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorSection extends Fragment {

    public interface LauncherColorListener{
        public void launchColorSection();
    }

    public ColorSection() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color_section, container, false);
    }


}

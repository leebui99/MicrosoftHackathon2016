package com.tacoma.uw.leebui99.yaker.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tacoma.uw.leebui99.yaker.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    private LauncherMenuListener mLauncherMenuListener;

    public interface LauncherMenuListener{
        public void launchMenu();
    }
    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_menu, container, false);
        Button mColor = (Button) v.findViewById(R.id.color);
        Button mTime = (Button) v.findViewById(R.id.picture);
        return v;
    }


}

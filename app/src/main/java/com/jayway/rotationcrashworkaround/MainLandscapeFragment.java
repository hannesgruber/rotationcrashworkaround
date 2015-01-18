package com.jayway.rotationcrashworkaround;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MainLandscapeFragment extends Fragment {

    public static MainLandscapeFragment newInstance() {
        MainLandscapeFragment fragment = new MainLandscapeFragment();
        return fragment;
    }

    public MainLandscapeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_landscape, container, false);
    }
}

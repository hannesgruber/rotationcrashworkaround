package com.jayway.rotationcrashworkaround;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainPortraitFragment extends Fragment {

    public static MainPortraitFragment newInstance() {
        MainPortraitFragment fragment = new MainPortraitFragment();
        return fragment;
    }

    public MainPortraitFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_portrait, container, false);
    }
}

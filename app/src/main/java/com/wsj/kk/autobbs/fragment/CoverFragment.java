package com.wsj.kk.autobbs.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wsj.kk.autobbs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CoverFragment extends Fragment {


    public CoverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cover, container, false);
    }

}

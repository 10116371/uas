package com.example.archyuas.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.archyuas.R;

// 10116371 ARCHY RPN IF-8  11/8/2019

public class About2Fragment extends Fragment {


    public About2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about2, container, false);
    }

    public interface OnFragmentInteractionListener {
    }
}

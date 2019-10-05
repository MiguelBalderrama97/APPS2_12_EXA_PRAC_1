/**
 * Created by Miguel Balderrama 10/05/2019
 * ShuttleFragment.java
 */

package com.example.miguel.tabulador.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.miguel.tabulador.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShuttleFragment extends Fragment {


    public ShuttleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shuttle, container, false);
    }

}

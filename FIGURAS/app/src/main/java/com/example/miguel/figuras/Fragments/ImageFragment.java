/**
 * Created by Miguel Balderrama 06/10/2019
 * ImageFragment.java
 */

package com.example.miguel.figuras.Fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.miguel.figuras.Interfaces.FragmentCom;
import com.example.miguel.figuras.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageFragment extends Fragment implements FragmentCom {

    private ImageView imageFigure;

    private View view;

    public ImageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_image, container, false);

        imageFigure = view.findViewById(R.id.imageFigure);

        return view;
    }

    @Override
    public void onFromMainToFrag(String figure, String field1, String field2, int image) {
        imageFigure.setImageResource(image);
    }
}

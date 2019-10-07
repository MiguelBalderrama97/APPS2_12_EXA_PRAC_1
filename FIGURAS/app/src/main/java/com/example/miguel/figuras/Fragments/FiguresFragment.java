/**
 * Created by Miguel Balderrama 06/10/2018
 * FiguresFragment.java
 */

package com.example.miguel.figuras.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.example.miguel.figuras.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FiguresFragment extends Fragment {

    private RadioButton rbRec, rbTri, rbRom, rbPen, rbHex, rbPir, rbPris, rbCom, rbCor;

    private View view;

    public FiguresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_figures, container, false);

        rbCom = view.findViewById(R.id.rbCom);
        rbCor = view.findViewById(R.id.rbCor);
        rbHex = view.findViewById(R.id.rbHex);
        rbPen = view.findViewById(R.id.rbPen);
        rbPir = view.findViewById(R.id.rbPir);
        rbPris = view.findViewById(R.id.rbPris);
        rbRec = view.findViewById(R.id.rbRec);
        rbRom = view.findViewById(R.id.rbRom);
        rbTri = view.findViewById(R.id.rbTri);

        return view;
    }

}

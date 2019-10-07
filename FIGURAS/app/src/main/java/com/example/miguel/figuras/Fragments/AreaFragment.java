/**
 * Created by Miguel Balderrama 06/10/2019
 * AreaFragment.java
 */

package com.example.miguel.figuras.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.miguel.figuras.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaFragment extends Fragment {

    private EditText etxtField1, etxtField2;
    private Button btnCalculate;
    private TextView txtResult;

    private View view;

    public AreaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_area, container, false);

        etxtField1 = view.findViewById(R.id.etxtField1);
        etxtField2 = view.findViewById(R.id.etxtField2);
        btnCalculate = view.findViewById(R.id.btnCalculate);
        txtResult = view.findViewById(R.id.txtResult);

        return view;
    }

}

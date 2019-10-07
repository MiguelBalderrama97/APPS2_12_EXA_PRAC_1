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

import com.example.miguel.figuras.Interfaces.FragmentCom;
import com.example.miguel.figuras.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaFragment extends Fragment implements FragmentCom {

    private EditText etxtField1, etxtField2;
    private Button btnCalculate;
    private TextView txtResult;

    private View view;

    private String code;

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

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int field1 = Integer.parseInt(etxtField1.getText().toString());
                int field2 = Integer.parseInt(etxtField2.getText().toString());
                int result = 0;

                switch (code){
                    case "HEX":
                    case "PEN":
                    case "TRI":
                    case "ROM":
                    case "COM":
                        result = (field1 * field2) / 2;
                        break;
                    case "REC":
                        result =  (field1 * field2);
                        break;
                    case "PIR":
                        result = (field1 * field1) + ((4) * ((field1 * field2) / 2));
                        break;
                    case "PRIS":
                        result = (field1 * field1) + ((4) * ((field1 * field2)));
                        break;
                    case "COR":
                        result =  (int)((Math.PI) * (Math.pow(field1,2) - Math.pow(field2,2)));
                        break;
                }

                txtResult.setText("Area: " + result + " cm2");
            }
        });

        return view;
    }

    @Override
    public void onFromMainToFrag(String figure, String field1, String field2, int image) {
        etxtField1.setHint(field1);
        etxtField2.setHint(field2);
        btnCalculate.setVisibility(View.VISIBLE);
        this.code = figure;
        etxtField1.setText("");
        etxtField2.setText("");
    }
}

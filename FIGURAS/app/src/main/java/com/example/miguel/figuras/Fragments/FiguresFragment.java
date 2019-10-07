/**
 * Created by Miguel Balderrama 06/10/2018
 * FiguresFragment.java
 */

package com.example.miguel.figuras.Fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.miguel.figuras.Activities.MainActivity;
import com.example.miguel.figuras.Interfaces.FragmentCom;
import com.example.miguel.figuras.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FiguresFragment extends Fragment implements FragmentCom{

    private RadioButton rbRec, rbTri, rbRom, rbPen, rbHex, rbPir, rbPris, rbCom, rbCor;
    private RadioGroup radioGroup;

    private View view;

    private MainActivity mainActivity;

    public FiguresFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = (MainActivity) getActivity();
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
        radioGroup = view.findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rbHex:
                        mainActivity.onFromMainToFrag("HEX", "Perimetro","Apotema", R.drawable.pentagono);
                        break;
                    case R.id.rbCom:
                        mainActivity.onFromMainToFrag("COM", "Diagonal1","Diagonal2", R.drawable.cometa);
                        break;
                    case R.id.rbCor:
                        mainActivity.onFromMainToFrag("COR", "Radio1","Radio2",R.drawable.corona);
                        break;
                    case R.id.rbPen:
                        mainActivity.onFromMainToFrag("PEN", "Perimetro","Apotema", R.drawable.pentagono);
                        break;
                    case R.id.rbPir:
                        mainActivity.onFromMainToFrag("PIR", "Base","Altura", R.drawable.piramide);
                        break;
                    case R.id.rbPris:
                        mainActivity.onFromMainToFrag("PRIS", "Base","Altura", R.drawable.prisma);
                        break;
                    case R.id.rbRec:
                        mainActivity.onFromMainToFrag("REC", "Base","Altura", R.drawable.rectangulo);
                        break;
                    case R.id.rbRom:
                        mainActivity.onFromMainToFrag("ROM", "Diagonal1","Diagonal2", R.drawable.rombo);
                        break;
                    case R.id.rbTri:
                        mainActivity.onFromMainToFrag("TRI", "Base","Altura", R.drawable.triangulo);
                        break;
                }
            }
        });

        return view;
    }


    @Override
    public void onFromMainToFrag(String figure, String field1, String field2, int image) {

    }
}

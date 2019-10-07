package com.example.exa1__4_storyboard;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class seekBarFragment extends Fragment {
    Comunicador comunicador;
    SeekBar seekBar;
    TextView txt1;
    //txtVwN1 = getActivity().findViewById(R.id.txtVwN1);
//txtVwN1.setText(n);


    public seekBarFragment() {
        // Required empty public constructor
    }
    public interface Comunicador{
        public void enviar(int envia);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_seek_bar, container, false);
        // Inflate the layout for this fragment
        seekBar = view.findViewById(R.id.seekBar);
        txt1 = view.findViewById(R.id.txt1);




        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int n = 0;



            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //txt1.setText(i);
                n=i;
                txt1.setText("" +n);
                comunicador.enviar(n);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        comunicador = (Comunicador) context;
        super.onAttach(context);
    }
}

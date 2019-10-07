package com.example.apps2_exa_sequence_thread;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

/**
 * A simple {@link Fragment} subclass.
 */
public class SliderFragment extends Fragment {
    SeekBar seekBar;
    View vwSlide;
    MainActivity ma;
    private int max = 5000;
    private int min = 1000;

    public SliderFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ma = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vwSlide = inflater.inflate(R.layout.fragment_slider, container, false);
        seekBar = vwSlide.findViewById(R.id.seekBar);
        seekBar.setMax(max - min);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                ma.fromFragmentToMain(seekBar.getProgress());
            }
        });
        return vwSlide;
    }
}

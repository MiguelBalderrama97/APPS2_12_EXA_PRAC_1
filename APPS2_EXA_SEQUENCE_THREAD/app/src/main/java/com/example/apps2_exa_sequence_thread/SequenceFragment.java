package com.example.apps2_exa_sequence_thread;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SequenceFragment extends Fragment implements FragmentComunication{
    ImageView myImg;
    View vwSequence;

    public SequenceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vwSequence = inflater.inflate(R.layout.fragment_sequence, container, false);
        myImg = vwSequence.findViewById(R.id.myImg);
        return vwSequence;
    }

    @Override
    public void fromMainToFragment(int drawableResource) {
        myImg.setImageResource(MainActivity.arrayImg[drawableResource]);
    }
}

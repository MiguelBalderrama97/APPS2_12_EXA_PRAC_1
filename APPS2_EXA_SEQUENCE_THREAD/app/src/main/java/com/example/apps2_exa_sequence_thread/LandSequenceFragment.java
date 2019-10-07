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
public class LandSequenceFragment extends Fragment implements FragmentComunication {
    ImageView imgLand1;
    ImageView imgLand2;
    ImageView imgLand3;
    View vwSequenceLand;

    public LandSequenceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vwSequenceLand = inflater.inflate(R.layout.fragment_land_sequence, container, false);
        imgLand1 = vwSequenceLand.findViewById(R.id.imgLand1);
        imgLand2 = vwSequenceLand.findViewById(R.id.imgLand2);
        imgLand3 = vwSequenceLand.findViewById(R.id.imgLand3);
        return vwSequenceLand;
    }

    @Override
    public void fromMainToFragment(int drawableResource) {
        int previousImg = 0;
        int postImg = 0;
        if(drawableResource == 0){
            previousImg = 8;
            postImg = 1;
        }else if(drawableResource == 8){
            previousImg = 7;
            postImg = 0;
        }else{
            previousImg = drawableResource - 1;
            postImg = drawableResource + 1;
        }
        imgLand1.setImageResource(MainActivity.arrayImg[previousImg]);
        imgLand2.setImageResource(MainActivity.arrayImg[drawableResource]);
        imgLand3.setImageResource(MainActivity.arrayImg[postImg]);
    }
}

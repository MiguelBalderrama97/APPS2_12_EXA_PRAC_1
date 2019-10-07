package com.example.exa1__4_storyboard;


import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class imageFragment extends Fragment {
    ImageView imgVw1;
    ImageView imgVw2;
    ImageView imgVw3;

    int[] imgArray = new int[]{R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9
    };


    public imageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_image, container, false);
        imgVw1 = v.findViewById(R.id.imageView3);
        imgVw2 = v.findViewById(R.id.imageView4);
        imgVw3 = v.findViewById(R.id.imageView5);
        imgVw2.setVisibility((getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT)? View.GONE : View.VISIBLE);
        imgVw3.setVisibility((getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT)? View.GONE : View.VISIBLE);

        return v;
    }
    public void recibir (int texto){
        int pos = texto;
        int pos2 = texto+1;
        int pos3 = texto+2;
        if (texto<=6) {
            Drawable a = getResources().getDrawable(imgArray[texto]);
            imgVw1.setImageDrawable(a);
        }
        if (pos2<=7) {
            Drawable b =getResources().getDrawable(imgArray[pos2]);
            imgVw2.setImageDrawable(b);
        }
        if (pos3<=8) {
            Drawable c =getResources().getDrawable(imgArray[pos3]);
            imgVw3.setImageDrawable(c);
        }



    }

}

/**
 * Created by Miguel Balderrama 06/10/2019
 * MainActivity.java
 */

package com.example.miguel.figuras.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.miguel.figuras.Fragments.AreaFragment;
import com.example.miguel.figuras.Fragments.FiguresFragment;
import com.example.miguel.figuras.Fragments.ImageFragment;
import com.example.miguel.figuras.Interfaces.FragmentCom;
import com.example.miguel.figuras.R;

public class MainActivity extends AppCompatActivity implements FragmentCom {

    private FiguresFragment figuresFragment;
    private ImageFragment imageFragment;
    private AreaFragment areaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onAttachFragment(@NonNull Fragment fragment) {
        super.onAttachFragment(fragment);
        if(fragment.getClass() == FiguresFragment.class){
            figuresFragment = (FiguresFragment) fragment;
        }else if(fragment.getClass() == ImageFragment.class){
            imageFragment = (ImageFragment) fragment;
        }else if(fragment.getClass() == AreaFragment.class){
            areaFragment = (AreaFragment) fragment;
        }
    }

    @Override
    public void onFromMainToFrag(String figure, String field1, String field2, int image) {
        imageFragment.onFromMainToFrag(figure,field1,field2,image);
        areaFragment.onFromMainToFrag(figure,field1,field2,image);
    }
}

package com.example.apps2_exa_sequence_thread;

import android.content.res.Configuration;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    SequenceFragment sequenceFragment;
    SliderFragment sliderFragment;
    LandSequenceFragment landSequenceFragment;
    boolean isLand = false;
    SeekBar seekBar;
    private int progress=1;
    private int max = 5000;

     static final int arrayImg[] = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,
            R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            //TODO: Obtener el seekbar por orientacion
            isLand = false;
        }else if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            isLand = true;
        }
        MyClassAsynk myAsynk = new MyClassAsynk();
        myAsynk.execute(0);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

        if(fragment.getClass() == SequenceFragment.class){
            sequenceFragment = (SequenceFragment) fragment;
        }else if(fragment.getClass() == SliderFragment.class){
            sliderFragment = (SliderFragment) fragment;
        }else if(fragment.getClass() == LandSequenceFragment.class){
            landSequenceFragment = (LandSequenceFragment) fragment;
        }
    }
    public void fromFragmentToMain(int iVal){
        progress = iVal;
    }

    public void setImgToFragment(int drawableResource){
        if(isLand){
            landSequenceFragment.fromMainToFragment(drawableResource);
        }else{
            sequenceFragment.fromMainToFragment(drawableResource);
        }
    }

    class MyClassAsynk extends AsyncTask<Integer,Void,Void> {
        //private int progress=1;
        private int time = 1000;

        private int iImg = 0;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            setImgToFragment(iImg);
            if(iImg == 8){
                iImg = 0;
            }else{
                iImg++;
            }
        }

        //NO SE PUEDE INTERACTUAR CON  LA UI
        //Equivalente al metodo run
        @Override
        protected Void doInBackground(Integer... integers) {
            while (true){
                try{
//                    progress = seekBar.getProgress();
                    time = max - progress;
                    publishProgress();
                    Thread.sleep(time);
                }catch (InterruptedException e){}
            }
        }
    }
}

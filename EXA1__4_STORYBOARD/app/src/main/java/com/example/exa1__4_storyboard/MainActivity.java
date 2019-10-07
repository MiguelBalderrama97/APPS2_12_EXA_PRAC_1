package com.example.exa1__4_storyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements seekBarFragment.Comunicador {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviar(int envia){
        imageFragment recibe = (imageFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        if (recibe != null){
            recibe.recibir(envia);

        }
    }
}

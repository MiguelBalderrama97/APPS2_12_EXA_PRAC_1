/**
 * Created by Miguel Balderrama 05/10/2019
 * MainActivity.java
 */

package com.example.miguel.tabulador.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.miguel.tabulador.R;

public class MainActivity extends AppCompatActivity {

    private Button btnShut, btnAres, btnFal;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShut = findViewById(R.id.btnShu);
        btnAres = findViewById(R.id.btnAres);
        btnFal = findViewById(R.id.btnFal);
        frameLayout = findViewById(R.id.frameLayout);
    }
}

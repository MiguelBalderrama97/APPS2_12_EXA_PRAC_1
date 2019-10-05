/**
 * Created by Miguel Balderrama 05/10/2019
 * MainActivity.java
 */

package com.example.miguel.tabulador.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.miguel.tabulador.Fragments.AresFragment;
import com.example.miguel.tabulador.Fragments.FalconFragment;
import com.example.miguel.tabulador.Fragments.ShuttleFragment;
import com.example.miguel.tabulador.R;

public class MainActivity extends AppCompatActivity {

    private Button btnShut, btnAres, btnFal;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private AresFragment aresFragment;
    private FalconFragment falconFragment;
    private ShuttleFragment shuttleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShut = findViewById(R.id.btnShu);
        btnAres = findViewById(R.id.btnAres);
        btnFal = findViewById(R.id.btnFal);

        fragmentManager = getSupportFragmentManager();

        btnShut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shuttleFragment = new ShuttleFragment();
                replaceFragment(shuttleFragment, "SHUTTLE");
            }
        });

        btnFal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                falconFragment = new FalconFragment();
                replaceFragment(falconFragment, "FALCON");
            }
        });

        btnAres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aresFragment = new AresFragment();
                replaceFragment(aresFragment, "ARES");
            }
        });
    }

    /**
     *
     * @param fragment What type of fragment we'll replace
     * @param tag Tag who we'll add to the transaction
     */
    private void replaceFragment(Fragment fragment, String tag){
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_right,R.anim.enter_from_right,R.anim.exit_to_right);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.add(R.id.frameLayout,fragment,tag);
        fragmentTransaction.commit();
    }
}

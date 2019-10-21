package com.grace.fragmentstutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        FragmentOne.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentOne fragment = FragmentOne.newInstance();
        fragmentTransaction.add(R.id.fragmentOne, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(String text, int colorId) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentTwo fragment = FragmentTwo.newInstance(text, colorId);
        fragmentTransaction.replace(R.id.fragmentTwo, fragment);
        fragmentTransaction.commit();
    }
}
package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        BodyPartFragment headfragment = new BodyPartFragment();
        BodyPartFragment bodyfragment = new BodyPartFragment();
        BodyPartFragment legfragment = new BodyPartFragment();

        headfragment.setImageIds(AndroidImageAssets.getHeads());
        headfragment.setListIndex(1);

        bodyfragment.setImageIds(AndroidImageAssets.getBodies());
        bodyfragment.setListIndex(1);

        legfragment.setImageIds(AndroidImageAssets.getLegs());
        legfragment.setListIndex(1);

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().add(R.id.head_container,headfragment).commit();

        fragmentManager.beginTransaction().add(R.id.body_container,bodyfragment).commit();

        fragmentManager.beginTransaction().add(R.id.leg_container,legfragment).commit();
    }
}
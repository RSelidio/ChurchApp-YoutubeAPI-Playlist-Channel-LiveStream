package com.example.videoyt;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.videoyt.fragments.ChannelFragment;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ChannelFragment myf = new ChannelFragment();

        final androidx.fragment.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mainFrame,myf);
        transaction.addToBackStack(null);
        transaction.commit();


    }
}

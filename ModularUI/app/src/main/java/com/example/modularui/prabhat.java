package com.example.modularui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class prabhat extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Intent intent=getIntent();
        int index=intent.getIntExtra("index",0);
        FragmentB f2= (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        if(f2!=null){
            f2.changeData(index);}
    }
}

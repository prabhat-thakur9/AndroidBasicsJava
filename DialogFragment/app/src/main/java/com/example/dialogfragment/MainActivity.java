package com.example.dialogfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showdialog(View view) {
        MyAlert myalert=new MyAlert();
        myalert.show(getSupportFragmentManager(),"My alert");
    }

   public void showFragment(View view) {
        MyAlert myalert=new MyAlert();
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.group,myalert);
        transaction.commit();
    }
}
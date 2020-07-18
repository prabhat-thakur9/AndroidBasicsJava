package com.example.prabhat.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentA extends Fragment implements View.OnClickListener {
    @Nullable
    Button button;
    int counter=0;
    Communicator comm;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm= (Communicator) getActivity();
    button=getActivity().findViewById(R.id.button);
    button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        counter++;
        comm.respond("The Button was clicked "+counter+" times");
    }
}

package com.example.modularui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {
    ListView list;
    Communicator comm;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_a,container,false);
        list=view.findViewById(R.id.listview);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(getActivity(),R.array.chapters,android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        return view;

    }
    public void setCommunicator(Communicator comm){
        this.comm=comm;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    comm.respond(i);
    }
    public interface Communicator{
        public void respond(int index);

    }
}

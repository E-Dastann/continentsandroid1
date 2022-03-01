package com.example.continents;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment implements OnClickListener {
    private ArrayList<Model> data;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.Recyclerview);
        AdapterName adapterName = new AdapterName(data,this);
        recyclerView.setAdapter(adapterName);
    }


    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model(R.drawable.south_americka, "south america"));
        data.add(new Model(R.drawable.europa, "Europa"));
        data.add(new Model(R.drawable.asia, "Eurasia"));
        data.add(new Model(R.drawable.atartica, "Antarctica"));
        data.add(new Model(R.drawable.northamerca, "Australia"));
        data.add(new Model(R.drawable.australianame, "Africa"));


    }

    @Override
    public void onClick(String name) {
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        SecondFragment fragment = new SecondFragment();
        fragment.setArguments(bundle);


        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack("").commit();


    }
}
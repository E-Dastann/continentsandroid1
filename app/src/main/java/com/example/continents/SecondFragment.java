package com.example.continents;

import static android.content.ContentValues.TAG;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    ArrayList<Model> data;
    private RecyclerView recyclerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadData();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.Recyclerview_name);
        AdapterName adapterName = new AdapterName(data, new OnClickListener() {
            @Override
            public void onClick(String name) {

            }
        });
        recyclerView.setAdapter(adapterName);
    }

    private void loadData() {
        data = new ArrayList<>();
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String name = bundle.getString("name");
            if (name != null) {
                if (name.equals("south america")) {
                    data.add(new Model(R.drawable.brasilia, "Бразиля"));
                    data.add(new Model(R.drawable.argentina, "Аргентина"));
                    data.add(new Model(R.drawable.peru, "перу"));
                    data.add(new Model(R.drawable.ecuador, "Экуадор"));

                }
                if (name == "Africa") {
                    data.add(new Model(R.drawable.northafrika, "Южная африка"));
                    data.add(new Model(R.drawable.kenia, "кения"));
                    data.add(new Model(R.drawable.sengal, "сенгал"));
                    data.add(new Model(R.drawable.nigeria, "нигерия"));
                    data.add(new Model(R.drawable.gana, "гана"));
                    data.add(new Model(R.drawable.efiopia, "эфиопия"));
                    data.add(new Model(R.drawable.tanzania, "танзания"));


                }
                if (name == "Europa") {

                    data.add(new Model(R.drawable.francia, "Франция"));
                    data.add(new Model(R.drawable.italia, "Италия"));
                    data.add(new Model(R.drawable.iispania, "испания"));
                    data.add(new Model(R.drawable.portugalia, "Португалия"));
                    data.add(new Model(R.drawable.nigerlandy, "Нигерланды"));
                    data.add(new Model(R.drawable.grecia, "Греция "));
                    data.add(new Model(R.drawable.irlandia, "Ирландия"));
                    data.add(new Model(R.drawable.belgia, "Белгия"));

                }
                if (name == "Eurasia") {
                    data.add(new Model(R.drawable.uzbekistan, "uzbekistan"));
                    data.add(new Model(R.drawable.kazaxstan, "kazakhstan"));
                    data.add(new Model(R.drawable.kyrgyzstan, "Kyrgyzstan"));
                    data.add(new Model(R.drawable.afganistan, "Afghanistan"));
                    data.add(new Model(R.drawable.tajicistan, "Tajikistan"));

                }
                if (name == "Australia") {
                    data.add(new Model(R.drawable.austaralia, "Australia"));
                }
                if (name == "Antarctica") {
                    data.add(new Model(R.drawable.australianame, "No country"));
                }



            }
        }


    }
}
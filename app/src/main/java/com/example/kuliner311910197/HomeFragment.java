package com.example.kuliner311910197;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView rvKuliner;
    private final ArrayList<ModelKuliner> data = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_home, container,
                false);

        rvKuliner = myView.findViewById(R.id.rv_kuliner);
        rvKuliner.setHasFixedSize(true);
        ;

        data.addAll(DataKuliner.ambilDataKuliner());

        tampilDataCard();

// Inflate the layout for this fragment
        return myView;
    }

    private void tampilDataCard() {
        rvKuliner.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterCard adapterCard = new AdapterCard(data);
        rvKuliner.setAdapter(adapterCard);
    }
}

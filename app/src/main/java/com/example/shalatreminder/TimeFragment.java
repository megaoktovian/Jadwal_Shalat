package com.example.shalatreminder;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class TimeFragment extends Fragment implements MainView {

    RecyclerView recyclerView;
    SholatAdapter adapter;
    List<SholatModel> sholatModels = new ArrayList<>();
    public TimeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_time2, container, false);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new SholatAdapter(getContext(), sholatModels);
        recyclerView.setAdapter(adapter);
        SholatData data = new SholatData(this,getContext());
        data.setData();
    }



    @Override
    public void onSuccess(List<SholatModel> sholatModels) {
        this.sholatModels.clear();
        this.sholatModels.addAll(sholatModels);
        this.adapter.notifyDataSetChanged();
    }

}

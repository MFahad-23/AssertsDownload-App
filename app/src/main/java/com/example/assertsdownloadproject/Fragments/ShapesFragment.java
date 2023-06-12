package com.example.assertsdownloadproject.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.assertsdownloadproject.Adapters.CutFilesAdapter;
import com.example.assertsdownloadproject.R;

import java.util.ArrayList;
import java.util.List;

public class ShapesFragment extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    CutFilesAdapter myadapter;
    List<String> cut_files_list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shapes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.asserts_loading);
        cut_files_list=new ArrayList<>();
        cut_files_list.add("");
        cut_files_list.add("");
        cut_files_list.add("");
        cut_files_list.add("");
        cut_files_list.add("");
        layoutManager=new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        myadapter=new CutFilesAdapter(cut_files_list,getActivity());
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
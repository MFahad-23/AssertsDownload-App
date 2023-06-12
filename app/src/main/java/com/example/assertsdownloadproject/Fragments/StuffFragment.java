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
import android.widget.ImageView;

import com.example.assertsdownloadproject.Adapters.DownloadAssertsAdapter;
import com.example.assertsdownloadproject.R;

import java.util.ArrayList;
import java.util.List;

public class StuffFragment extends Fragment {
    RecyclerView recyclerView;
    DownloadAssertsAdapter myAdapter;
    LinearLayoutManager layoutManager;
    List<String> download_asserts_list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stuff, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.download_asserts);

        download_asserts_list=new ArrayList<>();
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");
        download_asserts_list.add("");

        layoutManager=new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        myAdapter=new DownloadAssertsAdapter(download_asserts_list,getActivity());
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
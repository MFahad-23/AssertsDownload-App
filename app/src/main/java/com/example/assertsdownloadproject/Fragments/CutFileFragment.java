package com.example.assertsdownloadproject.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.storage.StorageItem;
import com.amplifyframework.storage.options.StoragePagedListOptions;
import com.example.assertsdownloadproject.Adapters.AssertsLoadingAdapter;
import com.example.assertsdownloadproject.Adapters.CutFilesAdapter;
import com.example.assertsdownloadproject.Adapters.DownloadAssertsAdapter;
import com.example.assertsdownloadproject.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class CutFileFragment extends Fragment {
/*
    private String  SignedUri="https://cut-art.s3.us-east-1.amazonaws.com/templates.json?response-content-disposition=inline&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEPf%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCmFwLXNvdXRoLTEiRzBFAiAPj2uBC%2BGT1ILjdImp%2Bi8Pa9BWibPSVuzGxEJYUwQcbAIhAIuaHZDamIkopukadIXx%2F4t9eKWbXvF%2BZEDFgExlXIRuKv0CCEAQABoMNDM5MzgyNTY2MzY3IgwFZMvYfVBWj%2F7SkiMq2gJlbUGBS8zQ7KP5C3pyxHt5efIHdG8ttablNUwkH5aBLHDJiImX6ZEEVsLqyBw7ZB6E5089nFYq0DnqPTTD9wzMDY3yN5ezF78uesw3h6EQrJkVT7oMh3huk6FSLRsa38I80gPM7fABlOuU3c7h%2BYr53lopYYH%2BQ2gtAKV2HWWkxU%2F62ottma4yFvEa6MyDnbKDeAvEYrczmY2oJWR7z4d9zeh2sX%2BczMELKFo6AonDWEDHeo8KFUMS8sVYKcbarLK1eKrx3z6g4ak2kFK3Dzbw54tqmS9HNcM56UhaUoZy92yyEOVAowajn5XOGqExBeybFY6kXh0hBExV2NI7k3GiskTPQKQ3I8odeDEqX4bSzjqqIEyNMYdROrJJHDk%2ByCCu%2F2rtl3K4zYzTshMnysybJKVfabVVyYkQDj39yXl1V%2FIYPKHskBDnhvGb2QoArG04uOjcNO5%2B%2B5MxMKuy%2B6MGOrMCmFqivqjAokQCD68qs7%2B7tJx%2FBHVWgIC3IcaYUUjEBV3Ret4QjMi2D2%2BjyFt7ObQQMDGsH04uY9pZ0ewjgLwJCpLvwX4Ragsqa8ml9jNAwTHnZOcDn9YV%2F%2Bk2Q3NdvjxN4OqupzTtB33Mtz2KkSKULoX%2BaDd5iVIoyG%2FidJz14xgasWLHw4y%2F0AteBv4qw%2FrOZUs4UXfJHHkx1cGUubYgEz%2FqRCc80jRZvvd6RTxI%2FfYOH7dntrWGR07bD2IZ6KqL0aOhf4sC2ZjfWuQBZniKIBNF5E%2BR9oFZ8dA66H6UKr88t90iGoWIRjme62uDxM1PeU0idy5qSXAeElWgzJzc5wXr6RRpDEZq3yqWsaBAOW3qMJJfb%2Bzqo0i8VRSEAawNhrnA2U%2FPPUO327wM5cWiin3wFQ%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230606T100817Z&X-Amz-SignedHeaders=host&X-Amz-Expires=7200&X-Amz-Credential=ASIAWMTJ54XPVTBW5FMP%2F20230606%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=d538be8e1756bba163b2950d1d611594119544d6aef48ffe5275102ae6cd0fa2";
*/
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    CutFilesAdapter myadapter;
    List<String> cut_files_list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cut_file, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       /* try {
            // Add these lines to add the AWSCognitoAuthPlugin and AWSS3StoragePlugin plugins
            Amplify.addPlugin(new AWSCognitoAuthPlugin());
            Amplify.addPlugin(new AWSS3StoragePlugin());
            Amplify.configure(getActivity());

            Log.i("MyAmplifyApp", "Initialized Amplify");
        } catch (AmplifyException error) {
            Log.e("MyAmplifyApp", "Could not initialize Amplify", error);
        }*/

        StoragePagedListOptions options = StoragePagedListOptions.builder()
                .setPageSize(1000)
                .build();

        Amplify.Storage.list(
                "",
                options,
                result -> {
                    for (StorageItem item : result.getItems()) {
                        Log.i("MyAmplifyApp", "Item: " + item.getKey());
                    }
                    Log.i("MyAmplifyApp", "Next Token: " + result.getNextToken());
                },
                error -> Log.e("MyAmplifyApp", "List failure", error));

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
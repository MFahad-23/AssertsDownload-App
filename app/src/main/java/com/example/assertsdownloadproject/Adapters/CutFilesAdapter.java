package com.example.assertsdownloadproject.Adapters;

import android.app.DownloadManager;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.assertsdownloadproject.R;

import java.util.ArrayList;
import java.util.List;

public class CutFilesAdapter extends RecyclerView.Adapter<CutFilesAdapter.ViewHolder> {
    List<String> cut_files_list;
    Context context;

    public CutFilesAdapter(List<String> cut_files_list, Context context) {
        this.cut_files_list = cut_files_list;
        this.context = context;
    }

    @NonNull
    @Override
    public CutFilesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cut_files_design,parent,false);
        return new CutFilesAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CutFilesAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return cut_files_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView;
        private LinearLayoutManager layoutManager;
        private List<String> asserts_loading_files;
        private AssertsLoadingAdapter adapter;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            recyclerView=itemView.findViewById(R.id.asserts_recyclerView);
            asserts_loading_files=new ArrayList<>();
            asserts_loading_files.add("");
            asserts_loading_files.add("");
            asserts_loading_files.add("");
            asserts_loading_files.add("");
            asserts_loading_files.add("");
            layoutManager=new LinearLayoutManager(context);
            layoutManager.setOrientation(RecyclerView.HORIZONTAL);
            adapter=new AssertsLoadingAdapter(asserts_loading_files,context);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(layoutManager);

        }
    }
}

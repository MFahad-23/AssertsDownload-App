package com.example.assertsdownloadproject.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assertsdownloadproject.AssertsPreviewActivity;
import com.example.assertsdownloadproject.R;
import com.example.assertsdownloadproject.SubscriptionActivity;

import java.util.List;

public class AssertsLoadingAdapter extends RecyclerView.Adapter<AssertsLoadingAdapter.ViewHolder> {
    List<String> asserts_loading_files;
    Context context;

    public AssertsLoadingAdapter(List<String> asserts_loading_files, Context context) {
        this.asserts_loading_files = asserts_loading_files;
        this.context = context;
    }
    @NonNull
    @Override
    public AssertsLoadingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.asserts_loading_design,parent,false);
        return new AssertsLoadingAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssertsLoadingAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return asserts_loading_files.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            button=itemView.findViewById(R.id.view_button);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent next_activity=new Intent(context, AssertsPreviewActivity.class);
                    context.startActivity(next_activity);
                }
            });
        }
    }
}

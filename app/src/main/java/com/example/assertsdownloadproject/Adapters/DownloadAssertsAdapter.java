package com.example.assertsdownloadproject.Adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assertsdownloadproject.R;

import java.util.List;

public class DownloadAssertsAdapter extends RecyclerView.Adapter<DownloadAssertsAdapter.ViewHolder> {
    List<String> download_asserts_list;
    Context context;

    public DownloadAssertsAdapter(List<String> download_asserts_list, Context context) {
        this.download_asserts_list = download_asserts_list;
        this.context = context;
    }

    @NonNull
    @Override
    public DownloadAssertsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.stuff_list_design,parent,false);
        return new DownloadAssertsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DownloadAssertsAdapter.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return download_asserts_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout linearLayout;
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout=itemView.findViewById(R.id.layout);
            imageView=itemView.findViewById(R.id.asserts);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context,"Hello World",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}

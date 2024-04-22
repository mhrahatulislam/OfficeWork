package com.example.officework.View.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.CostomViewHolder> {


    @NonNull
    @Override
    public adapter.CostomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.CostomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CostomViewHolder extends RecyclerView.ViewHolder {
        public CostomViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

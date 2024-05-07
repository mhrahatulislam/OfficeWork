package com.example.officework.View.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.officework.R;
import com.example.officework.Service.Model.BusinessType;

import java.util.List;

public class BusinessAdapter extends RecyclerView.Adapter<BusinessAdapter.BusinessVH> {

    private List<BusinessType> businessTypeList;

    @NonNull
    @Override
    public BusinessVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_business_item, parent, false);
        return new BusinessVH(layoutView);
    }


    public void setBusinessAdapter(List<BusinessType> list) {
        this.businessTypeList = list;
    }

    @Override
    public void onBindViewHolder(@NonNull BusinessVH holder, int position) {
        BusinessType refMode = businessTypeList.get(position);
        holder.tvBusineesName.setText(refMode.toString());


    }

    @Override
    public int getItemCount() {
        return businessTypeList.size();
    }

    static class BusinessVH extends RecyclerView.ViewHolder {

        TextView tvBusineesName;

        public BusinessVH(@NonNull View itemView) {
            super(itemView);
            tvBusineesName = itemView.findViewById(R.id.tv_business_name);
        }
    }
}

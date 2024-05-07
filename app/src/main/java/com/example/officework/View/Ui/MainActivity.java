package com.example.officework.View.Ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.officework.R;
import com.example.officework.Service.Model.BusinessType;
import com.example.officework.Service.Network.ApiInterface;
import com.example.officework.Service.Network.RetrofitInstant;
import com.example.officework.View.adapter.BusinessAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ApiInterface apiInterface;
    BusinessAdapter adapterBusiness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rclMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        adapterBusiness=new BusinessAdapter();

        recyclerView.setAdapter(adapterBusiness);

        apiInterface= RetrofitInstant.getRetrofit().create(ApiInterface.class);
        fatchData();
    }

    private void fatchData() {

        apiInterface.getPost().enqueue(new Callback<BusinessType>() {
            @Override
            public void onResponse(Call<BusinessType> call, Response<BusinessType> response) {

            }

            @Override
            public void onFailure(Call<BusinessType> call, Throwable t) {

            }
        });



    }
}

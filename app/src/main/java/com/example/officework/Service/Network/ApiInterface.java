package com.example.officework.Service.Network;

import com.example.officework.Service.Model.BusinessType;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("shop/service-type-list")
    Call<BusinessType> getPost();
}

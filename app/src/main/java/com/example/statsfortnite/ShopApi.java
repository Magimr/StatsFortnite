package com.example.statsfortnite;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ShopApi {

    @GET("store/get?language=en")
    Call<Shop> loadShop();
}

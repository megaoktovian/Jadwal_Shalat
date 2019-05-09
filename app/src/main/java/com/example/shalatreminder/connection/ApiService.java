package com.example.shalatreminder.connection;

import com.example.shalatreminder.model.SholatResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/v1/calendarByAddress")
    Call<SholatResponse> getSholat(@Query("address") String address, @Query("method") String method, @Query("month") String month,
                                   @Query("year") String year);

}

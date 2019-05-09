package com.example.shalatreminder.presenter;

import com.example.shalatreminder.connection.BaseApp;
import com.example.shalatreminder.model.update.UpdateResponse;
import com.example.shalatreminder.model.user.UserResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UpdatePresenter  {
    private UpdateView updateView;

    public UpdatePresenter(UpdateView updateView) {
        this.updateView = updateView;
    }
    public void GetUser(String token){
        BaseApp.loginService.getUser(token).enqueue(new Callback<List<UserResponse>>() {
            @Override
            public void onResponse(Call<List<UserResponse>> call, Response<List<UserResponse>> response) {
                if (response.isSuccessful()){
                    updateView.OnSuccess(response.body());
                }
                else
                {
                    updateView.OnError(response.message());
                }
            }

            @Override
            public void onFailure(Call<List<UserResponse>> call, Throwable t) {
                updateView.OnFailure(t.getMessage());
            }
        });
    }
    public void UpdateUser(String token, String nama){
        BaseApp.loginService.getUpdate(token, nama).enqueue(new Callback<UpdateResponse>() {
            @Override
            public void onResponse(Call<UpdateResponse> call, Response<UpdateResponse> response) {
                if (response.isSuccessful()){
                    updateView.OnUpdate(response.body());
                }
                else
                {
                    updateView.OnError(response.message());
                }
            }

            @Override
            public void onFailure(Call<UpdateResponse> call, Throwable t) {
                updateView.OnFailure(t.getMessage());
            }
        });
    }
}

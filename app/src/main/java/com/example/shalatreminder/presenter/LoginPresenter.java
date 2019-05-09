package com.example.shalatreminder.presenter;

import android.content.Context;

import com.example.shalatreminder.connection.BaseApp;
import com.example.shalatreminder.model.login.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginPresenter {
    private Context context;
    private LoginView loginView;

    public LoginPresenter(Context context, LoginView loginView) {
        this.context = context;
        this.loginView = loginView;
    }

    public void Login(String email, String Password){
        BaseApp.loginService.getLogin(email, Password).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()){
                    loginView.OnSuccess(response.body());
                }
                else {
                    loginView.OnError(response.message());
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                loginView.OnFailure(t.getMessage());
            }
        });
    }
}

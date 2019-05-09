package com.example.shalatreminder.presenter;

import android.content.Context;

import com.example.shalatreminder.SignUp;
import com.example.shalatreminder.connection.BaseApp;
import com.example.shalatreminder.model.login.LoginResponse;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpPresenter {
    private SignUpView signUpView;

    public SignUpPresenter(SignUpView signUpView) {
        this.signUpView = signUpView;
    }

    public void signUp(String username, String email, String password) {
        BaseApp.loginService.createUser(email, password, username).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.code()==200){
                    signUpView.setToast(response.message());
                }
                else
                    signUpView.onError(response.message());
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                    signUpView.onFailure(t.getMessage());
            }
        });
    }
}

package com.example.shalatreminder.presenter;

import com.example.shalatreminder.model.login.LoginResponse;

public interface LoginView {

    void OnSuccess(LoginResponse loginResponse);
    void OnError(String ErrorMessage);
    void OnFailure(String FailureMessage);
}

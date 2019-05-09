package com.example.shalatreminder.presenter;

import com.example.shalatreminder.model.signup.SignUpResponse;

public interface SignUpView {

    void getSuccess(SignUpResponse list);

    void setToast(String message);

    void onError(String errorMessage);

    void onFailure(String failureMessage);

}

package com.example.shalatreminder.presenter;

import com.example.shalatreminder.model.login.LoginResponse;
import com.example.shalatreminder.model.update.UpdateResponse;
import com.example.shalatreminder.model.user.UserResponse;

import org.json.JSONArray;

import java.util.List;

public interface UpdateView {
    void OnSuccess(List<UserResponse> userResponse);
    void OnError(String ErrorMessage);
    void OnFailure(String FailureMessage);
    void OnUpdate (UpdateResponse updateResponse);
}

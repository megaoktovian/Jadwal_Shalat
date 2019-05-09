package com.example.shalatreminder;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shalatreminder.model.update.UpdateResponse;
import com.example.shalatreminder.model.user.UserResponse;
import com.example.shalatreminder.presenter.UpdatePresenter;
import com.example.shalatreminder.presenter.UpdateView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment implements UpdateView {

 UpdatePresenter updatePresenter;
 Button button;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    TextView tvNama, tvEmail;
    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = view.findViewById(R.id.update);
        sharedPreferences = getContext().getSharedPreferences("loginref", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        tvNama = view.findViewById(R.id.nama);
        tvEmail = view.findViewById(R.id.emaill);
        updatePresenter = new UpdatePresenter(this);
        updatePresenter.GetUser(sharedPreferences.getString("token",""));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),UpdateActivity.class));
            }
        });
    }

    @Override
    public void OnSuccess(List<UserResponse> userResponse) {

            tvNama.setText(userResponse.get(0).getName());
            tvEmail.setText(userResponse.get(0).getEmail());

    }

    @Override
    public void OnError(String ErrorMessage) {
        Toast.makeText(getContext(),ErrorMessage,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnFailure(String FailureMessage) {
        Toast.makeText(getContext(),FailureMessage,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnUpdate(UpdateResponse updateResponse) {

    }
}

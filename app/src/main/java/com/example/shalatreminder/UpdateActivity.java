package com.example.shalatreminder;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shalatreminder.model.update.UpdateResponse;
import com.example.shalatreminder.model.user.UserResponse;
import com.example.shalatreminder.presenter.UpdatePresenter;
import com.example.shalatreminder.presenter.UpdateView;

import org.json.JSONArray;

import java.util.List;

public class UpdateActivity extends AppCompatActivity implements UpdateView {
private EditText etNama;
private Button btnUpdate;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    UpdatePresenter updatePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        etNama = findViewById(R.id.updatename);
        btnUpdate = findViewById(R.id.updatebtn);
        sharedPreferences = getSharedPreferences("loginref", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        updatePresenter = new UpdatePresenter(this);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updatePresenter.UpdateUser(sharedPreferences.getString("token", ""),
                        etNama.getText().toString());
            }
        });
    }

    @Override
    public void OnSuccess(List<UserResponse> userResponse) {


    }
    @Override
    public void OnError(String ErrorMessage) {
        Toast.makeText(this, ErrorMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void OnFailure(String FailureMessage) {
        Toast.makeText(this, FailureMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void OnUpdate(UpdateResponse updateResponse) {
        Toast.makeText(this,"Data telah diupdate", Toast.LENGTH_LONG).show();
        startActivity(new Intent(getApplicationContext(),Main2Activity.class));
    }
}

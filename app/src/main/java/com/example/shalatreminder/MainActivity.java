package com.example.shalatreminder;
import android.content.Intent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shalatreminder.R;
import com.example.shalatreminder.model.login.LoginResponse;
import com.example.shalatreminder.presenter.LoginPresenter;
import com.example.shalatreminder.presenter.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {
    EditText email, pass;
    Button login, signup;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Boolean savelogin;
    LoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.et_email);
        pass = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.btn_login);
        signup = (Button) findViewById(R.id.btn_signup);
        loginPresenter = new LoginPresenter(getApplicationContext(),this);
        sharedPreferences = getSharedPreferences("loginref", MODE_PRIVATE);
        editor = sharedPreferences.edit();



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        savelogin = sharedPreferences.getBoolean("savelogin", false);
        if (savelogin == true) {
            email.setText(sharedPreferences.getString("email", null));
            pass.setText(sharedPreferences.getString("password", null));
            Intent intent = new Intent(MainActivity.this, com.example.shalatreminder.Main2Activity.class);
            startActivity(intent);
        }

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.shalatreminder.SignUp.class);
                startActivity(intent);
            }
        });
    }


    public void login() {
        String usrname = email.getText().toString();
        String passwoord = pass.getText().toString();
            loginPresenter.Login(usrname,passwoord);

    }

    @Override
    public void OnSuccess(LoginResponse loginResponse) {
        Toast.makeText(this, "LOGIN BERHASIL!", Toast.LENGTH_LONG).show();
        editor.putBoolean("savelogin", true);
        editor.putString("token",loginResponse.getToken());
        editor.commit();
        startActivity(new Intent(getApplicationContext(),Main2Activity.class));
    }

    @Override
    public void OnError(String ErrorMessage) {
        Toast.makeText(this, ErrorMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void OnFailure(String FailureMessage) {
        Toast.makeText(this, FailureMessage, Toast.LENGTH_LONG).show();
    }
}
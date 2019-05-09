package com.example.shalatreminder;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shalatreminder.model.signup.SignUpResponse;
import com.example.shalatreminder.presenter.SignUpPresenter;
import com.example.shalatreminder.presenter.SignUpView;

public class SignUp extends AppCompatActivity implements SignUpView {
    EditText username, email, password;
    Button signupp;
    SignUp signUp;
    String st_user, st_pass, st_email;
    SignUpPresenter signUpPresenter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.sign_up);
            username = (EditText) findViewById(R.id.et_username);
            email = (EditText) findViewById(R.id.et_email);
            password = (EditText) findViewById(R.id.et_password);
            signupp = (Button) findViewById(R.id.btn_signup);
            signUpPresenter = new SignUpPresenter(this);
            signupp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    st_email = email.getText().toString();
                    st_pass = password.getText().toString();
                    st_user = username.getText().toString();
                    signUpPresenter.signUp(st_user,st_email,st_pass);
                }
            });
    }

    @Override
    public void getSuccess(SignUpResponse list) {

    }

    @Override
    public void setToast(String message) {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,MainActivity.class));
    }

    @Override
    public void onError(String errorMessage) {
        Toast.makeText(getApplicationContext(),errorMessage,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String failureMessage) {
        Toast.makeText(getApplicationContext(),failureMessage,Toast.LENGTH_SHORT).show();
    }
}

package com.example.shalatreminder.model.login;

import com.google.gson.annotations.SerializedName;
public class LoginResponse{

	@SerializedName("auth")
	private boolean auth;

	@SerializedName("token")
	private String token;

	public void setAuth(boolean auth){
		this.auth = auth;
	}

	public boolean isAuth(){
		return auth;
	}

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}

	@Override
 	public String toString(){
		return 
			"LoginResponse{" + 
			"auth = '" + auth + '\'' + 
			",token = '" + token + '\'' + 
			"}";
		}
}
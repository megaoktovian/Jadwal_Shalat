package com.example.shalatreminder.model;


import com.google.gson.annotations.SerializedName;


public class Params{

	@SerializedName("Isha")
	private int isha;

	@SerializedName("Fajr")
	private int fajr;

	public void setIsha(int isha){
		this.isha = isha;
	}

	public int getIsha(){
		return isha;
	}

	public void setFajr(int fajr){
		this.fajr = fajr;
	}

	public int getFajr(){
		return fajr;
	}

	@Override
 	public String toString(){
		return 
			"Params{" + 
			"isha = '" + isha + '\'' + 
			",fajr = '" + fajr + '\'' + 
			"}";
		}
}
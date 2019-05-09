package com.example.shalatreminder.model;

import com.google.gson.annotations.SerializedName;

public class Weekday{

	@SerializedName("en")
	private String en;

	@SerializedName("ar")
	private String ar;

	public void setEn(String en){
		this.en = en;
	}

	public String getEn(){
		return en;
	}

	public void setAr(String ar){
		this.ar = ar;
	}

	public String getAr(){
		return ar;
	}

	@Override
 	public String toString(){
		return 
			"Weekday{" + 
			"en = '" + en + '\'' + 
			",ar = '" + ar + '\'' + 
			"}";
		}
}
package com.example.shalatreminder.model;

import com.google.gson.annotations.SerializedName;

public class Date{

	@SerializedName("readable")
	private String readable;

	@SerializedName("hijri")
	private Hijri hijri;

	@SerializedName("gregorian")
	private Gregorian gregorian;

	@SerializedName("timestamp")
	private String timestamp;

	public void setReadable(String readable){
		this.readable = readable;
	}

	public String getReadable(){
		return readable;
	}

	public void setHijri(Hijri hijri){
		this.hijri = hijri;
	}

	public Hijri getHijri(){
		return hijri;
	}

	public void setGregorian(Gregorian gregorian){
		this.gregorian = gregorian;
	}

	public Gregorian getGregorian(){
		return gregorian;
	}

	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}

	public String getTimestamp(){
		return timestamp;
	}

	@Override
 	public String toString(){
		return 
			"Date{" + 
			"readable = '" + readable + '\'' + 
			",hijri = '" + hijri + '\'' + 
			",gregorian = '" + gregorian + '\'' + 
			",timestamp = '" + timestamp + '\'' + 
			"}";
		}
}
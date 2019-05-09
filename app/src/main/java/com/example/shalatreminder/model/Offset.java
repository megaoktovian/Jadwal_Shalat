package com.example.shalatreminder.model;
import com.google.gson.annotations.SerializedName;

public class Offset{

	@SerializedName("Sunset")
	private int sunset;

	@SerializedName("Asr")
	private int asr;

	@SerializedName("Isha")
	private int isha;

	@SerializedName("Fajr")
	private int fajr;

	@SerializedName("Dhuhr")
	private int dhuhr;

	@SerializedName("Maghrib")
	private int maghrib;

	@SerializedName("Sunrise")
	private int sunrise;

	@SerializedName("Midnight")
	private int midnight;

	@SerializedName("Imsak")
	private int imsak;

	public void setSunset(int sunset){
		this.sunset = sunset;
	}

	public int getSunset(){
		return sunset;
	}

	public void setAsr(int asr){
		this.asr = asr;
	}

	public int getAsr(){
		return asr;
	}

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

	public void setDhuhr(int dhuhr){
		this.dhuhr = dhuhr;
	}

	public int getDhuhr(){
		return dhuhr;
	}

	public void setMaghrib(int maghrib){
		this.maghrib = maghrib;
	}

	public int getMaghrib(){
		return maghrib;
	}

	public void setSunrise(int sunrise){
		this.sunrise = sunrise;
	}

	public int getSunrise(){
		return sunrise;
	}

	public void setMidnight(int midnight){
		this.midnight = midnight;
	}

	public int getMidnight(){
		return midnight;
	}

	public void setImsak(int imsak){
		this.imsak = imsak;
	}

	public int getImsak(){
		return imsak;
	}

	@Override
 	public String toString(){
		return 
			"Offset{" + 
			"sunset = '" + sunset + '\'' + 
			",asr = '" + asr + '\'' + 
			",isha = '" + isha + '\'' + 
			",fajr = '" + fajr + '\'' + 
			",dhuhr = '" + dhuhr + '\'' + 
			",maghrib = '" + maghrib + '\'' + 
			",sunrise = '" + sunrise + '\'' + 
			",midnight = '" + midnight + '\'' + 
			",imsak = '" + imsak + '\'' + 
			"}";
		}
}
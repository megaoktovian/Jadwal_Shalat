package com.example.shalatreminder.model;

import com.google.gson.annotations.SerializedName;


public class Meta{

	@SerializedName("method")
	private Method method;

	@SerializedName("offset")
	private Offset offset;

	@SerializedName("school")
	private String school;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("midnightMode")
	private String midnightMode;

	@SerializedName("latitude")
	private double latitude;

	@SerializedName("longitude")
	private double longitude;

	@SerializedName("latitudeAdjustmentMethod")
	private String latitudeAdjustmentMethod;

	public void setMethod(Method method){
		this.method = method;
	}

	public Method getMethod(){
		return method;
	}

	public void setOffset(Offset offset){
		this.offset = offset;
	}

	public Offset getOffset(){
		return offset;
	}

	public void setSchool(String school){
		this.school = school;
	}

	public String getSchool(){
		return school;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setMidnightMode(String midnightMode){
		this.midnightMode = midnightMode;
	}

	public String getMidnightMode(){
		return midnightMode;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}

	public void setLatitudeAdjustmentMethod(String latitudeAdjustmentMethod){
		this.latitudeAdjustmentMethod = latitudeAdjustmentMethod;
	}

	public String getLatitudeAdjustmentMethod(){
		return latitudeAdjustmentMethod;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"method = '" + method + '\'' + 
			",offset = '" + offset + '\'' + 
			",school = '" + school + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",midnightMode = '" + midnightMode + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",latitudeAdjustmentMethod = '" + latitudeAdjustmentMethod + '\'' + 
			"}";
		}
}
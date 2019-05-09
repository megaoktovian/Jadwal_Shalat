package com.example.shalatreminder.model;


import com.google.gson.annotations.SerializedName;

public class Gregorian{

	@SerializedName("date")
	private String date;

	@SerializedName("month")
	private Month month;

	@SerializedName("year")
	private String year;

	@SerializedName("format")
	private String format;

	@SerializedName("weekday")
	private Weekday weekday;

	@SerializedName("designation")
	private Designation designation;

	@SerializedName("day")
	private String day;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setMonth(Month month){
		this.month = month;
	}

	public Month getMonth(){
		return month;
	}

	public void setYear(String year){
		this.year = year;
	}

	public String getYear(){
		return year;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
	}

	public void setWeekday(Weekday weekday){
		this.weekday = weekday;
	}

	public Weekday getWeekday(){
		return weekday;
	}

	public void setDesignation(Designation designation){
		this.designation = designation;
	}

	public Designation getDesignation(){
		return designation;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	@Override
 	public String toString(){
		return 
			"Gregorian{" + 
			"date = '" + date + '\'' + 
			",month = '" + month + '\'' + 
			",year = '" + year + '\'' + 
			",format = '" + format + '\'' + 
			",weekday = '" + weekday + '\'' + 
			",designation = '" + designation + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}
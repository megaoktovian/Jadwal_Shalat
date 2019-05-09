package com.example.shalatreminder.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hijri{

	@SerializedName("date")
	private String date;

	@SerializedName("month")
	private Month month;

	@SerializedName("holidays")
	private List<Object> holidays;

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

	public void setHolidays(List<Object> holidays){
		this.holidays = holidays;
	}

	public List<Object> getHolidays(){
		return holidays;
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
			"Hijri{" + 
			"date = '" + date + '\'' + 
			",month = '" + month + '\'' + 
			",holidays = '" + holidays + '\'' + 
			",year = '" + year + '\'' + 
			",format = '" + format + '\'' + 
			",weekday = '" + weekday + '\'' + 
			",designation = '" + designation + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}
package com.example.shalatreminder.model;

import com.google.gson.annotations.SerializedName;


public class Method{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("params")
	private Params params;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setParams(Params params){
		this.params = params;
	}

	public Params getParams(){
		return params;
	}

	@Override
 	public String toString(){
		return 
			"Method{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",params = '" + params + '\'' + 
			"}";
		}
}
package com.example.shalatreminder.model.update;

import com.google.gson.annotations.SerializedName;

public class PhotoProfile{

	@SerializedName("photo_url")
	private String photoUrl;

	@SerializedName("id_photo")
	private String idPhoto;

	public void setPhotoUrl(String photoUrl){
		this.photoUrl = photoUrl;
	}

	public String getPhotoUrl(){
		return photoUrl;
	}

	public void setIdPhoto(String idPhoto){
		this.idPhoto = idPhoto;
	}

	public String getIdPhoto(){
		return idPhoto;
	}

	@Override
 	public String toString(){
		return 
			"PhotoProfile{" + 
			"photo_url = '" + photoUrl + '\'' + 
			",id_photo = '" + idPhoto + '\'' + 
			"}";
		}
}
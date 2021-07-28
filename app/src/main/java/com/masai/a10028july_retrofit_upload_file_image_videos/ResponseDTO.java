package com.masai.a10028july_retrofit_upload_file_image_videos;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseDTO implements Serializable {

	@SerializedName("data")
	private DataDTO data;

	@SerializedName("success")
	private boolean success;

	@SerializedName("status")
	private int status;

	public DataDTO getData(){
		return data;
	}

	public boolean isSuccess(){
		return success;
	}

	public int getStatus(){
		return status;
	}
}
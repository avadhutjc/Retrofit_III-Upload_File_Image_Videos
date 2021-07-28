package com.masai.a10028july_retrofit_upload_file_image_videos;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    @Headers("Authorization: Client-ID f05fbf0d960cb03")
    @POST("3/image")
    //response getting class {..}

    //you are sending data part by part
    @Multipart
    Call<ResponseDTO> uploadImage(
            @Part MultipartBody.Part file, //you are sending image here
            @Part("title") String title  //you are sending title from postman
    );
}

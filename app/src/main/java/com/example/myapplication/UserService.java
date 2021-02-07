package com.example.myapplication;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.Call;
public interface UserService {
    @POST("authenticate/")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);
    @POST("users/")
    Call<RegisterResponse> registerUsers(@Body RegisterRequest registerRequest);

}

package com.example.sid.websiddu;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("projects?callback=")
    Call<List<Project>> getProjects();
}

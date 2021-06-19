package com.example.example.retrofit;

import com.example.example.model.Measurement;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MeasurementApi {

    @GET("/mesurement/")
    Single<List<Measurement>> getAllNote(@Header("authorization") String auth);

    @POST("/mesurement/")
    Completable addNewNode(@Header("authorization") String auth, @Body Measurement note);

    @DELETE("/mesurement/{id}/")
    Completable deleteNode(@Header("authorization") String auth, @Path("id") int id);

}

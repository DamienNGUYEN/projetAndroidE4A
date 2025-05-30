package com.example.projetandroide4a.model.service

import com.example.projetandroide4a.model.data.TvShows
import retrofit2.http.GET
import retrofit2.http.Query

interface TvShowApi {

    @GET("most-popular")
    suspend fun getTvShowResponse(@Query("page") page: Int = 1): TvShows

}
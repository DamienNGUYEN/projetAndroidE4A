package com.example.projetandroide4a.model.service

import com.example.projetandroide4a.model.data.TvShow
import retrofit2.http.GET

interface TvShowApi {

    @GET("TvShows")
    suspend fun getTvShowResponse(): List<TvShow>

}
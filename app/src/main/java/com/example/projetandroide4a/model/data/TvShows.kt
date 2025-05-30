package com.example.projetandroide4a.model.data


import com.google.gson.annotations.SerializedName

data class TvShows(
    @SerializedName("page")
    val page: Int,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("total")
    val total: Int,
    @SerializedName("tv_shows")
    val tvShows: List<TvShow>
)
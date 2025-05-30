package com.example.projetandroide4a.model.repository

import android.util.Log
import com.example.projetandroide4a.model.data.TvShow
import com.example.projetandroide4a.model.service.TvShowApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TvShowRepository @Inject constructor(
    private val tvShowApi: TvShowApi
) {

    fun getTvShowsFlow(): Flow<List<TvShow>> = flow {
        emit(tvShowApi.getTvShowResponse().tvShows)
    }.catch { e ->
        Log.e("TvShowRepository", "Error fetching TvShows", e)
        emit(emptyList())
    }
}
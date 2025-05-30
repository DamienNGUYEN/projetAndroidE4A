package com.example.projetandroide4a.depInj

import com.example.projetandroide4a.model.repository.TvShowRepository
import com.example.projetandroide4a.model.service.TvShowApi
import com.example.projetandroide4a.viewmodel.TvShowViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TvShowModule {

    @Provides
    @Singleton
    fun provideTvShowApi() : TvShowApi{
        return Retrofit.Builder()
            .baseUrl("https://www.episodate.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TvShowApi::class.java)
    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowApi: TvShowApi) : TvShowRepository{
        return TvShowRepository(tvShowApi)
    }

    @Provides
    @Singleton
    fun  provideTvShowViewModel(
        tvShowRepository: TvShowRepository) : TvShowViewModel{
        return TvShowViewModel(tvShowRepository)
    }

}


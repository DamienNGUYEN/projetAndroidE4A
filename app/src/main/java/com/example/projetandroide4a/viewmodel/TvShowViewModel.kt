package com.example.projetandroide4a.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projetandroide4a.model.data.TvShow
import com.example.projetandroide4a.model.repository.TvShowRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TvShowViewModel @Inject constructor(
    private val tvShowRepository: TvShowRepository
) : ViewModel() {
    private val _tvShows = MutableStateFlow<List<TvShow>>(emptyList())
    val tvShows : StateFlow<List<TvShow>> = _tvShows

    init {
        getAllTvShows()
    }

    private fun getAllTvShows() = viewModelScope.launch(Dispatchers.IO) {
        tvShowRepository.getTvShowsFlow().collectLatest {
            _tvShows.value = it
        }
    }
}
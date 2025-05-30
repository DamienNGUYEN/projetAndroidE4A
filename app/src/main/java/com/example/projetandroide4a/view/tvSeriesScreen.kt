package com.example.projetandroide4a.view


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.projetandroide4a.viewmodel.TvShowViewModel

@Composable
fun TvSeriesScreen(
    modifier: Modifier = Modifier,
    tvShowViewModel: TvShowViewModel = hiltViewModel()
) {

    val tvShowList = tvShowViewModel.tvShows.collectAsState()

    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = Color.Black,
        topBar = {
            TopBar()
        }
    ) { innerPadding ->
        if (tvShowList.value.isEmpty()){
            TvShowRow()
        }else{
            LazyVerticalGrid(
                modifier = Modifier.fillMaxSize().padding(innerPadding),
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(tvShowList.value) { show ->
                    TvShowCard(tvShow = show)
                }
            }
        }
    }
}
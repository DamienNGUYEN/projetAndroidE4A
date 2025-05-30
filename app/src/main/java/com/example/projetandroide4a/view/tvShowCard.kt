package com.example.projetandroide4a.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.projetandroide4a.model.data.TvShow

import androidx.compose.ui.tooling.preview.Preview
import com.example.projetandroide4a.viewmodel.TvShowViewModel

@Composable
fun tvShowCard(tvShow: TvShow) {
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ){
        Column (
            modifier = Modifier.fillMaxSize()
        ) {
            AsyncImage(
                model = tvShow.imageThumbnailPath,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(Color.White)
            )

            Text(
                text = tvShow.name,
                color = Color.White,
                modifier = Modifier.padding(
                    vertical = 10.dp,
                    horizontal = 10.dp
                )
            )

        }
    }
}
package com.example.projetandroide4a.view
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun TvSeriesScreen(
    modifier: Modifier = Modifier
) {

    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = Color.Black,
        topBar = {
            TopBar()
        }
    ) { innerPadding ->
        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(10){ item ->
                Text(text = "Item: $item", color = Color.White)
            }
        }
    }
}
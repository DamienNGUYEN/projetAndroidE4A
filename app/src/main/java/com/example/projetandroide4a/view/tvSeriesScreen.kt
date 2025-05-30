package com.example.projetandroide4a.view
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


data class TvSeries(
    val id: Int,
    val title: String,
    val imageUrl: String? = null // Nullable pour le moment
)

@Preview
@Composable
fun TvSeriesScreen(
    modifier: Modifier = Modifier
) {
    // Données de test à remplacer par les valeurs obtenues via l'API
    val tvSeriesList = listOf(
        TvSeries(1, "Breaking Bad"),
        TvSeries(2, "Stranger Things"),
        TvSeries(3, "The Crown"),
        TvSeries(4, "Game of Thrones"),
        TvSeries(5, "Friends"),
        TvSeries(6, "The Office"),
        TvSeries(7, "Lost"),
        TvSeries(8, "House of Cards"),
        TvSeries(9, "Narcos"),
        TvSeries(10, "Black Mirror")
    )

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
            items(tvSeriesList) { series ->
                TvSeriesCard(series = series)
            }
        }
    }
}

@Composable
fun TvSeriesCard(
    series: TvSeries,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp),
        colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Placeholder pour l'image
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                if (series.imageUrl != null) {
                    // Une fois l'API connectée, remplacer par :
                    // AsyncImage(
                    //     model = series.imageUrl,
                    //     contentDescription = series.title,
                    //     modifier = Modifier.fillMaxSize(),
                    //     contentScale = ContentScale.Crop
                    // )
                    Text(
                        text = "Image",
                        color = Color.White,
                        fontSize = 12.sp
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                }
            }

            // Titre de la série
            Text(
                text = series.title,
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(8.dp),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
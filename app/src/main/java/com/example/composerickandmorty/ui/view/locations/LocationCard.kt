package com.example.composerickandmorty.ui.view.locations

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composerickandmorty.domain.model.location.Location

@Composable
fun LocationCard(
    location: Location
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(10.dp),
        elevation = 5.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(10.dp)
        ) {
            Text(
                modifier = Modifier,
                text = location.locationName,
                style = MaterialTheme.typography.h4.copy(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
            )
            Text(text = location.locationType)
            Text(text = location.locationDimension)
        }
    }
}
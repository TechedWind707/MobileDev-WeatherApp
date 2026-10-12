package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R
import com.example.weatherapp.models.Day
import java.time.LocalDate

@Composable
fun Current() {

    val day = Day(
        date = LocalDate.now(),
        temperature = 25,
        description = "Sunny",
        feelsLike = 27,
        maxWindSpeed = 10,
        currentWindDirection = "SW",
        humidity = 60,
        resourceId = R.drawable.clear_day,
        highTemp = 28,
        lowTemp = 22,
        chanceOfRain = 10,
        amountOfRain = null
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(PaddingValues(16.dp))
    ) {

        Image(
            modifier = Modifier.height(200.dp),
            painter = painterResource(id = day.resourceId),
            contentDescription = day.date.toString()
        )

        Text(
            text = day.description,
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text("Temperature:")

        Text(day.temperature.toString() + "°C")
        Text("Feels like:")
        Text(day.feelsLike.toString() + "°C")
        Text("Wind: ")
        Text("${day.maxWindSpeed} kph ${day.currentWindDirection}")
    }
}
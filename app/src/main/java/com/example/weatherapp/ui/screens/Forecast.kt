package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.unit.dp

@Composable
fun Forecast() {

    val listDay = listOf(
        Day(
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
        ),
        Day(
            date = LocalDate.now().plusDays(1),
            temperature = 22,
            description = "Cloudy",
            feelsLike = 23,
            maxWindSpeed = 8,
            currentWindDirection = "W",
            humidity = 70,
            resourceId = R.drawable.cloudy,
            highTemp = 24,
            lowTemp = 20,
            chanceOfRain = 20,
            amountOfRain = null
        ),
        Day(
            date = LocalDate.now().plusDays(2),
            temperature = 20,
            description = "Rainy",
            feelsLike = 19,
            maxWindSpeed = 12,
            currentWindDirection = "NW",
            humidity = 80,
            resourceId = R.drawable.rain,
            highTemp = 21,
            lowTemp = 18,
            chanceOfRain = 60,
            amountOfRain = 5
        ),
        Day(
            date = LocalDate.now().plusDays(3),
            temperature = 18,
            description = "Stormy",
            feelsLike = 17,
            maxWindSpeed = 15,
            currentWindDirection = "N",
            humidity = 90,
            resourceId = R.drawable.thunderstorms_rain,
            highTemp = 19,
            lowTemp = 16,
            chanceOfRain = 80,
            amountOfRain = 10
        ),
        Day(
            date = LocalDate.now().plusDays(4),
            temperature = 21,
            description = "Partly Cloudy",
            feelsLike = 22,
            maxWindSpeed = 9,
            currentWindDirection = "E",
            humidity = 65,
            resourceId = R.drawable.partly_cloudy_day,
            highTemp = 23,
            lowTemp = 19,
            chanceOfRain = 15,
            amountOfRain = null
        ),
        Day(
            date = LocalDate.now().plusDays(5),
            temperature = 24,
            description = "Sunny",
            feelsLike = 25,
            maxWindSpeed = 7,
            currentWindDirection = "SE",
            humidity = 55,
            resourceId = R.drawable.clear_day,
            highTemp = 26,
            lowTemp = 22,
            chanceOfRain = 5,
            amountOfRain = null
        ),
        Day(
            date = LocalDate.now().plusDays(6),
            temperature = 23,
            description = "Drizzle",
            feelsLike = 24,
            maxWindSpeed = 8,
            currentWindDirection = "SW",
            humidity = 60,
            resourceId = R.drawable.drizzle,
            highTemp = 25,
            lowTemp = 21,
            chanceOfRain = 10,
            amountOfRain = null
        )
    )

    LazyColumn{
        items(listDay) { day ->
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(day.date.toString())
                Image(
                    modifier = Modifier.height(100.dp),
                    painter = painterResource(id = day.resourceId),
                    contentDescription = day.date.toString()
                )

                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Text(day.highTemp.toString() + "°C High")
                    Text(day.lowTemp.toString() + "°C Low")
                }

                Column(
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(day.description)
                    Text("Feels like: " + day.feelsLike.toString() + "°C")
                    Text("Current temperature: " + day.temperature.toString() + "°C")
                    Text("Wind Direction: " + day.currentWindDirection)
                    Text("Wind Speed: " + day.maxWindSpeed.toString() + " kph")
                    Text("Humidity: " + day.humidity.toString() + "%")
                    Text(day.chanceOfRain.toString() + "% Chance of Rain")
                    Text(day.maxWindSpeed.toString() + " kph Wind")
                    Text(day.humidity.toString() + "% Humidity")
                }
            }

            HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)
        }
    }
}
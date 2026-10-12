package com.example.weatherapp.models

import java.time.LocalDate

data class Day(
    val date: LocalDate,
    val temperature: Int,
    val description: String,
    val feelsLike: Int,
    val maxWindSpeed: Int,
    val currentWindDirection: String,
    val humidity: Int,
    val resourceId: Int,
    val highTemp: Int,
    val lowTemp: Int,
    val chanceOfRain: Int,
    val amountOfRain: Int? = null,
)
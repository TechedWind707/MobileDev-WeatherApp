package com.example.weatherapp.models

data class Day(
    val date: String,
    val currentTemperature: Int,
    val description: String,
    val feelsLike: Int,
    val maxWindSpeed: Int,
    val currentWindDirection: String,
    val humidity: Int,
    val resourceId: Int,
    val highTemp: Int,
    val lowTemp: Int,
    val chanceOfRain: Int,
    val amountOfRain: Int,
)
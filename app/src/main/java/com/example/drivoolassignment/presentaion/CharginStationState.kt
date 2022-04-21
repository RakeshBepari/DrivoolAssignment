package com.example.drivoolassignment.presentaion

import com.example.drivoolassignment.models.ChargingStationsItem

data class ChargingStationsState(
    val chargingStations: List<ChargingStationsItem> = emptyList(),
    val loading: Boolean = false,
    val error : String = "Something went Wrong"
)

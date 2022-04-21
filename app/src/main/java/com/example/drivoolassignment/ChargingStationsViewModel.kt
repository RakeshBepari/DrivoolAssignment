package com.example.drivoolassignment

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.drivoolassignment.presentaion.ChargingStationsState
import com.example.drivoolassignment.repository.ChargingStationRepository

class ChargingStationsViewModel(
) : ViewModel() {

    private val repository:ChargingStationRepository = ChargingStationRepository
    var chargingStationsState by mutableStateOf(ChargingStationsState())

    init {
        getChargingStations()
    }

    private fun getChargingStations() {
        chargingStationsState = chargingStationsState.copy(
            chargingStations = repository.getChargingStations()
        )
    }
}
package com.example.drivoolassignment.repository

import android.util.Log
import com.example.drivoolassignment.models.ChargingStationsItem
import com.example.drivoolassignment.util.ProvidesChargingStations

object ChargingStationRepository {

    fun getChargingStations(): List<ChargingStationsItem> {
        val providesChargingStations = ProvidesChargingStations()
        val chargingStationList = providesChargingStations.getchargingStations()
        return chargingStationList.toList()
    }
}
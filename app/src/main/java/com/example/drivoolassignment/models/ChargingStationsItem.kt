package com.example.drivoolassignment.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ChargingStationsItem(
    val chargers: List<Charger>,
    val id: Int,
    val name: String,
    val openingTimes: String,
    val place: String,
    val vehicleTypes: List<String>
):Parcelable
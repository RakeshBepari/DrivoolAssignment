package com.example.drivoolassignment.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Charger(
    val available: Boolean,
    val id: String,
    val type: String,
    val vehicle: String
):Parcelable
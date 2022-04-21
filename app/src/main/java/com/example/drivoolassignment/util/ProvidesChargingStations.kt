package com.example.drivoolassignment.util

import android.content.res.AssetManager
import android.content.res.Resources
import android.util.Log
import com.example.drivoolassignment.models.ChargingStations
import com.google.gson.Gson
import java.io.IOException


class ProvidesChargingStations {

    private val gson = Gson()
    lateinit var bangaloreChargingStations: ChargingStations
//    lateinit var string:String


    private val data ="""[
  {
    "id": 555,
    "name": "BESCOM Charging Station",
    "place": "16, 17th Main Rd, Aicobo Nagar, 1st Stage, BTM 1st Stage",
    "openingTimes": "06:00AM-11:00PM",
    "vehicleTypes": [
      "Car",
      "Bus",
      "Auto",
      "Bike",
      "Scooty"
    ],
    "chargers": [
      {
        "id": "ch1",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Car"
      },
      {
        "id": "ch2",
        "available": true,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch3",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch4",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Bus"
      },
      {
        "id": "ch5",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Auto"
      },
      {
        "id": "ch6",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Bike"
      }
    ]
  },
  {
    "id": 155,
    "name": "Electric Vehicle Charging Station",
    "place": "MM Rd, Byatarayanapura, Banashankari Stage I, Bapuji Nagar",
    "openingTimes": "00:00AM-11:59PM",
    "vehicleTypes": [
      "Car",
      "Bus"
    ],
    "chargers": [
      {
        "id": "ch1",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Car"
      },
      {
        "id": "ch2",
        "available": true,
        "type": "DC Charger",
        "vehicle": "Car"
      },
      {
        "id": "ch3",
        "available": true,
        "type": "DC Charger",
        "vehicle": "Bus"
      },
      {
        "id": "ch4",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Bus"
      }
    ]
  },
  {
    "id": 555,
    "name": "BESCOM Charging Station",
    "place": "16,17th Mainroad",
    "openingTimes": "06:00AM-11:00PM",
    "vehicleTypes": [
      "Car",
      "Bus",
      "Auto",
      "Bike",
      "Scooty"
    ],
    "chargers": [
      {
        "id": "ch1",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Car"
      },
      {
        "id": "ch2",
        "available": true,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch3",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch4",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Bus"
      },
      {
        "id": "ch5",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Auto"
      },
      {
        "id": "ch6",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Bike"
      }
    ]
  },
  {
    "id": 555,
    "name": "BESCOM Charging Station",
    "place": "16,17th Mainroad",
    "openingTimes": "06:00AM-11:00PM",
    "vehicleTypes": [
      "Car",
      "Bus",
      "Auto",
      "Bike",
      "Scooty"
    ],
    "chargers": [
      {
        "id": "ch1",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Car"
      },
      {
        "id": "ch2",
        "available": true,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch3",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch4",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Bus"
      },
      {
        "id": "ch5",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Auto"
      },
      {
        "id": "ch6",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Bike"
      }
    ]
  },
  {
    "id": 555,
    "name": "BESCOM Charging Station",
    "place": "16,17th Mainroad",
    "openingTimes": "06:00AM-11:00PM",
    "vehicleTypes": [
      "Car",
      "Bus",
      "Auto",
      "Bike",
      "Scooty"
    ],
    "chargers": [
      {
        "id": "ch1",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Car"
      },
      {
        "id": "ch2",
        "available": true,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch3",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch4",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Bus"
      },
      {
        "id": "ch5",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Auto"
      },
      {
        "id": "ch6",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Bike"
      }
    ]
  },
  {
    "id": 555,
    "name": "BESCOM Charging Station",
    "place": "16,17th Mainroad",
    "openingTimes": "06:00AM-11:00PM",
    "vehicleTypes": [
      "Car",
      "Bus",
      "Auto",
      "Bike",
      "Scooty"
    ],
    "chargers": [
      {
        "id": "ch1",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Car"
      },
      {
        "id": "ch2",
        "available": true,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch3",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch4",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Bus"
      },
      {
        "id": "ch5",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Auto"
      },
      {
        "id": "ch6",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Bike"
      }
    ]
  },
  {
    "id": 555,
    "name": "BESCOM Charging Station",
    "place": "16,17th Mainroad",
    "openingTimes": "06:00AM-11:00PM",
    "vehicleTypes": [
      "Car",
      "Bus",
      "Auto",
      "Bike",
      "Scooty"
    ],
    "chargers": [
      {
        "id": "ch1",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Car"
      },
      {
        "id": "ch2",
        "available": true,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch3",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Scooty"
      },
      {
        "id": "ch4",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Bus"
      },
      {
        "id": "ch5",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Auto"
      },
      {
        "id": "ch6",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Bike"
      }
    ]
  }
]"""

    init {
        convertToDataClass()
    }

    private fun convertToDataClass(){
//        readfile()
        print(data)
        Log.d("DATA charging stations", data)
        bangaloreChargingStations = gson.fromJson(data, ChargingStations::class.java)
        Log.d("Afterjsonparsing", bangaloreChargingStations.toString())
    }

//    private fun readfile() {
//
//        try {
//            val assetManager = Resources.getSystem().assets
//            string = assetManager.readAssetsFile("file:///android_asset/ChargingStations.json")
//            Log.d("ProvidesStations",string)
//        } catch (e: IOException) {
//            e.printStackTrace()
//        }
//    }


//    fun AssetManager.readAssetsFile(fileName : String): String = open(fileName).bufferedReader().use{it.readText()}


    fun getchargingStations() = bangaloreChargingStations
}
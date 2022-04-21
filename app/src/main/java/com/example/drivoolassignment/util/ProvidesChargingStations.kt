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
    "id": 255,
    "name": "SemaConnect Charging Station",
    "place": "123, Block 4, 50 Feet Main Rd, Ganapathi Nagar",
    "openingTimes": "06:00AM-10:00PM",
    "vehicleTypes": [
      "Car",
      "Bike",
      "Scooty"
    ],
    "chargers": [
      {
        "id": "ch1",
        "available": false,
        "type": "AC Charger",
        "vehicle": "Car"
      },
      {
        "id": "ch2",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Bike"
      },
      {
        "id": "ch3",
        "available": true,
        "type": "DC Charger",
        "vehicle": "Scooty"
      }
    ]
  },
  {
    "id": 585,
    "name": "Kazam Charging Station",
    "place": "WH8V+C78, S End C Cross Rd, KSRTC Layout, 2nd Phase",
    "openingTimes": "06:00AM-11:00PM",
    "vehicleTypes": [
      "Car",
      "Bus",
      "Auto"
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
        "vehicle": "Bus"
      },
      {
        "id": "ch3",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Auto"
      },
      {
        "id": "ch4",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Auto"
      }
    ]
  },
  {
    "id": 315,
    "name": "Charzer Charging Station",
    "place": "44.45 shop no 1, Hosur Rd, near HDFC bank Singasandra",
    "openingTimes": "08:00AM-11:00PM",
    "vehicleTypes": [
      "Car",
      "Auto",
      "Bike"
    ],
    "chargers": [
      {
        "id": "ch1",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Bike"
      },
      {
        "id": "ch2",
        "available": true,
        "type": "DC Charger",
        "vehicle": "Car"
      },
      {
        "id": "ch3",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Auto"
      },
      {
        "id": "ch4",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Bike"
      },
      {
        "id": "ch5",
        "available": false,
        "type": "DC Charger",
        "vehicle": "Car"
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
    "id": 115,
    "name": "Zeon Charging Station",
    "place": "XHF2+6JG, Magadi Main Rd, next to Prasanna Theatre",
    "openingTimes": "10:00AM-11:00PM",
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
    "id": 654,
    "name": "Ather Grid Charging Station",
    "place": "64, 10th Main Rd, 4th Block, 5th Block, Jayanagar",
    "openingTimes": "00:00AM-10:00PM",
    "vehicleTypes": [
      "Car",
      "Bus",
      "Bike",
      "Scooty"
    ],
    "chargers": [
      {
        "id": "ch1",
        "available": true,
        "type": "AC Charger",
        "vehicle": "Scooty"
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
        "vehicle": "Car"
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
        "vehicle": "Bike"
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
    "id": 114,
    "name": "Shiva gowri",
    "place": "1070, 27th Main Rd, Putlanpalya, Jayanagara 9th Block",
    "openingTimes": "00:00AM-11:00PM",
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
        "available": false,
        "type": "DC Charger",
        "vehicle": "Bus"
      },
      {
        "id": "ch4",
        "available": false,
        "type": "AC Charger",
        "vehicle": "Bus"
      }
    ]
  },
  {
    "id": 182,
    "name": "Electric Vehicle Charging Station",
    "place": "64, 10th Main Rd, 4th Block, 5th Block, Jayanagar",
    "openingTimes": "00:00AM-11:00PM",
    "vehicleTypes": [
      "Car",
      "Bike"
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
        "vehicle": "Bike"
      }
    ]
  },
  {
    "id": 654,
    "name": "Vidyuth Power Charging Station",
    "place": "70, 27th Main Rd, Putlanpalya, Jayanagara 9th Block",
    "openingTimes": "00:00AM-11:59PM",
    "vehicleTypes": [
      "Car",
      "Bus",
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
        "vehicle": "Car"
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
        "vehicle": "Bike"
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
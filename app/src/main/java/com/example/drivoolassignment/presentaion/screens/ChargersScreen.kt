package com.example.drivoolassignment.presentaion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drivoolassignment.R
import com.example.drivoolassignment.models.Charger
import com.example.drivoolassignment.models.ChargingStationsItem
import com.example.drivoolassignment.ui.theme.DrivoolAssignmentTheme
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun ChargersScreen(csItem: ChargingStationsItem) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF292929))
            .padding(horizontal = 20.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(RoundedCornerShape(5.dp)),
            painter = painterResource(id = R.drawable.map),
            contentDescription = "map",
            contentScale = ContentScale.FillBounds
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.h2,
            text = csItem.name,
            color = Color.White
        )

        ChargerList(csItem)

    }
}

@Composable
fun ChargerList(csItem: ChargingStationsItem) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        items(csItem.chargers.size) {i->
            ChargerComponent(csItem.chargers[i])
        }
    }
}


@Composable
fun ChargerComponent(charger: Charger) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp,
        backgroundColor = Color(0xFF171717)
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Text(
                text = "Electric Charger: ${charger.id}",
                style = MaterialTheme.typography.body1,
                color = Color.White
            )

            Row {
                Column(
                    modifier = Modifier.weight(0.7f),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    ChargerFieldValue(field = "Availability:    ", value = if (charger.available) "Available" else "UnAvailable")
                    ChargerFieldValue(field = "Charger Type:", value = charger.type)
                    ChargerFieldValue(field = "Vehicle Type: ", value = charger.vehicle)
                }
                Box(
                    modifier = Modifier
                        .weight(0.3f)
                        .align(Alignment.Bottom)
                ) {
                    when(charger.vehicle.lowercase()){
                        VehicleType.Auto.toString().lowercase() -> VehicleImage(vehicleType = VehicleType.Auto)
                        VehicleType.Bus.toString().lowercase() -> VehicleImage(vehicleType = VehicleType.Bus)
                        VehicleType.Car.toString().lowercase() -> VehicleImage(vehicleType = VehicleType.Car)
                        VehicleType.Bike.toString().lowercase() -> VehicleImage(vehicleType = VehicleType.Bike)
                        VehicleType.Scooty.toString().lowercase() -> VehicleImage(vehicleType = VehicleType.Scooty)
                    }
                }
            }

        }
    }
}

@Composable
fun ChargerFieldValue(field: String, value: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Text(
            text = field,
            style = MaterialTheme.typography.body2,
            color = Color.White
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = value,
            style = MaterialTheme.typography.subtitle2,
            color = Color.White
        )

    }
}


@Composable
fun VehicleImage(vehicleType: VehicleType) {
    when (vehicleType) {
        VehicleType.Car -> ImageComponent(id = vehicleType.id, cd = vehicleType.toString())
        VehicleType.Bike -> ImageComponent(id = vehicleType.id, cd = vehicleType.toString())
        VehicleType.Scooty -> ImageComponent(id = vehicleType.id, cd = vehicleType.toString())
        VehicleType.Auto -> ImageComponent(id = vehicleType.id, cd = vehicleType.toString())
        VehicleType.Bus -> ImageComponent(id = vehicleType.id, cd = vehicleType.toString())
    }

}

@Composable
fun ImageComponent(id: Int, cd: String) {
    Image(
        painter = painterResource(id = id), contentDescription = cd
    )
}


enum class VehicleType(val id: Int) {
    Car(R.drawable.ic_car),
    Bike(R.drawable.ic_bike),
    Scooty(R.drawable.ic_scooty),
    Auto(R.drawable.ic_auto),
    Bus(R.drawable.ic_bus),

}

@Preview
@Composable
fun ShowChargersScreen() {
    DrivoolAssignmentTheme {
        ChargersScreen(
            ChargingStationsItem(
                listOf(),
                0,
                "any",
                "",
                "",
                listOf()
            )
        )
    }
}
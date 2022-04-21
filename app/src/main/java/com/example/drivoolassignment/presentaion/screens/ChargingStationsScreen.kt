package com.example.drivoolassignment.presentaion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
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
import com.example.drivoolassignment.ChargingStationsViewModel
import com.example.drivoolassignment.R
import com.example.drivoolassignment.presentaion.screens.destinations.ChargersScreenDestination
import com.example.drivoolassignment.ui.theme.DrivoolAssignmentTheme
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.drivoolassignment.models.ChargingStationsItem
import com.example.drivoolassignment.presentaion.ChargingStationsState

@Destination(start = true)
@Composable
fun ChargingStationScreen(
    navigator: DestinationsNavigator,
    viewModel: ChargingStationsViewModel = viewModel()
) {

    val state = viewModel.chargingStationsState

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF292929))
            .padding(horizontal = 20.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Drivool E-Charge",
            style = MaterialTheme.typography.h1
        )
        Text(
            text = "Charging Stations in Bangalore", color = Color.White,
            style = MaterialTheme.typography.h2
        )
        ListofChrgStn(navigator, state)
    }

}

@Composable
fun ListofChrgStn(navigator: DestinationsNavigator?, state: ChargingStationsState) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        items(state.chargingStations.size) { i ->
            ChrgStn(navigator, state.chargingStations[i])
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ChrgStn(navigator: DestinationsNavigator?, csItem: ChargingStationsItem) {
    Card(
        onClick = {
            navigator?.navigate(
                ChargersScreenDestination(csItem)
            )
        },
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp,
        backgroundColor = Color(0xFF171717)
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {

            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = csItem.name,
                    style = MaterialTheme.typography.h3,
                    color = Color.White
                )
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = csItem.place,
                    style = MaterialTheme.typography.subtitle1,
                    color = Color.White
                )
            }


            Row(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Opening Timings: ",
                        style = MaterialTheme.typography.body1,
                        color = Color.White
                    )
                    Text(
                        text = csItem.openingTimes,
                        style = MaterialTheme.typography.body2,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Chargeable Vehicles:",
                        style = MaterialTheme.typography.body1,
                        color = Color.White
                    )
                    Text(
                        text = csItem.vehicleTypes.joinToString(
                            separator = ",  ",
                            transform = { it.uppercase() }),
                        style = MaterialTheme.typography.body2,
                        color = Color.White
                    )
                }

                Image(
                    modifier = Modifier
                        .weight(1f)
                        .height(120.dp)
                        .clip(RoundedCornerShape(5.dp)),
                    painter = painterResource(id = R.drawable.map),
                    contentDescription = "map",
                    contentScale = ContentScale.FillBounds
                )
            }

        }
    }
}

@Preview
@Composable
fun ShowChrgStn() {
    DrivoolAssignmentTheme {
        ChrgStn(
            null, ChargingStationsItem(
                name = "Charzer Charging Station",
                place = "16,17th Main road",
                openingTimes = "06:00AM - 11:00PM",
                vehicleTypes = listOf("car", "bus", "auto", "bike", "scooty"),
                id = 253,
                chargers = listOf()
            )
        )
    }
}

@Preview
@Composable
fun ShowChrgStnScreen() {
    DrivoolAssignmentTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF292929))
                .padding(horizontal = 20.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Drivool E-Charge", color = Color.White)
            Text(text = "Charging Stations in Bangalore", color = Color.White)
            ListofChrgStn(
                null,
                ChargingStationsState(
                    chargingStations = listOf(
                        ChargingStationsItem(
                            name = "Charzer Charging Station",
                            place = "16,17th Main road",
                            openingTimes = "06:00AM - 11:00PM",
                            vehicleTypes = listOf("car", "bus", "auto", "bike", "scooty"),
                            id = 253,
                            chargers = listOf()
                        ),

                        ChargingStationsItem(
                            name = "Charzer Charging Station",
                            place = "16,17th Main road",
                            openingTimes = "06:00AM - 11:00PM",
                            vehicleTypes = listOf("car", "bus", "auto", "bike", "scooty"),
                            id = 253,
                            chargers = listOf()
                        )
                    )
                )
            )

        }
    }
}
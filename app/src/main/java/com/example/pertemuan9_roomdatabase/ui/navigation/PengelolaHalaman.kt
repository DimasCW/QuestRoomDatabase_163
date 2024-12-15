package com.example.pertemuan9_roomdatabase.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun PengelolaHalaman(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController, startDestination = DestinasiInsert.route
    ){
        composable(
            route = DestinasiInsert.route
        ){
            InsertMhsView(
                onBack = {}, onNavigate = { }
            )
        }
    }
}
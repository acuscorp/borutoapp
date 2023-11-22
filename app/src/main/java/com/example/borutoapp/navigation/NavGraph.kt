package com.example.borutoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.borutoapp.util.Constants.DETAILS_ARGUMENT_KEY

@Composable
fun SetupNavGraph(navGraController: NavHostController) {
	NavHost(navController = navGraController, startDestination = Screen.Splash.rout) {
		composable(route = Screen.Splash.rout) {

		}
		composable(route = Screen.Welcome.rout) {

		}
		composable(route = Screen.Home.rout) {

		}
		composable(route = Screen.Details.rout, arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY){
			type = NavType.IntType
		})) {

		}
		composable(route = Screen.Search.rout) {

		}
	}
}
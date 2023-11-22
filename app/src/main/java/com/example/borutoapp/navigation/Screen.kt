package com.example.borutoapp.navigation

import com.example.borutoapp.util.Constants.DETAILS_ARGUMENT_KEY

sealed class Screen(val rout: String) {
	object Splash : Screen("splash_screen")
	object Welcome : Screen("welcome_screen")
	object Home : Screen("home_screen")
	object Details : Screen("details_screen/{$DETAILS_ARGUMENT_KEY}") {
		fun passHeroId(heroId: Int): String {
			return "details_screen/${heroId}"
		}
	}

	object Search : Screen("search_screen")

}

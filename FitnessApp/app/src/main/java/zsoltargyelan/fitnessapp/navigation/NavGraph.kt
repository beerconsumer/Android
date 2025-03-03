package zsoltargyelan.fitnessapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import zsoltargyelan.fitnessapp.screen.HomeScreen
import zsoltargyelan.fitnessapp.screen.MealsScreen
import zsoltargyelan.fitnessapp.screen.SettingsScreen
import zsoltargyelan.fitnessapp.screen.SplashScreen
import zsoltargyelan.fitnessapp.screen.WorkoutScreen

@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable("splash") {
            SplashScreen(
                onSuccess = {
                    navController.navigate("home") {
                        popUpTo("splash") { inclusive = true }
                        launchSingleTop = true
                    }
                }
            )
        }
        composable("home") { HomeScreen() }
        composable("meals") { MealsScreen() }
        composable("workout") { WorkoutScreen() }
        composable("settings") { SettingsScreen() }
    }
}
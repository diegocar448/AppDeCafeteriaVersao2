package com.diego.appdecafeteriaversao2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.diego.appdecafeteriaversao2.screens.Carrinho
import com.diego.appdecafeteriaversao2.screens.Home
import com.diego.appdecafeteriaversao2.viewmodel.CarrinhoViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //remove ou não barra de notificação
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()
            //iniciar viewModel do carrinho
            val carrinhoViewModel: CarrinhoViewModel = hiltViewModel()

            NavHost(
                startDestination = "Home",
                navController = navController
            ){

                composable(
                    route = "Home"
                ){
                    Home(navController = navController, carrinhoViewModel = carrinhoViewModel)
                }
                composable(
                    route = "Carrinho"
                ){
                    Carrinho(navController = navController, carrinhoViewModel = carrinhoViewModel)
                }

            }
        }
    }
}


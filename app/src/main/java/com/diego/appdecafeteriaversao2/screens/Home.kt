package com.diego.appdecafeteriaversao2.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.diego.appdecafeteriaversao2.ui.theme.MyTheme
import com.diego.appdecafeteriaversao2.viewmodel.CarrinhoViewModel

@Composable
fun Home(
    navController: NavController,
    carrinhoViewModel: CarrinhoViewModel
){

    MyTheme(
        theme = "1"
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Home....")

            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.tertiary
                )
            ) {
                Text("Cadastrar")
            }
        }
    }


}
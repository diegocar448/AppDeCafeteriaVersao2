package com.diego.appdecafeteriaversao2.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.diego.appdecafeteriaversao2.ui.theme.BLACK80
import com.diego.appdecafeteriaversao2.ui.theme.MyTheme
import com.diego.appdecafeteriaversao2.ui.theme.WHITE
import com.diego.appdecafeteriaversao2.viewmodel.CarrinhoViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    navController: NavController,
    carrinhoViewModel: CarrinhoViewModel
){

    var pesquisar by remember { mutableStateOf("") }

    MyTheme(
        theme = "1"
    ){
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {},
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary
                    ),
                    modifier = Modifier.height(130.dp),
                    actions = {
                        Row(
                           modifier = Modifier.fillMaxWidth(),
                           verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ){
                            OutlinedTextField(
                                value = pesquisar,
                                onValueChange = {
                                    pesquisar = it
                                },
                                label = {
                                    Text("Pesquisar")
                                },
                                modifier = Modifier.width(300.dp).padding(10.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.colors(
                                    unfocusedContainerColor = WHITE,
                                    focusedContainerColor = WHITE,
                                    focusedLabelColor = WHITE,
                                    unfocusedLabelColor = BLACK80,
                                    focusedIndicatorColor = WHITE
                                ),
                                maxLines = 1,
                                shape = RoundedCornerShape(30.dp)
                            )

                            Icon(
                                imageVector = Icons.Rounded.ShoppingCart,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.secondary,
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier.fillMaxSize().background(Color.LightGray).padding(paddingValues)
            ){

            }
        }
    }


}
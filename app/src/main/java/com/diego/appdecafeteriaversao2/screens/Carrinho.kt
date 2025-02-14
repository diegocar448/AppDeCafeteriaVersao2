package com.diego.appdecafeteriaversao2.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.diego.appdecafeteriaversao2.R

@Composable
fun Carrinho(){

    Scaffold(

    ) { paddingValues ->

        //box para a imagem  background
        Box(
            modifier = Modifier.fillMaxSize()
        ){
            Image(
                painter = painterResource(R.drawable.bg_cart),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                //matchParentSize ( pegar todo espaco top, bottom, start, end )
                modifier = Modifier.matchParentSize()
            )
        }

        Column(
            modifier = Modifier.fillMaxWidth().padding(paddingValues)
        ){

        }

    }
}
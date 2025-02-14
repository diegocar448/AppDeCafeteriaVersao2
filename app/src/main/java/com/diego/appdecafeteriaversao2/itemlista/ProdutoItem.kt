package com.diego.appdecafeteriaversao2.itemlista

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.diego.appdecafeteriaversao2.model.Produto
import com.diego.appdecafeteriaversao2.viewmodel.CarrinhoViewModel

@Composable
fun ProdutoItem(
    produto: Produto,
    carrinhoViewModel: CarrinhoViewModel
){
    Column(
        modifier = Modifier.fillMaxWidth().background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.secondary
            ),
            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 8.dp
            ),
            modifier = Modifier.width(180.dp).height(350.dp).padding(8.dp)
        ){
            Image(
                painter = painterResource(produto.foto!!),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().height(150.dp).padding(0.dp, 0.dp, 0.dp, 10.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}
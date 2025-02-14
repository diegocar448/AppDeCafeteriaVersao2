package com.diego.appdecafeteriaversao2.itemlista

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.diego.appdecafeteriaversao2.model.Produto
import com.diego.appdecafeteriaversao2.viewmodel.CarrinhoViewModel

@Composable
fun ProdutoItem(
    produto: Produto,
    carrinhoViewModel: CarrinhoViewModel
){
    var quantidadeProduto by remember { mutableIntStateOf(1) }


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
            modifier = Modifier.width(190.dp).height(380.dp).padding(8.dp)
        ){
            //imagem card
            Image(
                painter = painterResource(produto.foto!!),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().height(150.dp).padding(0.dp, 0.dp, 0.dp, 10.dp),
                contentScale = ContentScale.Crop
            )

            //titulo card
            Text(
                text = "${produto.nome}",
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 13.sp,
                modifier = Modifier.padding(10.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "+",
                    color = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier
                        .background(
                            color = MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(30.dp)
                        ).padding(5.dp).size(20.dp) // Define o tamanho do componente Text como 20.dp
                        .clickable {

                        },
                    textAlign = TextAlign.Center
                )

                Text(
                    text = quantidadeProduto.toString(),
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.padding(5.dp, 0.dp)
                )

                Text(
                    text = "-",
                    color = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier
                        .background(
                            color = MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(30.dp)
                        ).padding(5.dp).size(20.dp) // Define o tamanho do componente Text como 20.dp
                        .clickable {

                        },
                    textAlign = TextAlign.Center
                )
            }

            Text(
                text = "${produto.preco}",
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )

            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    contentColor = MaterialTheme.colorScheme.secondary
                ),
                modifier = Modifier.fillMaxWidth().padding(10.dp)
            ){
                Text( text="Carrinho" )
            }
        }
    }
}
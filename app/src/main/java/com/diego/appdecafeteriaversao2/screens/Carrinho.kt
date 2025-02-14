package com.diego.appdecafeteriaversao2.screens

import android.icu.text.DecimalFormat
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.diego.appdecafeteriaversao2.R
import com.diego.appdecafeteriaversao2.ui.theme.MyTheme
import com.diego.appdecafeteriaversao2.ui.theme.RED
import com.diego.appdecafeteriaversao2.viewmodel.CarrinhoViewModel

@Composable
fun Carrinho(
    navController: NavController,
    carrinhoViewModel: CarrinhoViewModel
    ){

    val produtos = carrinhoViewModel.produtosCarrinho
    val total = carrinhoViewModel.calcularTotal()

    MyTheme(
        theme = "1"
    ) {
        Scaffold(
            bottomBar = {
                if(produtos.size > 0){
                    BottomAppBar(
                        containerColor = MaterialTheme.colorScheme.primary
                    ) {
                        Button(
                            onClick = {

                            },
                            modifier = Modifier.fillMaxWidth().height(50.dp).padding(50.dp, 0.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.secondary,
                                contentColor = MaterialTheme.colorScheme.onPrimary
                            ),
                            shape = RoundedCornerShape(30.dp)
                        ) {
                            Text(text = "Finalizar Compra")
                        }
                    }
                }

            }
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
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = "Carrinho",
                        color = MaterialTheme.colorScheme.secondary,
                        fontSize = 24.sp,
                        modifier = Modifier.padding(20.dp)

                    )

                    Text(
                        text = "Total ${DecimalFormat.getCurrencyInstance().format(total)}",
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp).background(
                            color = MaterialTheme.colorScheme.secondary,
                            shape = RoundedCornerShape(10.dp)
                        ).padding(5.dp)
                    )
                }

                LazyColumn(
                    modifier = Modifier.padding(10.dp)
                ) {
                    itemsIndexed(produtos){posicao, produto ->
                        Column(
                            modifier = Modifier.fillMaxWidth()
                                .background(
                                    color = MaterialTheme.colorScheme.secondary,
                                    shape = RoundedCornerShape(15.dp)
                                ).padding(5.dp)
                        ) {
                            Text(
                                text = produto.nome!!,
                                color = MaterialTheme.colorScheme.onPrimary,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(10.dp, 5.dp)
                            )

                            Text(
                                text = DecimalFormat.getCurrencyInstance().format(produto.preco.toDouble()),
                                color = MaterialTheme.colorScheme.onPrimary,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(10.dp, 5.dp)
                            )
                            Text(
                                text = "Quantidade: ${produto.quantidade}",
                                color = MaterialTheme.colorScheme.onPrimary,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(10.dp, 5.dp)
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.Delete,
                                    contentDescription = null,
                                    tint = RED,
                                    modifier = Modifier.size(50.dp).padding(10.dp).clickable {

                                    }
                                )
                            }

                        }

                        Spacer(
                            modifier = Modifier.padding(10.dp)
                        )

                    }
                }


            }
        }

    }



}
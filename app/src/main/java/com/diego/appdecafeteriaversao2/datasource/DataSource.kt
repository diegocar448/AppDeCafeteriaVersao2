package com.diego.appdecafeteriaversao2.datasource

import com.diego.appdecafeteriaversao2.R
import com.diego.appdecafeteriaversao2.model.Produto
import javax.inject.Inject

class DataSource @Inject constructor() {

    fun getProdutos(
        response: (MutableList<Produto>) -> Unit
    ){
        val listaProdutos = mutableListOf(
            Produto(
                foto = R.drawable.cappuccino_tradicional,
                nome = "Cappuccino tradicional",
                preco = "15.00"
            ),
            Produto(
                foto = R.drawable.cafe_expresso,
                nome = "Café Expresso",
                preco = "9.90"
            ),
            Produto(
                foto = R.drawable.cappuccino_chocolate,
                nome = "Cappuccino Gelado Sabor Chocolate",
                preco = "25.00"
            ),
            Produto(
                foto = R.drawable.cappuccino_pistache,
                nome = "Cappuccino Pistache",
                preco = "22.99"
            ),
            Produto(
                foto = R.drawable.bolo_morango,
                nome = "Bolo de Morango",
                preco = "30.90"
            ),
            Produto(
                foto = R.drawable.pudim,
                nome = "Pudim de Leite",
                preco = "16.00"
            )
        )

        response(listaProdutos)
    }
}
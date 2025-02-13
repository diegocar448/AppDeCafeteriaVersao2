package com.diego.appdecafeteriaversao2.repositorio

import com.diego.appdecafeteriaversao2.datasource.DataSource
import com.diego.appdecafeteriaversao2.model.Produto
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class CarrinhoRepositorio @Inject constructor( private val dataSource: DataSource) {

    fun getProdutos(
        response: (MutableList<Produto>) -> Unit
    ){
        dataSource.getProdutos(response)
    }
}
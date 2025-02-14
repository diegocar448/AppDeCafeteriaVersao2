package com.diego.appdecafeteriaversao2.viewmodel

import androidx.collection.mutableIntSetOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diego.appdecafeteriaversao2.model.Carrinho
import com.diego.appdecafeteriaversao2.model.Produto
import com.diego.appdecafeteriaversao2.repositorio.CarrinhoRepositorio
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CarrinhoViewModel @Inject constructor( private val carrinhoRepositorio: CarrinhoRepositorio ): ViewModel() {

    var produtosCarrinho = mutableListOf<Carrinho>()
    var totalItens = mutableIntStateOf(0)

    //listar produtos
    fun getProdutos(
        response: (MutableList<Produto>) -> Unit
    ){
        viewModelScope.launch {
            carrinhoRepositorio.getProdutos(response)
        }
    }

    //add produtos
    fun adicionarProdutoCarrinho(produto: Carrinho){
        produtosCarrinho.add(produto)
        totalItens.intValue += 1
    }





}
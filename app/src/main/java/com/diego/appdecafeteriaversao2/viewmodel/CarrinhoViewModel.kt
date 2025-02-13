package com.diego.appdecafeteriaversao2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diego.appdecafeteriaversao2.model.Produto
import com.diego.appdecafeteriaversao2.repositorio.CarrinhoRepositorio
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CarrinhoViewModel @Inject constructor( private val carrinhoRepositorio: CarrinhoRepositorio ): ViewModel() {

    fun getProdutos(
        response: (MutableList<Produto>) -> Unit
    ){
        viewModelScope.launch {
            carrinhoRepositorio.getProdutos(response)
        }
    }
}
package com.diego.appdecafeteriaversao2.viewmodel

import androidx.lifecycle.ViewModel
import com.diego.appdecafeteriaversao2.repositorio.CarrinhoRepositorio
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CarrinhoViewModel @Inject constructor( private val carrinhoRepositorio: CarrinhoRepositorio ): ViewModel() {
}
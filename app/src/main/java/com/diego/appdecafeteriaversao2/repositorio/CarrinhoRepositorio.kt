package com.diego.appdecafeteriaversao2.repositorio

import com.diego.appdecafeteriaversao2.datasource.DataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class CarrinhoRepositorio @Inject constructor( private val dataSource: DataSource) {
}
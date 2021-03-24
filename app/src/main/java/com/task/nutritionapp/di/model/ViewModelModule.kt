package com.task.nutritionapp.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.task.nutritionapp.di.factory.ViewModelFactory
import com.task.nutritionapp.di.keys.ViewModelKey
import com.task.nutritionapp.ui.ingredients.IngredientsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory


    @Binds
    @IntoMap
    @ViewModelKey(IngredientsViewModel::class)
    abstract fun bindIngredientsViewModel(ingredientsViewModel: IngredientsViewModel): ViewModel

}
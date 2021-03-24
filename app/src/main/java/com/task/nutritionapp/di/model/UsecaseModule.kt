package com.task.nutritionapp.di.module

import com.task.nutritionapp.domain.repository.Repository
import com.task.nutritionapp.domain.usecase.ingredients.IngredientsUseCase
import com.task.nutritionapp.domain.usecase.ingredients.IngredientsUseCaseImp
import dagger.Module
import dagger.Provides

@Module
class UsecaseModule {

    @Provides
    fun provideOfferUseCase(repository: Repository): IngredientsUseCase {
        return IngredientsUseCaseImp(repository = repository)
    }

}
package com.task.nutritionapp.domain.usecase.ingredients

import com.task.nutritionapp.data.model.NutritionRequest
import com.task.nutritionapp.data.model.NutritionResponse
import com.task.nutritionapp.domain.repository.Repository
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by Abdelrahman Sherif on 3/22/2021.
 */
class IngredientsUseCaseImp @Inject

constructor(val repository: Repository) : IngredientsUseCase {

    override fun getNutritionAnalysis(nutritionRequest: NutritionRequest): Observable<NutritionResponse> {
        return repository.getNutritionAnalysis(
            nutritionRequest = nutritionRequest
        )
    }

}
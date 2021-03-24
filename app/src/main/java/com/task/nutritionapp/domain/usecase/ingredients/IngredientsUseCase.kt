package com.task.nutritionapp.domain.usecase.ingredients

import com.task.nutritionapp.data.model.NutritionRequest
import com.task.nutritionapp.data.model.NutritionResponse
import io.reactivex.Observable

/**
 * Created by Abdelrahman Sherif on 3/22/2021.
 */
interface IngredientsUseCase {
    fun getNutritionAnalysis(nutritionRequest: NutritionRequest): Observable<NutritionResponse>
}
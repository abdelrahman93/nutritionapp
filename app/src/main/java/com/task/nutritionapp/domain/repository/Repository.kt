package com.task.nutritionapp.domain.repository


import com.task.nutritionapp.data.model.NutritionRequest
import com.task.nutritionapp.data.model.NutritionResponse
import io.reactivex.Observable

interface Repository {

    fun getNutritionAnalysis(nutritionRequest: NutritionRequest): Observable<NutritionResponse>

}
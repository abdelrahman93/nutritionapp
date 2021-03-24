package com.task.nutritionapp.data.repository

import com.task.nutritionapp.data.model.NutritionRequest
import com.task.nutritionapp.data.model.NutritionResponse
import com.task.nutritionapp.domain.remote.NutrationAPI
import com.task.nutritionapp.domain.repository.Repository
import com.task.nutritionapp.utilities.NutritionConstants.Companion.APP_ID
import com.task.nutritionapp.utilities.NutritionConstants.Companion.APP_KEY
import io.reactivex.Observable
import javax.inject.Inject

class RepositoryImp @Inject constructor(var nutrationAPI: NutrationAPI) : Repository {

    override fun getNutritionAnalysis(nutritionRequest: NutritionRequest)
            : Observable<NutritionResponse> {
        return nutrationAPI.getNutritionAnalysis(
            APP_ID, APP_KEY,
            nutritionRequest = nutritionRequest
        )
    }

}
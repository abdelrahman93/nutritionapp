package com.task.nutritionapp.domain.remote

import com.task.nutritionapp.data.model.ApiUrl
import com.task.nutritionapp.data.model.NutritionRequest
import com.task.nutritionapp.data.model.NutritionResponse
import io.reactivex.Observable
import retrofit2.http.*

interface NutrationAPI {
    @POST(ApiUrl.NUTRITION_ANALYSIS)
    fun getNutritionAnalysis(
        @Query("app_id") app_id:String,@Query("app_key") app_key:String, @Body nutritionRequest: NutritionRequest
    ): Observable<NutritionResponse>


}


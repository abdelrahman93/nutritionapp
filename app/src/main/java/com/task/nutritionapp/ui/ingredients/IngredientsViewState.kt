package com.task.nutritionapp.ui.ingredients

import com.task.nutritionapp.BaseViewState
import com.task.nutritionapp.data.model.NutritionResponse

/**
 * Created by Abdelrahman Sherif on 3/22/2021.
 */
class IngredientsViewState : BaseViewState() {

    class success(val response:NutritionResponse):BaseViewState()

}
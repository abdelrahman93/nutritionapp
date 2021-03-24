package com.task.nutritionapp.data.model

import com.google.gson.annotations.SerializedName
import com.task.nutritionapp.data.model.units.TotalDaily
import com.task.nutritionapp.data.model.units.TotalNutrients
import com.task.nutritionapp.data.model.units.TotalNutrientsKCal

data class NutritionResponse(
	@field:SerializedName("dietLabels")
	val dietLabels: List<String?>? = null,

	@field:SerializedName("cautions")
	val cautions: List<String?>? = null,

	@field:SerializedName("healthLabels")
	val healthLabels: List<String?>? = null,

	@field:SerializedName("yield")
	val yield: Double? = null,

	@field:SerializedName("totalWeight")
	val totalWeight: Double? = null,

	@field:SerializedName("totalDaily")
	val totalDaily: TotalDaily? = null,

	@field:SerializedName("calories")
	val calories: Int? = null,

	@field:SerializedName("totalNutrientsKCal")
	val totalNutrientsKCal: TotalNutrientsKCal? = null,

	@field:SerializedName("uri")
	val uri: String? = null,

	@field:SerializedName("totalNutrients")
	val totalNutrients: TotalNutrients? = null
)
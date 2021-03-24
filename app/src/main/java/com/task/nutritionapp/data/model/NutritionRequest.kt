package com.task.nutritionapp.data.model

import com.google.gson.annotations.SerializedName

data class NutritionRequest(

	@field:SerializedName("ingr")
	val ingr: List<String?>? = null,

	@field:SerializedName("title")
	val title: String? = null
)
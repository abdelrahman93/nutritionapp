package com.task.nutritionapp.data.model.units

import com.google.gson.annotations.SerializedName

data class FATKCAL(

	@field:SerializedName("unit")
	val unit: String? = null,

	@field:SerializedName("quantity")
	val quantity: Int? = null,

	@field:SerializedName("label")
	val label: String? = null
)
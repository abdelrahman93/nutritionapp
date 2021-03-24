package com.task.nutritionapp.data.model.units

import com.google.gson.annotations.SerializedName

data class TotalNutrientsKCal(

	@field:SerializedName("PROCNT_KCAL")
	val pROCNTKCAL: PROCNTKCAL? = null,

	@field:SerializedName("ENERC_KCAL")
	val eNERCKCAL: ENERCKCAL? = null,

	@field:SerializedName("FAT_KCAL")
	val fATKCAL: FATKCAL? = null,

	@field:SerializedName("CHOCDF_KCAL")
	val cHOCDFKCAL: CHOCDFKCAL? = null
)
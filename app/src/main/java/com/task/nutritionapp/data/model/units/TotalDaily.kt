package com.task.nutritionapp.data.model.units

import com.google.gson.annotations.SerializedName

data class TotalDaily(

	@field:SerializedName("VITB6A")
	val vITB6A: VITB6A? = null,

	@field:SerializedName("VITC")
	val vITC: VITC? = null,

	@field:SerializedName("CHOCDF")
	val cHOCDF: CHOCDF? = null,

	@field:SerializedName("K")
	val K: K? = null,

	@field:SerializedName("VITD")
	val vITD: VITD? = null,

	@field:SerializedName("P")
	val P: P? = null,

	@field:SerializedName("CHOLE")
	val cHOLE: CHOLE? = null,

	@field:SerializedName("ENERC_KCAL")
	val eNERCKCAL: ENERCKCAL? = null,

	@field:SerializedName("FASAT")
	val fASAT: FASAT? = null,

	@field:SerializedName("VITK1")
	val vITK1: VITK1? = null,

	@field:SerializedName("MG")
	val mG: MG? = null,

	@field:SerializedName("RIBF")
	val rIBF: RIBF? = null,

	@field:SerializedName("CA")
	val cA: CA? = null,

	@field:SerializedName("NIA")
	val nIA: NIA? = null,

	@field:SerializedName("THIA")
	val tHIA: THIA? = null,

	@field:SerializedName("FIBTG")
	val fIBTG: FIBTG? = null,

	@field:SerializedName("VITB12")
	val vITB12: VITB12? = null,

	@field:SerializedName("TOCPHA")
	val tOCPHA: TOCPHA? = null,

	@field:SerializedName("PROCNT")
	val pROCNT: PROCNT? = null,

	@field:SerializedName("FOLDFE")
	val fOLDFE: FOLDFE? = null,

	@field:SerializedName("NA")
	val nA: NA? = null,

	@field:SerializedName("ZN")
	val zN: ZN? = null,

	@field:SerializedName("VITA_RAE")
	val vITARAE: VITARAE? = null,

	@field:SerializedName("FAT")
	val fAT: FAT? = null,

	@field:SerializedName("FE")
	val fE: FE? = null
)
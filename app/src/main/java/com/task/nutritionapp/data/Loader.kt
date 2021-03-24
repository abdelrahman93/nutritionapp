package com.task.nutritionapp.data

import com.task.nutritionapp.BaseViewState

sealed class Loader : BaseViewState() {
    data class Shimmer(var show: Boolean) : Loader()
    data class Progress(var show: Boolean) : Loader()
}



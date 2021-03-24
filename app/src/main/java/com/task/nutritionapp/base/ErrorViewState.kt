package com.task.nutritionapp.base

import com.task.nutritionapp.BaseViewState

sealed class ErrorViewState : BaseViewState() {
    data class Error(val message: String?) : BaseViewState()
}
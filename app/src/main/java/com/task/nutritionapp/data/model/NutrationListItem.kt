package com.task.nutritionapp.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NutrationListItem(
    var label: String?,
    var weight: String?,
    var percentage: String?
): Parcelable
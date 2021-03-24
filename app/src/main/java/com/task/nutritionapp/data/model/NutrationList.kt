package com.task.nutritionapp.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class NutrationList : ArrayList<NutrationListItem>(), Parcelable
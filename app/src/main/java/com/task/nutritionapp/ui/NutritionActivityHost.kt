package com.task.nutritionapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.task.nutritionapp.R

class NutritionActivityHost : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition)
    }
}
package com.task.nutritionapp.ui.ingredients

import android.text.Layout
import android.util.Log
import android.widget.EditText
import com.task.nutritionapp.BaseViewModel
import com.task.nutritionapp.data.Loader
import com.task.nutritionapp.data.model.NutrationList
import com.task.nutritionapp.data.model.NutrationListItem
import com.task.nutritionapp.data.model.NutritionRequest
import com.task.nutritionapp.data.model.NutritionResponse
import com.task.nutritionapp.di.module.SCHEDULER_IO
import com.task.nutritionapp.di.module.SCHEDULER_MAIN_THREAD
import com.task.nutritionapp.domain.usecase.ingredients.IngredientsUseCase
import io.reactivex.Scheduler
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Abdelrahman Sherif on 3/22/2021.
 */
class IngredientsViewModel @Inject constructor(
    private val ingredientsUseCase: IngredientsUseCase,
    @Named(SCHEDULER_IO) private val schedulerIo: Scheduler,
    @Named(SCHEDULER_MAIN_THREAD) private val schedulerMain: Scheduler
) : BaseViewModel(schedulerIo, schedulerMain) {

    fun getIngredientAnalysis(title: String, arr: List<String>?) {
        val nutritionRequest = NutritionRequest(
            title = title,
            ingr = arr
        )

        subscribe(request = ingredientsUseCase.getNutritionAnalysis(nutritionRequest),
            loader = Loader.Progress(true),
            success = io.reactivex.functions.Consumer { response ->
                internalState.value=IngredientsViewState.success(response)
            }

        )

    }

    fun initNutritionList(response: NutritionResponse): NutrationList {
        val list = NutrationList()

        //Calories
        list.add(
            NutrationListItem(
                label = response.totalNutrients?.eNERCKCAL?.label,
                weight = response.totalNutrients?.eNERCKCAL?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.eNERCKCAL?.quantity?.toInt().toString()
            )
        )

        //Fat
        list.add(
            NutrationListItem(
                label = response.totalNutrients?.fAT?.label,
                weight = response.totalNutrients?.fAT?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.fAT?.quantity?.toInt().toString()
            )
        )

        //Cholesterol
        list.add(
            NutrationListItem(
                label = response.totalNutrients?.cHOLE?.label,
                weight = response.totalNutrients?.cHOLE?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.cHOLE?.quantity?.toInt().toString()
            )
        )

        //Sodium
        list.add(
            NutrationListItem(
                label = response.totalNutrients?.nA?.label,
                weight = response.totalNutrients?.nA?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.nA?.quantity?.toInt().toString()
            )
        )

        //Carbohydrate
        list.add(
            NutrationListItem(
                label = response.totalNutrients?.cHOLE?.label,
                weight = response.totalNutrients?.cHOLE?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.cHOLE?.quantity?.toInt().toString()
            )
        )

        //Protein
        list.add(
            NutrationListItem(
                label = response.totalNutrients?.pROCNT?.label,
                weight = response.totalNutrients?.pROCNT?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.pROCNT?.quantity?.toInt().toString()
            )
        )

        //Vitamin
        list.add(
            NutrationListItem(
                label = response.totalNutrients?.vITARAE?.label,
                weight = response.totalNutrients?.vITARAE?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.vITARAE?.quantity?.toInt().toString()
            )
        )

        list.add(
            NutrationListItem(
                label = response.totalNutrients?.cA?.label,
                weight = response.totalNutrients?.cA?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.cA?.quantity?.toInt().toString()
            )
        )

        list.add(
            NutrationListItem(
                label = response.totalNutrients?.cA?.label,
                weight = response.totalNutrients?.cA?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.cA?.quantity?.toInt().toString()
            )
        )
        //Iron
        list.add(
            NutrationListItem(
                label = response.totalNutrients?.fE?.label,
                weight = response.totalNutrients?.fE?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.fE?.quantity?.toInt().toString()
            )
        )

        //Potassium
        list.add(
            NutrationListItem(
                label = response.totalNutrients?.K?.label,
                weight = response.totalNutrients?.K?.quantity?.toInt().toString(),
                percentage = response.totalDaily?.K?.quantity?.toInt().toString()
            )
        )
        return list
    }

    //To separate free text into list
    fun getLines(view: EditText): List<String>? {
        val lines: MutableList<String> = ArrayList()
        val layout: Layout? = view.layout
        if (layout != null) {
            val lineCount: Int = layout.getLineCount()
            val text: CharSequence = layout.getText()
            var i = 0
            var startIndex = 0
            while (i < lineCount) {
                val endIndex: Int = layout.getLineEnd(i)
                lines.add(text.subSequence(startIndex, endIndex).toString())
                startIndex = endIndex
                i++
            }
        }
        return lines
    }

}
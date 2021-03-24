package com.task.nutritionapp.ui.ingredients

import android.text.Editable
import android.text.TextWatcher
import androidx.navigation.fragment.findNavController
import com.task.nutritionapp.BaseFragment
import com.task.nutritionapp.BaseViewState
import com.task.nutritionapp.R
import com.task.nutritionapp.data.model.NutrationList
import com.task.nutritionapp.di.component.DaggerAppComponent
import kotlinx.android.synthetic.main.fragment_ingredients.*


class IngredientsFragment : BaseFragment<IngredientsViewModel>(IngredientsViewModel::class.java) {


    override fun injectDagger() = DaggerAppComponent.factory()
        .create(requireContext())
        .inject(this)


    override fun getLayout() = R.layout.fragment_ingredients

    override fun initView() {
        etFreeText.addTextChangedListener(textWatcher)
    }

    override fun renderView(viewState: BaseViewState?) {
        when (viewState) {
            is IngredientsViewState.success -> {
                navigateToTotalSummary(viewModel.initNutritionList(viewState.response))
            }

        }
    }


    override fun actions() {
        btnAnalyze.setOnClickListener {
            val arr = viewModel.getLines(etFreeText)
            viewModel.getIngredientAnalysis("", arr)
        }
    }


    private fun navigateToTotalSummary(listNutritionList: NutrationList) {
        val action = IngredientsFragmentDirections.toTotalNutritionFragment(listNutritionList)
        findNavController().navigate(action)
    }


    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            //pass
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            btnAnalyze.isEnabled = etFreeText.text?.isNotEmpty()!!
        }

        override fun afterTextChanged(s: Editable?) {
        }

    }
}






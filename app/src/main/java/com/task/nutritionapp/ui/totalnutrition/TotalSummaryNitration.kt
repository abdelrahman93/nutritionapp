package com.task.nutritionapp.ui.totalnutrition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.orange.offers.ui.home4g.offerlist.adapter.NutrationAdapter
import com.task.nutritionapp.R
import kotlinx.android.synthetic.main.fragment_total_nutration.*

class TotalSummaryNitration : Fragment() {

    private val args: TotalSummaryNitrationArgs by navArgs()

    private lateinit var adapter: NutrationAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_total_nutration, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }


    private fun initView() {
        tvCalories.text =
            String.format(getString(R.string.total_calories_value), args.nutrationList[0].weight)
        adapter = NutrationAdapter(ArrayList())
        rvNutrationList.adapter = adapter
        adapter.addAll(args.nutrationList)
    }

}
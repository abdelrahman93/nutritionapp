package com.orange.offers.ui.home4g.offerlist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.task.nutritionapp.R
import com.task.nutritionapp.data.model.NutrationListItem
import kotlinx.android.synthetic.main.item_nutration_details.view.*


class NutrationAdapter(private val nutrationList: ArrayList<NutrationListItem>) :
    RecyclerView.Adapter<NutrationAdapter.OfferViewHolder>() {

    override fun getItemCount() = nutrationList.size

    fun addAll(newNutrationList: List<NutrationListItem>) {
        nutrationList.clear()
        nutrationList.addAll(newNutrationList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_nutration_details, parent, false)
        return OfferViewHolder(view)
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        holder.bind(nutrationList[position])
    }

    inner class OfferViewHolder(val rootView: View) : RecyclerView.ViewHolder(rootView) {
        fun bind(nutrationListItem: NutrationListItem) {
            rootView.tvLabel.text = nutrationListItem.label
            rootView.tvWeight.text = nutrationListItem.weight
            rootView.tvDailyPercentage.text =
                String.format("%s %s", nutrationListItem.percentage, "%")

        }
    }
}
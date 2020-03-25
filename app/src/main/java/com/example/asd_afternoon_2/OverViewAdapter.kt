package com.example.asd_afternoon_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class OverViewAdapter : RecyclerView.Adapter<OverViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.hotel_layout,
            parent, false)
        return  ViewHolder(layoutView)
    }

    override fun getItemCount() = 50

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
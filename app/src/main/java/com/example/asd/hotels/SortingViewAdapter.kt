package com.example.asd.hotels

import android.content.Intent
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asd.hotels.dummy.HotelData
import kotlinx.android.synthetic.main.hotel_layout.view.*

class SortingViewAdapter(private val hotel_details: List<HotelData>) :
    RecyclerView.Adapter<SortingViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(
            R.layout.hotel_layout,
            parent, false

        )
        return ViewHolder(layoutView)
    }

    override fun getItemCount() = hotel_details.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hotel_detail = hotel_details[position]
        holder.view.txt_location.text = hotel_detail.hotel_name
        holder.view.txt_price.text = "€ ".plus(hotel_detail.price.toString())
        holder.view.img_hotel.setImageDrawable(
            holder.view.context.getDrawable(hotel_detail.image)
        )
        holder.view.overview_rating.rating = 1.0F;
        holder.view.txt_description.text = hotel_detail.hotel_description;
        holder.view.setOnClickListener { view ->
            Log.d("OverViewAdapter", "clicked!")
            // Callback to the MainActivity
            //overviewClicked.invoke()
            val detail_intent = Intent(view.context, HotelDetailActivity::class.java)
            detail_intent.putExtra("hotel_id", hotel_detail.hotel_id)
            view.context.startActivity(detail_intent)
        }
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
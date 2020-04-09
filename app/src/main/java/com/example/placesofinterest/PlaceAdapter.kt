package com.example.placesofinterest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_place.view.*

public class  PlaceAdapter(private val places: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    lateinit var context: Context

    /*
    * An inner class, called ViewHolder, which extends RecyclerView.ViewHolder is the view holder
    * for this Recyclerview. In the ViewHolder a reference to the TextView is made and a bind method
    * is created which is used to populate the widgets with data from the Place object. In our
    * case, it sets the text from the TextView to the text from the Place name and the image to the
    * Image defined in the arrayList (can find images in drawable folder).
    * */
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(place : Place) {
            itemView.ivPlace.setImageResource(place.imageResId)
            itemView.tvPlace.text = place.name
        }
    }

    /*
    * Called when RecyclerView needs a new RecyclerView.ViewHolder. Here a new
    * ReminderAdapter.ViewHolder object is created using a LayoutInflater which
    * inflates the layout resource file item_place.
    */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    /*
    *  Returns the total number of items in the data set held by the adapter.
    * */
    override fun getItemCount(): Int {
        return places.size
    }

    /*
    * Called by RecyclerView to bind the data with the specified position. The bind method made in
    * the previous step is used.
    */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(places[position])
    }
}

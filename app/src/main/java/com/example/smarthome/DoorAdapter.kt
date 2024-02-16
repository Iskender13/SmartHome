package com.example.smarthome

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DoorAdapter(private val doors: List<String>) : RecyclerView.Adapter<DoorAdapter.DoorViewHolder>() {

    inner class DoorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.tv_door_name)
        var isExpanded: Boolean = false

        init {
            view.setOnClickListener {
                isExpanded = !isExpanded
            }
        }

        fun bind(doorName: String) {
            nameTextView.text = doorName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.door_item, parent, false)
        return DoorViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoorViewHolder, position: Int) {
        holder.bind(doors[position])
    }

    override fun getItemCount() = doors.size
}

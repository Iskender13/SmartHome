package com.example.smarthome

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CameraAdapter(private val mData: List<String>) :
    RecyclerView.Adapter<CameraAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.camera_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val text = mData[position]
        holder.tvCamera.text = text
    }
    override fun getItemCount(): Int {
        return mData.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvCamera: TextView

        init {
            tvCamera = itemView.findViewById<TextView>(R.id.tv_camera)
        }
    }
}


package com.example.smarthome.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.smarthome.CameraAdapter
import com.example.smarthome.R


class cameraFragment : Fragment() {
    private var recyclerView: RecyclerView? = null
    private var adapter: CameraAdapter? = null
    private val dataList: List<String> = mutableListOf("Кухня", "Гостиная", "Спальня")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_camera, container, false)
        recyclerView = view.findViewById(R.id.rc_camera)
        recyclerView?.layoutManager = LinearLayoutManager(activity)
        adapter = CameraAdapter(dataList)
        recyclerView?.adapter = adapter
        return view
    }
}



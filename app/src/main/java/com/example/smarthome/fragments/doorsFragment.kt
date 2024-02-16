package com.example.smarthome.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.smarthome.DoorAdapter
import com.example.smarthome.R

class doorsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: DoorAdapter
    private var doorNames: List<String> = listOf("Подъезд 1", "Подъезд 2", "Подъезд 3")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_doors, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.rc_door)
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = DoorAdapter(doorNames)
        recyclerView.adapter = adapter
    }
}

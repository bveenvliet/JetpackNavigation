package com.example.jetpacknavigation.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.jetpacknavigation.R

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_second, container, false)
        val btnNext = v.findViewById<Button>(R.id.btnNext)
        val tvHelloName = v.findViewById<TextView>(R.id.tvHelloName)

        // fill in name from first fragment
        val safeArgs: SecondFragmentArgs by navArgs()
        tvHelloName.text = safeArgs.name

        // bind buttons to event handler
        btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
            //or
//            Navigation.findNavController(v).navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        return v
    }

}
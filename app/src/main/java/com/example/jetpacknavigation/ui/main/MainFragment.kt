package com.example.jetpacknavigation.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetpacknavigation.R

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val v = inflater.inflate(R.layout.main_fragment, container, false)
        val btnNext = v.findViewById<Button>(R.id.btnNext)
        val etName = v.findViewById<EditText>(R.id.etName)
        btnNext.setOnClickListener {
            // standard way to navigate to another fragment
//            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
            // or if you want to navigate and pass a safe argument
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment(etName.text.toString()))
        }
        return v
    }

}
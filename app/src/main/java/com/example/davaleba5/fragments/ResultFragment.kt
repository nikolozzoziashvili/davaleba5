package com.example.davaleba5.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.davaleba5.R

class ResultFragment : Fragment(R.layout.fragment_result) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val email = ResultFragmentArgs.fromBundle(requireArguments()).email
        val amount = ResultFragmentArgs.fromBundle(requireArguments()).amount
        val button = view.findViewById<Button>(R.id.button2)
        if (email.isNotEmpty() && amount != 0){
            button.visibility=View.VISIBLE
            view.findViewById<TextView>(R.id.textView).text = String.format("Transfer ${amount}$ to ${email}?")
        }
        button.setOnClickListener{
            Toast.makeText(requireActivity(),"Transfer Sucessful!", Toast.LENGTH_SHORT).show()
        }
    }
}
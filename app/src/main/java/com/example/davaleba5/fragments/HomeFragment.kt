package com.example.davaleba5.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.davaleba5.R

class HomeFragment : Fragment(R.layout.fragment_home){
    private lateinit var button: Button
    private lateinit var emaileditText: EditText
    private lateinit var amounteditText: EditText
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button)
        emaileditText = view.findViewById(R.id.editTextTextEmailAddress)
        amounteditText = view.findViewById(R.id.editTextTextAmount)
        navController = Navigation.findNavController((view))
        button.setOnClickListener{

            if (emaileditText.text.toString().isNotEmpty() && amounteditText.text.toString().isNotEmpty()){
                val email = emaileditText.text.toString()
                val amount =  amounteditText.text.toString().toInt()
                val action = HomeFragmentDirections.actionHomeFragmentToResultFragment(email, amount)
                navController.navigate(action)

            }
            else{
                Toast.makeText(requireActivity(), "Please Fill All Forms First!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
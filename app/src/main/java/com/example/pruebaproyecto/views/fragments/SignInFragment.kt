package com.example.pruebaproyecto.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.pruebaproyecto.R

class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    private lateinit var signInButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signInButton = view.findViewById(R.id.signInButton)

        signInButton.setOnClickListener {

            val action = SignInFragmentDirections.actionSignInFragmentToMainPageFragment()

            findNavController().navigate(action)

        }


    }

}
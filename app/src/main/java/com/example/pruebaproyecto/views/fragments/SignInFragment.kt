package com.example.pruebaproyecto.views.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.pruebaproyecto.R
import com.example.pruebaproyecto.views.activity.DetaildActivity

class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    private lateinit var signInButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signInButton = view.findViewById(R.id.signInButton)

        signInButton.setOnClickListener {

            requireActivity().run {
                startActivity(Intent(this, DetaildActivity::class.java))
            }
            //findNavController().navigate(action)
        }


    }

}
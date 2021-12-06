package com.vova.example.myfirstapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView



class aboutFragment : Fragment() {
    lateinit var diceImageView: ImageView
    lateinit var nextActivity: Button
    lateinit var nextActivityButton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        diceImageView = view.findViewById(R.id.imageView)
                val googlelink = Uri.parse("https://jsfiddle.net/sejwkcp5/1/")
                val openBrowserIntent = Intent(Intent.ACTION_VIEW, googlelink)
                val chooser = Intent.createChooser(openBrowserIntent, "Browser")
                startActivity(chooser)

                return view
            }

    }


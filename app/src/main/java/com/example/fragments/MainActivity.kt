package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.fragments.ExampleFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var fragment = ExampleFragment()
//
//        val bundle = Bundle()
//        bundle.putString("keyString", "Fatiq Hussnain")
//        bundle.putInt("keyInt", 20)
//        fragment.arguments = bundle

        fragment = ExampleFragment.newInstance("fatiq hussnain", 20)


        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(null) // Optional: Add this fragment transaction to the back stack
            .commit()


    }
}
package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.fragments.ExampleFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragment = ExampleFragment()

        val bundle = Bundle()
        bundle.putString("keyString", "Fatiq Hussnain")
        bundle.putInt("keyInt", 20)
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .commit()


    }
}
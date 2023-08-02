package com.example.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.fragments.R

class ExampleFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_example2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView: TextView = view.findViewById(R.id.textView2)

        // Get the data from arguments
        arguments?.let {
            val name = it.getString("keyString", "null")
            val age = it.getInt("keyInt", -1)

            textView.text = "$name\n$age"
        }
    }

    companion object {
        fun newInstance(name: String, age: Int): ExampleFragment2 {
            val fragment = ExampleFragment2()
            val bundle = Bundle()
            bundle.putString("keyString", name)
            bundle.putInt("keyInt", age)
            fragment.arguments = bundle
            return fragment
        }
    }
}

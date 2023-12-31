package com.example.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.fragments.R

class ExampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_example, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView: TextView = view.findViewById(R.id.textView)
        val button: Button = view.findViewById(R.id.btnNext)

        // Get the data from arguments
        arguments?.let {
            val name = it.getString("keyString", null)
            val age = it.getInt("keyInt", -1)

            textView.text = "$name\n$age"
        }

        // On button click, navigate to ExampleFragment2
        button.setOnClickListener {
            val fragment2 = ExampleFragment2.newInstance("Ali", 21)
            childFragmentManager
                .beginTransaction()
                .replace(R.id.container2, fragment2)
                .commit()
        }
    }

    companion object {
        fun newInstance(name: String, age: Int): ExampleFragment {
            val fragment = ExampleFragment()
            val bundle = Bundle()
            bundle.putString("keyString", name)
            bundle.putInt("keyInt", age)
            fragment.arguments = bundle
            return fragment
        }
    }
}

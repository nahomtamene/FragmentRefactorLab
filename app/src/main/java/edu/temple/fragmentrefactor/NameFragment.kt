package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class NameFragment: Fragment() {ff

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_name, container, false)

        val displayTextView = view.findViewById<TextView>(R.id.displayTextView)
        val nameEditText = view.findViewById<EditText>(R.id.nameEditText)
        val changeButton = view.findViewById<Button>(R.id.changeButton)

        changeButton.setOnClickListener {
            val name = nameEditText.text.toString()

            displayTextView.text = if (name.isNotBlank()) {
                "Hello, $name!"
            } else {
                "Please enter your name"
            }
        }

        return view
    }
}
package com.example.navigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_question, container, false)

        val username = rootView.findViewById<EditText>(R.id.user_name).toString()
        val age = rootView.findViewById<EditText>(R.id.user_age).toString()
        val btnVerifyDetails = rootView.findViewById<Button>(R.id.submit)
        btnVerifyDetails.setOnClickListener {
            when {
                username.isEmpty() -> {
                    Toast.makeText(activity, "Enter name", Toast.LENGTH_SHORT).show()
                }
                age.isEmpty() -> {
                    Toast.makeText(activity, "Enter age", Toast.LENGTH_SHORT).show()
                }
                else -> {
                  findNavController().navigate(
                      Q
                  )
                }
            }
        }

        return rootView
        // Inflate the layout for this fragment

    }


}
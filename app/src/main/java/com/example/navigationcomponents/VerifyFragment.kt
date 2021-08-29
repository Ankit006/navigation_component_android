package com.example.navigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [VerifyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VerifyFragment : Fragment() {
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
        val name = arguments?.getString("name")
        val age = arguments?.getString("age")
        val rootView = inflater.inflate(R.layout.fragment_verify, container, false)
        rootView.findViewById<TextView>(R.id.name).text = name.toString()
        rootView.findViewById<TextView>(R.id.age).text = age.toString()
        // Inflate the layout for this fragment
        return rootView
    }


}
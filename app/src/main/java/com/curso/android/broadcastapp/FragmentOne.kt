package com.curso.android.broadcastapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class FragmentOne : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Toast.makeText(context,
            "Fragment One attached",
            Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(context,
            "Fragment One created",
            Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Toast.makeText(context,
            "Fragment One view created",
            Toast.LENGTH_SHORT).show()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(context,
            "Fragment One started",
            Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(context,
            "Fragment One resumed",
            Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(context,
            "Fragment One paused",
            Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(context,
            "Fragment One destroyed",
            Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()

        Toast.makeText(context,
            "Fragment One detached",
            Toast.LENGTH_SHORT).show()
    }
}
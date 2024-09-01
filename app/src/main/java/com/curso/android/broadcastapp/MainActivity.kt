package com.curso.android.broadcastapp

import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Register dinamically the broadcast receiver
        val intentFilter: IntentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")
        val airplaneModeReceiver = AirplaneModeReceiver()
        registerReceiver(airplaneModeReceiver, intentFilter)

        val btn1: Button = findViewById(R.id.btn_displayFragment1)
        val btn2: Button = findViewById(R.id.btn_displayFragment2)

        btn1.setOnClickListener {
            loadFragment(FragmentOne())
        }

        btn2.setOnClickListener {
            loadFragment(FragmentTwo())
        }
    }

    fun loadFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager

        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment_layout, fragment)
        fragmentTransaction.commit()
    }
}
package com.example.laboratorio6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentContainer: FragmentContainerView
    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    //private lateinit var button4: Button
    //private lateinit var textSongs: TextView
    //private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.buttonHome);
        button2 = findViewById(R.id.buttonSearch);
        button3 = findViewById(R.id.buttonLibrary);
        //button4 = findViewById(R.id.buttonAdd);
        //textSongs = findViewById(R.id.textViewSongs)

        setListeners()
    }

    private fun setListeners() {
        button.setOnClickListener {
            setFragment(FirstFragment())
        }
        button2.setOnClickListener {
            setFragment(SecondFragment())
        }
        button3.setOnClickListener {
            setFragment(ThirdFragment())
        }
        //button4.setOnClickListener {
            //count++
            //button4.text = count.toString()
        //}
    }

    private fun setFragment(fragment: Fragment){
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragment_Container_mainActivity, fragment)
        }
    }
}
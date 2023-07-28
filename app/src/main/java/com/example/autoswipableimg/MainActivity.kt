package com.example.autoswipableimg

import WalkthroughPagerAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager2
    lateinit var buttonNext: Button
    private lateinit var toolbar: androidx.appcompat.widget.Toolbar
    private lateinit var appTitle: TextView
    private lateinit var applefticon: ImageButton
    private lateinit var apprighticon: ImageButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar_layout)
        appTitle = toolbar.findViewById(R.id.appTitle)
        applefticon = toolbar.findViewById(R.id.leftIcon)
        apprighticon = toolbar.findViewById(R.id.rightIcon)

        appTitle.text = "Main Activity Title"

        applefticon.setOnClickListener {
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
        }

        apprighticon.setOnClickListener {
            Toast.makeText(this, "hello 2", Toast.LENGTH_SHORT).show()
        }



    }
}

/*
  viewPager = findViewById(R.id.viewPager)
        buttonNext = findViewById(R.id.btnnext)

        val adapter = WalkthroughPagerAdapter(this, viewPager)
        viewPager.adapter = adapter
        buttonNext.setOnClickListener {
            val currentItem = viewPager.currentItem
            if (currentItem < adapter.itemCount - 1) {
                viewPager.setCurrentItem(currentItem + 1, true)
            } else {
                Toast.makeText(this, "Reached the end!", Toast.LENGTH_SHORT).show()
            }
        }
 */
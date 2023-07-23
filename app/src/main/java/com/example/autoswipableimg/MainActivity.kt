package com.example.autoswipableimg

import WalkthroughPagerAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager2
    lateinit var buttonNext: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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


    }
}
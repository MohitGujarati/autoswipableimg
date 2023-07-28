package com.example.autoswipableimg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast

class swiptounlock : AppCompatActivity() {

    private lateinit var unlockSeekBar: SeekBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swiptounlock)
        unlockSeekBar = findViewById(R.id.unlockSeekBar)

        unlockSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Not needed for this example
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Not needed for this example
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // When the seek bar reaches the end (100), display a toast message
                if (seekBar.progress == seekBar.max) {
                    Toast.makeText(this@swiptounlock, "Unlocked!", Toast.LENGTH_SHORT).show()
                }
            }
        })

    }
}
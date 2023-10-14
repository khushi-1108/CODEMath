package com.hfad.codemath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var initialVelocityEditText: EditText
    private lateinit var finalVelocityEditText: EditText
    private lateinit var timeEditText: EditText
    private lateinit var calculateAccelerationButton: Button
    private lateinit var accelerationResultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialVelocityEditText = findViewById(R.id.initialVelocityEditText)
        finalVelocityEditText = findViewById(R.id.finalVelocityEditText)
        timeEditText = findViewById(R.id.timeEditText)
        calculateAccelerationButton = findViewById(R.id.calculateAccelerationButton)
        accelerationResultTextView = findViewById(R.id.accelerationResultTextView)

        calculateAccelerationButton.setOnClickListener {
            calculateAcceleration()
        }
    }

    private fun calculateAcceleration() {
        val initialVelocityStr = initialVelocityEditText.text.toString()
        val finalVelocityStr = finalVelocityEditText.text.toString()
        val timeStr = timeEditText.text.toString()

        val initialVelocity = initialVelocityStr.toDouble()
        val finalVelocity = finalVelocityStr.toDouble()
        val time = timeStr.toDouble()

        val acceleration = (finalVelocity - initialVelocity) / time
        accelerationResultTextView.text = "Acceleration: $acceleration m/s²"
    }
}

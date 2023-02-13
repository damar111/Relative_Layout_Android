package com.example.relativelayout_damar_xiirpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class RelativeLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        setSpinnerDay()
        setSpinnerTime()
    }

    private fun setSpinnerTime() {
        val spinnerTime:Spinner = findViewById(R.id.spinner_time)

        ArrayAdapter.createFromResource(
            this,
            R.array.time,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item
        ). also {
            it.setDropDownViewResource(
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item
            )
            spinnerTime.adapter = it
        }
    }


    private fun setSpinnerDay() {
        val spinnerDay:Spinner = findViewById(R.id.spinner_date)

        ArrayAdapter.createFromResource(
            this,
            R.array.day,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item
        ). also {
            it.setDropDownViewResource(
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item
            )
            spinnerDay.adapter = it
        }
    }
}
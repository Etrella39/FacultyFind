package com.example.hackathon

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hackathon.R

class DetailsActivity : AppCompatActivity() {

    lateinit var titleForDetails1: TextView
    lateinit var titleForDetails2: TextView
    lateinit var mainForDetails1: TextView
    lateinit var mainForDetails2: TextView
    lateinit var textViewForDetails1: TextView
    lateinit var textViewForDetails2: TextView
    lateinit var textViewForDetailsMajor1: TextView
    lateinit var textViewForDetailsMajor2: TextView

    lateinit var backButton: RelativeLayout

    lateinit var secondResult: LinearLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_screen)

        secondResult = findViewById(R.id.second_result)

        val majorCount = intent.getIntExtra("Major_Count", Int.MIN_VALUE)

        backButton = findViewById(R.id.back_button_details)

        titleForDetails1 = findViewById(R.id.details_faculty_text)
        mainForDetails1 = findViewById(R.id.result_1)

        titleForDetails1.text = intent.getStringExtra("DETAIL_TEXT_title1")
        mainForDetails1.text = intent.getStringExtra("DETAIL_TEXT_title1")

        textViewForDetails1 = findViewById(R.id.textView_forDetails)
        textViewForDetails1.text = intent.getStringExtra("DETAIL_TEXT1")

        textViewForDetailsMajor1 = findViewById(R.id.detail_faculty)
        textViewForDetailsMajor1.text = intent.getStringExtra("DETAIL_TEXT_Major1")

        if (majorCount == 1) {
            secondResult.visibility = View.GONE
        } else if (majorCount == 2) {
            titleForDetails2 = findViewById(R.id.details_faculty_text_second)
            mainForDetails2 = findViewById(R.id.result_second)

            titleForDetails2.text = intent.getStringExtra("DETAIL_TEXT_title2")
            mainForDetails2.text = intent.getStringExtra("DETAIL_TEXT_title2")

            textViewForDetails2 = findViewById(R.id.textView_forDetails_second)
            textViewForDetails2.text = intent.getStringExtra("DETAIL_TEXT2")

            textViewForDetailsMajor2 = findViewById(R.id.detail_faculty_second)
            textViewForDetailsMajor2.text = intent.getStringExtra("DETAIL_TEXT_Major2")
        }

        backButton.setOnClickListener {
            finish()
        }


    }



}

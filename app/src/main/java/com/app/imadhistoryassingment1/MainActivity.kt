package com.app.imadhistoryassingment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge).text
        val btnGen = findViewById<Button>(R.id.btnGen)
        val btnClear = findViewById<Button>(R.id.btnClear)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnClear.setOnClickListener {
            etAge.clear()
            tvResult.text = ""

        }
        btnGen.setOnClickListener() {

//if the age entered is valid
            val age = etAge.toString().toIntOrNull()
            if (age == null) {
                tvResult.text = " Invalid input . Please enter a valid age "
                return@setOnClickListener
            }


            // if its within the range

            if (age < 20) {
                val person = "There is no person found at that age"
                tvResult.text = "Invalid age $person"
            } else {
                tvResult.text = " Please enter a number between 20 and 100"
            }


            var message = ""

            // famous people in history and the age they died
            val john = 25
            val mozart = 35
            val jane = 41
            val william = 52
            val leonardo = 67
            val albert = 76
            val teresa = 87
            val mandela = 95


            when (age) {
                in 20..30 -> {
                    message = "for $etAge : John keats the famous poet died at the age of $john"
                }

                in 30..40 -> {
                    message =
                        "for $etAge : Wolfgang Amadeus Mozart an Austrian composer died at the age of  $mozart"
                }

                in 40..50 -> {
                    message =
                        "for $etAge : Jane Austen , a well known English Novelist   died at the age of  $jane"
                }

                in 50..60 -> {
                    message =
                        "for $etAge :William Shakespeare, English playwright and a poet who died at the age of  $william"
                }

                in 60..70 -> {
                    message =
                        "for $etAge : Famous painter known for painting the Monalisa , Leonardo da Vinci  died at the age of  $leonardo"
                }

                in 80..90 -> {
                    message =
                        "for $etAge : Mother Mother Teresa Roman Catholic nun who devoted her life to serving the poor and destitute around the world died at the age of  $teresa"
                }

                in 70..80 -> {
                    message =
                        "for $etAge : Albert Einstein , one of the most celebrated scientists of the Twentieth Century who died at the age of  $albert"
                }

                in 90..100 -> {
                    message =
                        "for $etAge : Nelson Mandela was an active member of the fight against apartheid in South Africa  $mandela"
                }

                else -> {
                    tvResult.text =
                        "The Age is not in the range , Please enter number in the range of 20-100"

                }

            }
            tvResult.text = "Your age is $etAge ,The famous person in history is $message"


        }

    }
}




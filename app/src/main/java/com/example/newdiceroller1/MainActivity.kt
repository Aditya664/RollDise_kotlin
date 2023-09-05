package com.example.newdiceroller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{
           rollDise()
        }

    }

    private fun rollDise() {
        val rollResult:TextView = findViewById(R.id.roll_result)

        val randomNumber = Random().nextInt(6)+1;
        rollResult.text  = randomNumber.toString()
    }
}
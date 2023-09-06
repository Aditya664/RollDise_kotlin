package com.example.newdiceroller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random


class MainActivity : AppCompatActivity() {

    lateinit var diceImg:ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{
           rollDise()
        }

    }

//    function to create random numbers
    private fun rollDise() {
        diceImg = findViewById(R.id.dice_img)
        val randomNumber = Random().nextInt(6)+1;
        val dice = when(randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
           else -> R.drawable.dice_6
        }
        diceImg.setImageResource(dice)
    var a:Int=0
    Toast.makeText(this, "Great!! You landed a $randomNumber", Toast.LENGTH_SHORT).show()
    }
}
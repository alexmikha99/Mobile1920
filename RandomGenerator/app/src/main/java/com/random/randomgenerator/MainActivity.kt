

package com.random.randomgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceResult: TextView
    lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceResult=findViewById(R.id.resultText) as TextView
        rollButton=findViewById(R.id.rollButton) as Button
        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Button Pressed", Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() {
        val randomNum=Random().nextInt(2)+0

        if (randomNum == 1){
            diceResult.text="heads"
        }
        else{
            diceResult.text="tails"
        }


    }
}
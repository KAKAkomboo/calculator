package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var inputNumbers: EditText
    lateinit var one:TextView
    lateinit var two:TextView
    lateinit var three:TextView
    lateinit var four:TextView
    lateinit var five:TextView
    lateinit var six:TextView
    lateinit var seven:TextView
    lateinit var eight:TextView
    lateinit var nine:TextView
    lateinit var zero:TextView
    lateinit var plus:TextView
    lateinit var result:TextView
    lateinit var subtract:TextView
    lateinit var multiply:TextView
    lateinit var divide:TextView
    lateinit var delete:TextView
    lateinit var cleanse:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        inputNumbers = findViewById(R.id.inputNumbers)
        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        zero = findViewById(R.id.zero)
        plus = findViewById(R.id.plus)
        result = findViewById(R.id.result)
        subtract = findViewById(R.id.subtract)
        multiply = findViewById(R.id.multiply)
        divide = findViewById(R.id.divide)
        delete = findViewById(R.id.delete)
        cleanse = findViewById(R.id.cleanse)



        one.setOnClickListener{
            inputNumbers.append("1")
        }
        two.setOnClickListener{
            inputNumbers.append("2")
        }
        three.setOnClickListener{
            inputNumbers.append("3")
        }
        four.setOnClickListener{
            inputNumbers.append("4")
        }
        five.setOnClickListener{
            inputNumbers.append("5")
        }
        six.setOnClickListener{
            inputNumbers.append("6")
        }
        seven.setOnClickListener{
            inputNumbers.append("7")
        }
        eight.setOnClickListener{
            inputNumbers.append("8")
        }
        nine.setOnClickListener{
            inputNumbers.append("9")
        }
        zero.setOnClickListener{
            inputNumbers.append("0")
        }
        plus.setOnClickListener{
            inputNumbers.append("+")
        }
        subtract.setOnClickListener {
            inputNumbers.append("-")
        }
        multiply.setOnClickListener {
            inputNumbers.append("*")
        }
        divide.setOnClickListener {
            inputNumbers.append(":")
        }
        delete.setOnClickListener {
            val temp = inputNumbers.text.toString()
            inputNumbers.setText("")
            val test = temp.dropLast(1)
            inputNumbers.setText(test)
        }
        cleanse.setOnClickListener {
            inputNumbers.setText("")
        }
        result.setOnClickListener{
            
        }
    }
}
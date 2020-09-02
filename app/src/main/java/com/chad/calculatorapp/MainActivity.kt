package com.chad.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Number Listeners
        button_00.setOnClickListener { appendOnClick(true, "00") }
        button_0.setOnClickListener { appendOnClick(true, "0") }
        button_1.setOnClickListener { appendOnClick(true, "1") }
        button_2.setOnClickListener { appendOnClick(true, "2") }
        button_3.setOnClickListener { appendOnClick(true, "3") }
        button_4.setOnClickListener { appendOnClick(true, "4") }
        button_5.setOnClickListener { appendOnClick(true, "5") }
        button_6.setOnClickListener { appendOnClick(true, "6") }
        button_7.setOnClickListener { appendOnClick(true, "7") }
        button_8.setOnClickListener { appendOnClick(true, "8") }
        button_9.setOnClickListener { appendOnClick(true, "9") }
        button_dot.setOnClickListener { appendOnClick(true, ".") }

        //Operator Listeners
        plus_button.setOnClickListener { appendOnClick(false, "+") }
        divide_button.setOnClickListener { appendOnClick(false, "/") }
        multiply_button.setOnClickListener { appendOnClick(false, "x") }
        minus_button.setOnClickListener { appendOnClick(false, "-") }
        leftbracket_button.setOnClickListener { appendOnClick(false, "(") }
        rightbracket_button.setOnClickListener { appendOnClick(false, ")") }
        clear_button.setOnClickListener {
            clear()
        }
        button_equal.setOnClickListener {
            calculate()
        }

    }

    //Method
    private fun appendOnClick(clear: Boolean, string: String) {
        if (clear) {
            input_textview.text = ""
            input_textview.append(string)
        }else {
            input_textview.append(output_textview.text)
            output_textview.append(string)
            output_textview.text = ""
        }
    }

    private fun clear() {

          input_textview.text = ""
          output_textview.text = ""

    }

    private fun calculate() {
        try {
            //Expression builder dependency
        }catch (e: Exception) {
            Toast.makeText(this@MainActivity, e.message,Toast.LENGTH_LONG).show()
        }
    }
}
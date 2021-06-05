package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etNum1=findViewById<EditText>(R.id.etNum1)
        var etNum2=findViewById<EditText>(R.id.etNum2)
        var tvResult=findViewById<TextView>(R.id.tvResult)
        var btnPlus=findViewById<Button>(R.id.btnPLus)
        var btnMinus=findViewById<Button>(R.id.btnMinus)
        var btnMultiply=findViewById<Button>(R.id.btnMultiply)
        var btnDivide=findViewById<Button>(R.id.btnDivide)

        btnPlus.setOnClickListener {
            if(etNum1.text.toString()==" " || etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else{
                var num1=etNum1.text.toString().toInt()
                var num2=etNum2.text.toString().toInt()
                var result=num1+num2
                tvResult.text="${result}"
            }
        }
        btnMinus.setOnClickListener {
            if(etNum1.text.toString()==" " || etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else{
                var num1=etNum1.text.toString().toInt()
                var num2=etNum2.text.toString().toInt()
                var result=num1-num2
                tvResult.text="${result}"
            }

        }
        btnMultiply.setOnClickListener {
            if(etNum1.text.toString()==" " || etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else{
                var num1=etNum1.text.toString().toInt()
                var num2=etNum2.text.toString().toInt()
                var result=num1*num2
                tvResult.text="${result}"
            }

        }
        btnDivide.setOnClickListener {
            if(etNum1.text.toString()==" " || etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else{
                var num1=etNum1.text.toString().toInt()
                var num2=etNum2.text.toString().toInt()
                var result=num1/num2
                tvResult.text="${result}"
            }

        }
    }
}
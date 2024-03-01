package com.example.myapplication

import android.annotation.SuppressLint
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var oo: Float = getnum1()
        var aa: Float = getnum2()
        var res: Float = getnum3()
        var jj1 = ""
        val bott1 = findViewById<Button>(R.id.boott)
        val bott2 = findViewById<Button>(R.id.boott2)
        val bott3 = findViewById<Button>(R.id.boott3)
        val bott4 = findViewById<Button>(R.id.boott4)
        val bott5 = findViewById<Button>(R.id.boott5)
        val bott6 = findViewById<Button>(R.id.boott6)
        val bott7 = findViewById<Button>(R.id.boott7)
        val bott8 = findViewById<Button>(R.id.boott8)
        val bott9 = findViewById<Button>(R.id.boott9)
        val bott0 = findViewById<Button>(R.id.boott0)
        val bottpl = findViewById<Button>(R.id.boott10)
        val bottmin = findViewById<Button>(R.id.boott11)
        val botttim = findViewById<Button>(R.id.boott22)
        val bottvid = findViewById<Button>(R.id.boott33)
        val ress = findViewById<TextView>(R.id.text)
        val inp = findViewById<TextView>(R.id.text3)
        val sign = findViewById<TextView>(R.id.text2)
        val remo = findViewById<Button>(R.id.remot)
        val reset = findViewById<Button>(R.id.reset)
        val com = findViewById<Button>(R.id.coma)
        val num2 = findViewById<TextView>(R.id.num2)
        sign.text = getsign()
        inp.text = aa.toString()
        num2.text = oo.toString()
        ress.text = res.toString()





        reset.setOnClickListener() {
            inp.text = "0"
            sign.text = ""
            jj1 = ""
            oo = 0.0F
            ress.text = "0"
            num2.text = "0"
            savenum(0.0F,0.0F,0.0F, "")

        }


        remo.setOnClickListener() {
            oo = jj1.toFloat()
            num2.text = oo.toString()
            inp.text = "0"
            jj1 = ""

        }


        bott1.setOnClickListener() {
            Log.d("myteg", "klick")
            jj1 = jj1 + "1"
            inp.text = jj1
        }

        bott2.setOnClickListener() {
            Log.d("myteg2", "klick2")
            jj1 = jj1 + "2"
            inp.text = jj1
        }

        bott3.setOnClickListener() {
            jj1 = jj1 + "3"
            inp.text = jj1
        }

        bott4.setOnClickListener() {
            jj1 = jj1 + "4"
            inp.text = jj1
        }
        bott5.setOnClickListener() {
            jj1 = jj1 + "5"
            inp.text = jj1
        }
        bott6.setOnClickListener() {
            jj1 = jj1 + "6"
            inp.text = jj1
        }
        bott7.setOnClickListener() {
            jj1 = jj1 + "7"
            inp.text = jj1
        }
        bott8.setOnClickListener() {
            jj1 = jj1 + "8"
            inp.text = jj1
        }
        bott9.setOnClickListener() {
            jj1 = jj1 + "9"
            inp.text = jj1
        }
        bott0.setOnClickListener() {
            jj1 = jj1 + "0"
            inp.text = jj1
        }
        com.setOnClickListener() {
            jj1 = jj1 + "."
            inp.text = jj1

        }
        bottpl.setOnClickListener() {
            aa = jj1.toFloatOrNull()!!
            res = oo + aa
            ress.text = res.toString()
            sign.text = "+"
            savenum(oo,aa,res, "+")

        }
        bottmin.setOnClickListener() {
            aa = jj1.toFloatOrNull()!!
            res = oo - aa
            ress.text = res.toString()
            sign.text = "-"
            savenum(oo,aa,res, "-")
        }
        botttim.setOnClickListener() {
            aa = jj1.toFloatOrNull()!!
            res = oo * aa
            ress.text = res.toString()
            sign.text = "x"
            savenum(oo,aa,res, "x")
        }
        bottvid.setOnClickListener() {
            aa = jj1.toFloatOrNull()!!
            res = oo / aa
            ress.text = res.toString()
            sign.text = "/"
            savenum(oo,aa,res, "/")
        }
    }
    fun savenum(num1:Float, num2: Float, num3:Float, sign: String){
        val sharPref = getSharedPreferences("key1", MODE_PRIVATE)
        val editt = sharPref.edit()
        editt.putFloat("num1", num1)
        editt.putFloat("num2", num2)
        editt.putFloat("num3", num3)
        editt.putString("signn", sign)
        editt.apply()
    }
    fun getnum1(): Float{
        val sharedPref = getSharedPreferences("key1", MODE_PRIVATE)
        val k = sharedPref.getFloat("num1",0.0F)
        return k
    }
    fun getnum2(): Float {
        val sharedPref = getSharedPreferences("key1", MODE_PRIVATE)
        val k = sharedPref.getFloat("num2", 0.0F)
        return k
    }
    fun getnum3(): Float {
        val sharedPref = getSharedPreferences("key1", MODE_PRIVATE)
        val k = sharedPref.getFloat("num3", 0.0F)
        return k
    }
    fun getsign(): String?{
        val sharedPref = getSharedPreferences("key1", MODE_PRIVATE)
        val k = sharedPref.getString("signn","")
        return k
    }
    }
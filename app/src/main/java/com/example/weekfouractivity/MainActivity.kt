package com.example.weekfouractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weekfouractivity.databinding.ActivityMainBinding
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonResult.setOnClickListener{
            val height = binding.editTextHeight.text.toString().toFloat()
            val weight = binding.editTextWeight.text.toString().toFloat()
            cacular(weight,height)
        }
        }
    fun cacular(weight:Float, height:Float){
        val result_bmi:Float = weight/(height*height/10000f)
//        binding.editTextBeforResult.setText(result_bmi.toString())
        var intent:Intent= Intent(this, ResultActivity::class.java)
        intent.putExtra("Result", result_bmi.toString())
        startActivity(intent)
    }
}
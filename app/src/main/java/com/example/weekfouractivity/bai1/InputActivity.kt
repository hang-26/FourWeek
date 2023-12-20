package com.example.weekfouractivity.bai1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.weekfouractivity.R
import com.example.weekfouractivity.ResultActivity
import com.example.weekfouractivity.databinding.ActivityBai2Binding
import com.example.weekfouractivity.databinding.ActivityInputBinding

class InputActivity : AppCompatActivity() {
    var REQUEST_CODE:Int =1
    private lateinit var binding: ActivityInputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonResult.setOnClickListener{
            intent()
        }

    }
//    private inner class HandleClick: View.OnClickListener {
//        override fun onClick(arg0: View) {
//            val height = binding.editTextHeight.text.toString()
//            val weight = binding.editTextWeight.text.toString()
//            var result:Float = weight.toFloat()/(height.toFloat()*height.toFloat()*0.0001f)
////            binding.editTextBeforResult.setText(result.toString())
//            return result
//
//        }
//    }
    fun intent(){
        val height = binding.editTextHeight.text.toString()
        val weight = binding.editTextWeight.text.toString()
        var result:Float = weight.toFloat()/(height.toFloat()*height.toFloat()*0.0001f)
//        binding.editTextBeforResult.setText(result.toString())
        var intent:Intent = Intent(this, ResultActivity2::class.java)
        intent.putExtra("result",result.toString())
        startActivityForResult(intent,REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode== RESULT_OK){
//            binding.editTextBeforResult.setText(d)
        }else{
            binding.editTextBeforResult.setText("không có kết quả")
        }
    }
}
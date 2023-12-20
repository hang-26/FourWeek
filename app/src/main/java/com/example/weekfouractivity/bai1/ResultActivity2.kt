package com.example.weekfouractivity.bai1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.weekfouractivity.R
import com.example.weekfouractivity.databinding.ActivityResult2Binding

class ResultActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityResult2Binding
    val RESULT:String ="return_result"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResult2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var i = intent
        var result2 = i.getStringExtra("result")
        binding.editTexResult.setText(result2)
        binding.buttonBack.setOnClickListener(View.OnClickListener {
            returnRequest()
        })
    }

    private fun returnRequest(){
        var intent2:Intent = Intent()
        intent2.putExtra(RESULT, binding.editTexResult.text.toString())
        setResult(RESULT_OK,intent2)
        finish()
    }



}
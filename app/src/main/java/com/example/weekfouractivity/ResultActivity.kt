package com.example.weekfouractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weekfouractivity.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding:ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var i = intent
        var result = i.getStringExtra("Result")
        binding.editTexResult.setText(result)
        if (result!=null){
            var cate=result.toFloat()
            if (cate<18.5){
                binding.editTextCate.setText("Thiếu cân")
            }
            if (cate.equals(18.51 .. 24.9)  ){
                binding.editTextCate.setText("Khỏe mạnh")
            }
            if (cate.equals(25..30)){
                binding.editTextCate.setText("Thừa cân")
            }
            if (cate>30){
                binding.editTextCate.setText("Béo phì")
            }
        }

    }

}
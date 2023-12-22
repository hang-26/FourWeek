package com.example.weekfouractivity.bai1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.weekfouractivity.R
import com.example.weekfouractivity.databinding.ActivityResult2Binding

class ResultActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityResult2Binding
    companion object {
        val KEY_RESULT:String =""

    }
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityResult2Binding.inflate(layoutInflater)
    setContentView(binding.root)
        result()
        binding.buttonBack.setOnClickListener {
            returnResult()
        }
}
    fun result(){
        var i = intent
        var result2 = i.getStringExtra("result")
        binding.editTexResult.setText(result2)
        if (result2 != null) {
            var cate = result2.toFloat()
            if (cate < 18.5) {
                binding.editTextCate.setText("Thiếu cân")

            }
            else if (cate.equals(18.51..24.9)) {
                binding.editTextCate.setText("Khỏe mạnh")
            }
            else if  (cate.equals(25..30)) {
                binding.editTextCate.setText("Thừa cân")
            }
            else if  (cate > 30) {
                binding.editTextCate.setText("Béo phì")
            }
        }
    }

    fun returnResult(){

                var intent2: Intent = Intent()
                intent2.putExtra(KEY_RESULT, binding.editTexResult.text.toString())
                setResult(RESULT_OK, intent2)
                finish()
            }


}
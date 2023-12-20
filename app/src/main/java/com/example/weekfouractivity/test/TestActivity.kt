package com.example.weekfouractivity.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.weekfouractivity.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding:ActivityTestBinding
    //Tạo riêng Interface
    private val handleClick = object: View.OnClickListener {
        override fun onClick(arg0:View) {
            val btn = arg0 as Button
            val tv = binding.textView2
            tv.setText("Interface " )
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Implement trực tiếp trên Activity
        binding.btnFour.setOnClickListener(this)
        //Sử dụng Anonymous Inner Class
        binding.btnThree.setOnClickListener {
            binding.textView3.setText(" Anonymous Inner Class")
        }
        //Click nút Interface
        binding.btnTwo.setOnClickListener (handleClick)
        //Click nút MemBer Class
        binding.btnOne.setOnClickListener (HandleClick())
    }
    //Implement trực tiếp trên Activity
    override fun onClick(arg0: View) {
        val btn = arg0 as Button
        binding.textView4.setText(" Implement trực tiếp trên Activity")
    }
    //Tạo riêng Member Class
    private inner class HandleClick:View.OnClickListener {
            override fun onClick(arg0: View) {
                val btn = arg0 as Button
                binding.textView1.setText("hhhh")
            }
    }



}
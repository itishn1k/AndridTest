package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            val firstNum = firstEd.text
            val secondNum = secondEd.text
            val math = Math()
            equalsBtn.setOnClickListener {
                resultTv.text = math.add(firstNum.toString(), secondNum.toString())
                Log.e("ololo", resultTv.text.toString())
            }
            divideBtn.setOnClickListener {
                resultTv.text = math.divide(firstNum.toString(), secondNum.toString())
                Log.e("ololo", resultTv.text.toString())
            }
        }
    }
}
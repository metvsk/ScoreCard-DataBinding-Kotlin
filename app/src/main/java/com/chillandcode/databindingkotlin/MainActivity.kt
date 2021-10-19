package com.chillandcode.databindingkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chillandcode.databindingkotlin.databinding.ActivityMainBinding

//SCORE RECORDER


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //this is named after the checking layouts
    // activity_main => the binding will be made by the system as ActivityMainBinding
    private var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        //binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        setContentView(binding.root)

        binding.button.setOnClickListener {
            score++;
            binding.textView.text = score.toString()
        }
    }

//in code lab instead of inflate import androidx.databinding.DataBindingUtil is used to prepare the binding
// but we have not used the library if you want you can add the library by pressing alt+Enter
//https://developer.android.com/codelabs/kotlin-android-training-data-binding-basics#2
}
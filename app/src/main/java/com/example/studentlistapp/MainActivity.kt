package com.example.studentlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studentlistapp.databinding.ActivityMainBinding

//reference where i learned some of what i implemented here
//https://www.geeksforgeeks.org/how-to-implement-recylerview-in-a-fragment-in-android/

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val studentFragmentList = StudentListFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout,studentFragmentList)
            commit()
        }

    }
}
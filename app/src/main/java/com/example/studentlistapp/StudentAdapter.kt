package com.example.studentlistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.studentlistapp.databinding.StudentLayoutBinding
import com.google.android.material.animation.AnimationUtils

class StudentAdapter(private val studentList: List<Student>):RecyclerView.Adapter<StudentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = StudentLayoutBinding.inflate(inflater,parent,false)
        return StudentViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
         holder.bind(studentList[position])
         holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context,studentList[position].name,Toast.LENGTH_SHORT).show()

        }
    }
}
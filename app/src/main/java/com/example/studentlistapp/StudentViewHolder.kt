package com.example.studentlistapp

import androidx.recyclerview.widget.RecyclerView
import com.example.studentlistapp.databinding.StudentLayoutBinding

class StudentViewHolder(private val binding:StudentLayoutBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(student: Student){
        binding.imgViewStudent.setImageResource(student.studentImg)
        binding.txtViewStudentName.text="Student Name: ${student.name}"
        binding.txtViewStudentAge.text="Student Age: ${student.age.toString()}"
        binding.txtViewStudentGrade.text="Student Grade: ${student.grade.toString()}"

    }
}
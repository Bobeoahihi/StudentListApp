package com.example.studentlistapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.studentlistapp.databinding.FragmentStudentListBinding

/**
 * A simple [Fragment] subclass.
 * Use the [StudentListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StudentListFragment : Fragment() {
    private lateinit var binding:FragmentStudentListBinding
    private lateinit var  recycleView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentStudentListBinding.inflate(layoutInflater, container, false)
        //ito magbind nang recycleView sa loob nang fragment
        recycleView = binding.fragRecycleView

        //ito naman sa layout kung pano mabibind
        recycleView.layoutManager = LinearLayoutManager(context)

        //instantiation nang StudentData Class
        val studentData = StudentData()

        //tinawag ko lang list dito from the instantiation
        val studentList =studentData.getStudentData()

        //pagbind nang recycle view together with binded ui and data sa ADAPTER
        recycleView.adapter=StudentAdapter(studentList)
        return binding.root
    }
}


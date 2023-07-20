package com.example.listviewselfprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.listviewselfprojects.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listItem = findViewById<ListView>(R.id.listView)
        val taskList = arrayListOf<String>()
        taskList.add("Clean The Computer Desk")
        taskList.add("Wash The Cloths")
        taskList.add("Go to Shiv Mandir")
        taskList.add("Go For Work out")
        taskList.add("Learn Basic Info About Recycler View")
        taskList.add("Revise All the App Dev Course Material")
        taskList.add("Go For Lunch ")
        taskList.add("Take a Power Nap in Afternoon")
        taskList.add("Do your Regular Stuffs")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1 ,taskList)
        listItem.adapter = adapterForMyListView


        binding.btnImp.setOnClickListener {
            val newIntent = Intent(this, ImportantTask::class.java)
            startActivity(newIntent)
        }



    }
}
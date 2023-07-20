package com.example.listviewselfprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.cardview.widget.CardView

class ImportantTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_important_task)


        val listView1 = findViewById<ListView>(R.id.listView1)
        val listView2 = findViewById<ListView>(R.id.listView2)
        val listView3 = findViewById<ListView>(R.id.listView3)
        val listView4 = findViewById<ListView>(R.id.listView4)

        val ratingButton = findViewById<CardView>(R.id.rating)
        val backButton = findViewById<Button>(R.id.back)

        val taskList1 = arrayListOf<String>()
        taskList1.add("Wash The Cloths")
        taskList1.add("Go to Shiv Mandir")
        taskList1.add("Go For Work out")
        taskList1.add("Go For Lunch ")

        val taskList2 = arrayListOf<String>()
        taskList2.add("Go To Ground")
        taskList2.add("Cook Magiee")
        taskList2.add("GO to Market")
        taskList2.add("Meet With Friends")

        val taskList3 = arrayListOf<String>()
        taskList3.add("Walking 2KM")
        taskList3.add("Go to SuperMarket")
        taskList3.add("Go to Beach ")
        taskList3.add("Do YOGA 30 min")

        val taskList4 = arrayListOf<String>()
        taskList4.add("Go India Gate")
        taskList4.add("Go to Park")
        taskList4.add("Attend Function ")
        taskList4.add("Do Exercise")

        // For ListView1
        val adapterForMyListView1 = ArrayAdapter(this, android.R.layout.simple_list_item_1,taskList1)
        listView1.adapter = adapterForMyListView1

        // For ListView2
        val adapterForMyListView2 = ArrayAdapter(this, android.R.layout.simple_list_item_1,taskList2)
        listView2.adapter = adapterForMyListView2

        //For ListView3
        val adapterForMyListView3 = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList3)
        listView3.adapter = adapterForMyListView3

        val adapterForMyListView4 = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList4)
        listView4.adapter = adapterForMyListView4



        ratingButton.setOnClickListener {
            val intent = Intent(this ,RatingActivity::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            finish()
        }


    }
}
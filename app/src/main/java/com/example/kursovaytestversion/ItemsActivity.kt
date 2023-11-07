package com.example.kursovaytestversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)



        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()



        items.add(Item(1,"bup","паста","As is commonly believed, actively developing third world."," data to the point of complete unrecognizability, which increases their status of uselessness.",360))
        items.add(Item(2,"bup2","паста","As is commonly believed, actively developing third world."," data to the point of complete unrecognizability, which increases their status of uselessness.",360))
        items.add(Item(36,"bup3","паста","As is commonly believed, actively developing third world."," data to the point of complete unrecognizability, which increases their status of uselessness.",360))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}
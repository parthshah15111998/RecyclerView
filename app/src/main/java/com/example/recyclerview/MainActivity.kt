package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rec=findViewById<RecyclerView>(R.id.recycleView)

        var lm: RecyclerView.LayoutManager= LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false )

        rec.layoutManager=lm

        var ad=MyAdapter()
        rec.adapter=ad
    }
}
package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter: RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    var arrimg= arrayOf(R.drawable.heart,R.drawable.heart,R.drawable.heart,R.drawable.heart,R.drawable.heart,R.drawable.heart)
    var artitle= arrayOf("Tom Cruise","Tom Cruise","Tom Cruise","Tom Cruise","Tom Cruise","Tom Cruise")

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
         var img: ImageView
         var title: TextView

        init{
            img=itemView.findViewById(R.id.title_image)
            title=itemView.findViewById(R.id.tv_heading)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.img.setImageResource(arrimg[position])
        holder.title.text=artitle[position]

    }

    override fun getItemCount(): Int {
        return artitle.size
    }
}
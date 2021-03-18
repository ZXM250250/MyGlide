package com.example.myglide

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.myglide.request.MyGlide

class Adapter(val listurl: List<String>,val context: Context):RecyclerView.Adapter<Adapter.ViewHolder>() {


    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val imageView = view.findViewById<ImageView>(R.id.iv_test)

    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.test,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listurl.size
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                    MyGlide
                            .with(context)
                            .load(listurl[position])
                            .into(holder.imageView)
    }
}
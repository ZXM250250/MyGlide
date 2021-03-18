package com.example.myglide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myglide.request.MyGlide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val listurl = mutableListOf<String>()
        for (i in 1..100){
            listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        }
        val adapter = Adapter(listurl,this)
        val layoutManager = LinearLayoutManager(this)
        rv_test.layoutManager = layoutManager
        rv_test.adapter = adapter
    }





}
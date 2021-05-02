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
        val password = "https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpghttps://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpghttps://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg"
        val md5HexStr = MD5.md5(password)
        println("==> MD5 加密前: $password")
        println("==> MD5 加密后: $md5HexStr")
       val listurl = mutableListOf<String>()

          listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")
        listurl.add("https://cdn.pixabay.com/photo/2021/03/10/18/59/rubber-boots-6085292_150.jpg")

           // listurl.add("http://p4.music.126.net/Nf8tJDm5Ue43uygBWNKoZw==/2932397512850647.jpg")
            listurl.add("https://p4.music.126.net/erLrK4N8fg99vHW0fycm6w==/109951163275514708.jpg")


            listurl.add("https://p3.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg")
            listurl.add("https://cdn.pixabay.com/photo/2021/03/22/11/07/stork-6114180_150.jpg")



        val adapter = Adapter(listurl,this)
        val layoutManager = LinearLayoutManager(this)
        rv_test.layoutManager = layoutManager
        rv_test.adapter = adapter
    }





}
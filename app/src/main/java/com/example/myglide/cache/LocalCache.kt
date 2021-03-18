package com.example.myglide.cache

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.myglide.request.BitmapRequest
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream


//本地文件缓存
object LocalCache {

    //从本地读取图片
    fun getBitmapFromLocal(request: BitmapRequest): Bitmap? {
        val filename = request.url.let { it.substring(it.length-20,it.length) }
        val file = File(request.context.filesDir,filename)
        if (file.exists()){
            return BitmapFactory.decodeStream(FileInputStream(file))
        }else{
            return null
        }
    }

            //从网络获取图片后,保存至本地缓存
    fun setBitmapToLocal(request: BitmapRequest, bitmap:Bitmap){

                val filename = request.url.let { it.substring(it.length-20,it.length) }
                val file = File(request.context.filesDir,filename)

                val outputStream = FileOutputStream(file)

                bitmap.compress(Bitmap.CompressFormat.JPEG,100,outputStream)
                outputStream.flush()
                outputStream.close()

            }

}
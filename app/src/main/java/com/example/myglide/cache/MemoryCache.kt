package com.example.myglide.cache

import android.graphics.Bitmap
import androidx.collection.LruCache
import java.lang.ref.SoftReference


//内存缓存
object MemoryCache: LruCache<String, Bitmap>( //一般设置内存大小占系统内存的1/8
        (java.lang.Runtime.getRuntime().maxMemory() / 8).toInt()
) {

     var  softReference:HashMap<String,SoftReference<Bitmap>> =HashMap<String,SoftReference<Bitmap>>()

    // 当有图片从强引用中移除时，将其放进软引用集合中
    override fun entryRemoved(evicted: Boolean, key: String, oldValue: Bitmap, newValue: Bitmap?) {
        if (oldValue != null) {  //移除强引用的再加入软引用
             softReference.put(key, SoftReference(oldValue));
        }
    }


    //获取图片的大小
    override fun sizeOf(key: String, value: Bitmap): Int {
        return value.getRowBytes() * value.getHeight();
    }

    //从内存中去获取图片
    fun getBitmapFromMemory(url:String): Bitmap? {
       var bitmap = get(url);

        if (bitmap!=null){
            return bitmap
        }else{//强引用当中没有的时候 去弱引用找找看
            if (softReference.size>0){
                bitmap = softReference?.get(url) as Bitmap
                if (bitmap != null) {
                    //从内存软引用中获取图片
                    this.put(url, bitmap);
                    //并且加入强引用
                    return bitmap;
                }
            }
        }
        return null
    }



}



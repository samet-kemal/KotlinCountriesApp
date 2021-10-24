package com.samet.kotlincountriesapp.viewmodel.util

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.samet.kotlincountriesapp.R

// Extension oluşrulduğunda fonksiyon
// Yazarken Eklenti yapacağımız sınıfı direk yazabiliriz


/**örneğin aşağıdaki örnekte string sınıfına yeni bir özelik ekledik gibi*/
/***

fun String.myExtension(myParam:String){

println(myParam)

}
 * ***/

fun ImageView.downloadFromUrl(url: String?, progressDrawable: CircularProgressDrawable) {

    val options = RequestOptions()
        .placeholder(progressDrawable)
        .error(R.mipmap.ic_launcher_round)

    Glide.with(context)
        .setDefaultRequestOptions(options)
        .load(url)
        .into(this)

}

fun placeholderProgressBar(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 8f
        centerRadius = 40f
        start()
    }
}
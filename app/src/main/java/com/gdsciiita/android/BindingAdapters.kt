package com.gdsciiita.android

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.gdsciiita.android.constants.MemberType
import com.google.android.material.card.MaterialCardView


//bind to imageView in grid_view_item
@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    imgUrl?.let {
        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        imgView.load(imgUri) {
            transformations(CircleCropTransformation())
        }
    }
}

@BindingAdapter("redirectLink")
fun bindButton(button: Button, redirectLink: String){
    button.setOnClickListener{view->
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(redirectLink))
        button.context.startActivity(intent)
    }
}


@BindingAdapter("borderColor")
fun bindCard(card: MaterialCardView, type: Int){
    var color = when(type) {
        MemberType.APP ->  R.color.blue
        MemberType.WEB -> R.color.green
        MemberType.DESIGN -> R.color.yellow
        MemberType.MANAGEMENT -> R.color.light_blue
        MemberType.AI -> R.color.faint_red
        else -> R.color.black
    }

    card.strokeColor = ContextCompat.getColor(card.context, color)
}


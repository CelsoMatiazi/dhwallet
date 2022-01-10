package com.digitalhouse.dhwallet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.digitalhouse.dhwallet.R
import com.digitalhouse.dhwallet.model.GroupTransaction

class CardItemAdapter(
    private val items: List<GroupTransaction>
    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflator = LayoutInflater.from(parent.context)

        return CardItemContentViewHolder(
            inflator.inflate(
                R.layout.card_item_recycler,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is CardItemContentViewHolder -> holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int = items.size
}


class CardItemContentViewHolder(view: View): RecyclerView.ViewHolder(view){

    private val image : ImageView = view.findViewById(R.id.cardItem_recycler_image)

    fun bind(item: GroupTransaction){
        Glide.with(image.context).load(item.image).into(image);
    }
}



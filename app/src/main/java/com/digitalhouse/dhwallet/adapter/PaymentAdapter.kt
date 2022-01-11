package com.digitalhouse.dhwallet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.digitalhouse.dhwallet.R
import com.digitalhouse.dhwallet.model.GroupTransaction
import com.digitalhouse.dhwallet.model.GroupType

private const val MENU = 0
private const val NAVTITLE = 1
private const val CONTENT = 2


class PaymentAdapter(
    private val items: List<GroupTransaction>
    ): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflator = LayoutInflater.from(parent.context)

        return when(viewType){
            MENU -> PaymentMenuViewHolder(inflator.inflate(R.layout.payment_menu, parent, false))
            NAVTITLE -> PaymentTitleViewHolder(inflator.inflate(R.layout.nav_title_transaction, parent, false))
            else -> PaymentContentViewHolder(inflator.inflate(R.layout.item_transaction, parent, false))
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is PaymentTitleViewHolder -> holder.bindNavPay(items[position])
            is PaymentContentViewHolder -> holder.bind(items[position])
        }
    }


    override fun getItemViewType(position: Int): Int {

        return when (items[position].type) {
            GroupType.NAVTITLE -> NAVTITLE
            GroupType.CONTENT -> CONTENT
            else -> MENU
        }

    }


    override fun getItemCount(): Int = items.size
}


class PaymentContentViewHolder(view: View): RecyclerView.ViewHolder(view){

    private val image : ImageView = view.findViewById(R.id.item_transaction_image)
    private val title : TextView = view.findViewById(R.id.item_transaction_title)
    private val subtitle : TextView = view.findViewById(R.id.item_transaction_subtitle)
    private val value : TextView = view.findViewById(R.id.item_transaction_value)

    fun bind(item: GroupTransaction){
        Glide.with(image.context).load(item.image).circleCrop().into(image);
        title.text = item.title
        subtitle.text = item.subtitle
        value.text = ""
    }
}


class PaymentTitleViewHolder(view: View,) : RecyclerView.ViewHolder(view) {
    private val navTitle: TextView = view.findViewById(R.id.nav_header_transaction_title)
    private val navIcon: ImageView = view.findViewById(R.id.nav_header_transaction_image)

    fun bindNavPay(item: GroupTransaction){
        navTitle.text = item.title
        navIcon.isVisible = false
    }
}

class PaymentMenuViewHolder(view: View,) : RecyclerView.ViewHolder(view)
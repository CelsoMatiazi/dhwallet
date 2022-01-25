package com.digitalhouse.dhwallet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.digitalhouse.dhwallet.R
import com.digitalhouse.dhwallet.model.GroupTransaction
import com.digitalhouse.dhwallet.model.GroupType


private const val HEADER = 0
private const val CONTENT = 1
private const val NAVTITLE = 2

class TransactionAdapter(
    private val items: List<GroupTransaction>,
    private val action : (GroupTransaction) -> Unit,
    private val detailAction: (GroupTransaction) -> Unit

    ): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflator = LayoutInflater.from(parent.context)

        if(viewType == HEADER){
            return HeaderViewHolder(
                inflator.inflate(
                    R.layout.item_header_transaction,
                    parent,
                    false
                )
            )
        }

        if(viewType == NAVTITLE){
            return NavTitleViewHolder(
                inflator.inflate(
                    R.layout.nav_title_transaction,
                    parent,
                    false
                ),
                action
            )
        }

        return TransactionViewHolder(
            inflator.inflate(
                R.layout.item_transaction,
                parent,
                false
            ),

            detailAction
        )
    }



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is HeaderViewHolder ->  holder.bindHeader(items[position].title ?: "DH Wallet")
            is TransactionViewHolder -> holder.bind(items[position])
            is NavTitleViewHolder -> holder.bindNav(items[position])
        }
    }


    override fun getItemViewType(position: Int): Int {
        if(items[position].type == GroupType.TITLE){
            return HEADER
        }

        if(items[position].type == GroupType.NAVTITLE){
            return NAVTITLE
        }

        return CONTENT
    }

    override fun getItemCount(): Int = items.size

}

class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val title: TextView = view.findViewById(R.id.header_transaction_title)
    fun bindHeader(headerTitle: String){
        title.text = headerTitle
    }
}

class TransactionViewHolder(view: View, detailAction: (GroupTransaction) -> Unit): RecyclerView.ViewHolder(view){

    private val image : ImageView = view.findViewById(R.id.item_transaction_image)
    private val title : TextView = view.findViewById(R.id.item_transaction_title)
    private val subtitle : TextView = view.findViewById(R.id.item_transaction_subtitle)
    private val value : TextView = view.findViewById(R.id.item_transaction_value)
    private var currentContent: GroupTransaction? = null

    init {
        view.setOnClickListener {
            currentContent?.let{
             detailAction.invoke(it)
            }
        }
    }



    fun bind(item: GroupTransaction){
        Glide.with(image.context).load(item.image).circleCrop().into(image)
        title.text = item.title
        subtitle.text = item.subtitle
        value.text = item.value
        currentContent = item
    }
}

class NavTitleViewHolder(view: View, action : (GroupTransaction) -> Unit) : RecyclerView.ViewHolder(view) {
    private val navTitle: TextView = view.findViewById(R.id.nav_header_transaction_title)
    private val icon: ImageView = view.findViewById(R.id.nav_header_transaction_image)
    private var currentItem: GroupTransaction? = null

    init {
        icon.setOnClickListener {
            currentItem?.let {
                action.invoke(it)
            }
        }
    }

    fun bindNav(item: GroupTransaction){
        navTitle.text = item.title
        currentItem = item
    }
}

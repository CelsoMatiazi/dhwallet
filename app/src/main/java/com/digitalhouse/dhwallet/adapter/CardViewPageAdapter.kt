package com.digitalhouse.dhwallet.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder
import com.bumptech.glide.Glide.init
import com.digitalhouse.dhwallet.HomeCardItemFragment
import com.digitalhouse.dhwallet.model.Card

class CardViewPageAdapter(
    fragment: Fragment,
    private val items: List<Card>,
    private val action: (cardItem: Card) -> Unit
    ): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = items.size

    override fun createFragment(position: Int): Fragment {
        if(items.isEmpty()){
            throw IllegalStateException("Items are empty")
        }

        return items[position].run {
            HomeCardItemFragment.newInstance(
                limit,
                brand,
                number,
                name,
                expireAt,
                background
            )
        }
    }

    override fun onBindViewHolder(
        holder: FragmentViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        super.onBindViewHolder(holder, position, payloads)

        holder.itemView.setOnClickListener {action.invoke(items[position])}
    }
}
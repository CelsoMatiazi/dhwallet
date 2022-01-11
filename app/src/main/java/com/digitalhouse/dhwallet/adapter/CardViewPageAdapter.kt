package com.digitalhouse.dhwallet.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder

class CardViewPageAdapter(
    fragment: Fragment,
    private val items: List<Fragment>,
    private val action: () -> Unit
    ): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = items.size

    override fun createFragment(position: Int): Fragment {
        if(items.isEmpty()){
            throw IllegalStateException("Items are empty")
        }

        return items[position]
    }

    override fun onBindViewHolder(
        holder: FragmentViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        super.onBindViewHolder(holder, position, payloads)
        holder.itemView.setOnClickListener {action.invoke()}
    }
}
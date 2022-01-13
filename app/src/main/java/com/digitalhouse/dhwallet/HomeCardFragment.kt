package com.digitalhouse.dhwallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.digitalhouse.dhwallet.adapter.CardViewPageAdapter
import com.digitalhouse.dhwallet.adapter.TransactionAdapter
import com.digitalhouse.dhwallet.data_mock.DataMock
import com.digitalhouse.dhwallet.model.Card
import com.digitalhouse.dhwallet.util.CustomPageTransformer
import com.digitalhouse.dhwallet.util.decorator.HorizontalMarginItemDecoration


class HomeCardFragment : Fragment(R.layout.fragment_home_card) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listCards = listOf(
            Card(
                limit = "R$ 100.00",
                brand = R.drawable.ic_visa,
                number = "1234",
                name = "Ze da Silva",
                expireAt = "05/23",
                background = R.drawable.background_home_card3
            ),
            Card(
                limit = "R$ 55.55",
                brand = R.drawable.ic_visa,
                number = "5432",
                name = "Ze da Silva",
                expireAt = "06/22",
                background = R.drawable.background_home_card
            ),
            Card(
                limit = "R$ 20.55",
                brand = R.drawable.ic_visa,
                number = "8767",
                name = "Ze da Silva",
                expireAt = "12/25",
                background = R.drawable.background_home_card2
            )
        )

        val viewPager = view.findViewById<ViewPager2>(R.id.list_card)
        viewPager.adapter = CardViewPageAdapter(this, listCards){
            sendToDetail(it)
        }

        viewPager.addItemDecoration(
            HorizontalMarginItemDecoration(
                view.context,
                R.dimen.viewpager_current_item_horizontal_margin
            )
        )

        viewPager.setPageTransformer(CustomPageTransformer(view.context))
        viewPager.offscreenPageLimit = 1

        val recycler = view.findViewById<RecyclerView>(R.id.homeCard_recycler)
        recycler.adapter = TransactionAdapter(DataMock().dataTransHomeCard()){
            sendToTransaction()
        }

    }


    private fun sendToTransaction(){

        val action = HomeCardFragmentDirections
            .actionHomeCardFragmentToTransactionFragment(
                "R$ 50.00",
                "R$ 678.00"
            )

        findNavController().navigate(action)
    }

    private fun sendToDetail(card: Card){

        val action = HomeCardFragmentDirections
            .actionHomeCardFragmentToCardItemFragment(card)

        findNavController().navigate(action)
    }


}
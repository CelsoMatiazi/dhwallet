package com.digitalhouse.dhwallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.digitalhouse.dhwallet.adapter.CardViewPageAdapter
import com.digitalhouse.dhwallet.adapter.TransactionAdapter
import com.digitalhouse.dhwallet.data_mock.DataMock
import com.digitalhouse.dhwallet.util.CustomPageTransformer
import com.digitalhouse.dhwallet.util.decorator.HorizontalMarginItemDecoration


class HomeCardFragment : Fragment(R.layout.fragment_home_card) {



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listCards: List<Fragment> = mutableListOf(
            HomeCardItemFragment.newInstance(
                "R$ 100.00",
                R.drawable.ic_visa,
                "1234",
                "Ze da Silva",
                "05/23",
                R.drawable.background_home_card3
            ),
            HomeCardItemFragment.newInstance(
                "R$ 55.55",
                R.drawable.ic_visa,
                "5432",
                "Ze da Silva",
                "06/22",
                R.drawable.background_home_card
            ),
            HomeCardItemFragment.newInstance(
                "R$ 20.55",
                R.drawable.ic_visa,
                "8767",
                "Ze da Silva",
                "12/25",
                R.drawable.background_home_card2
            )
        )



        val viewPager = view.findViewById<ViewPager2>(R.id.list_card)
        viewPager.adapter = CardViewPageAdapter(this, listCards){
            //TODO ir para a tela de detalhe quando clicar no cartao
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
            //TODO click on item
        }

    }


}
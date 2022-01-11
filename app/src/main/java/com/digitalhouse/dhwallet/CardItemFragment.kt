package com.digitalhouse.dhwallet
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.CardItemAdapter
import com.digitalhouse.dhwallet.data_mock.DataMock

class CardItemFragment : Fragment(R.layout.fragment_card_item) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerCardItem = view.findViewById<RecyclerView>(R.id.cardItem_recycler_1)
        recyclerCardItem.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerCardItem.adapter = CardItemAdapter(DataMock().dataCardItemOfertas())


        val recyclerCardItem2 = view.findViewById<RecyclerView>(R.id.cardItem_recycler_2)
        recyclerCardItem2.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerCardItem2.adapter = CardItemAdapter(DataMock().dataCardItemDescontos())
    }

}
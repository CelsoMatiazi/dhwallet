package com.digitalhouse.dhwallet
import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.CardItemAdapter
import com.digitalhouse.dhwallet.data_mock.DataMock

class CardItemFragment : Fragment(R.layout.fragment_card_item) {


    private val cardItemValue: CardItemFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerCardItem = view.findViewById<RecyclerView>(R.id.cardItem_recycler_1)
        recyclerCardItem.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerCardItem.adapter = CardItemAdapter(DataMock().dataCardItemOfertas())


        val recyclerCardItem2 = view.findViewById<RecyclerView>(R.id.cardItem_recycler_2)
        recyclerCardItem2.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerCardItem2.adapter = CardItemAdapter(DataMock().dataCardItemDescontos())



        val btnTransferir = view.findViewById<ImageView>(R.id.cardItem_icon_1)
        val btnTransacoes = view.findViewById<ImageView>(R.id.cardItem_icon_2)
        val btnPagamentos = view.findViewById<ImageView>(R.id.cardItem_icon_3)

        val limit = view.findViewById<TextView>(R.id.cardItem_value)
        val cardNumber = view.findViewById<TextView>(R.id.cardItem_cardNumber4)

        limit.text = cardItemValue.argLimite
        cardNumber.text = cardItemValue.argCardNumber

        btnTransferir.setOnClickListener{
            sendToTransfer().apply {
                enterTransition = Slide(Gravity.END)
                exitTransition = Slide(Gravity.START)
            }
        }

        btnTransacoes.setOnClickListener{
            sendToTransaction().apply {
                enterTransition = Slide(Gravity.END)
                exitTransition = Slide(Gravity.START)
            }
        }

        btnPagamentos.setOnClickListener{
            sendToPayment().apply {
                enterTransition = Slide(Gravity.END)
                exitTransition = Slide(Gravity.START)
            }
        }

    }


    private fun sendToTransfer(){
        findNavController().navigate(R.id.action_cardItemFragment_to_transferFragment)
    }

    private fun sendToTransaction(){
        findNavController().navigate(R.id.action_cardItemFragment_to_transactionFragment)
    }

    private fun sendToPayment(){
        findNavController().navigate(R.id.action_cardItemFragment_to_paymentFragment)
    }

}
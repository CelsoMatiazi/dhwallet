package com.digitalhouse.dhwallet

import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.TransactionAdapter
import com.digitalhouse.dhwallet.data_mock.DataMock

class TransactionFragment : Fragment(R.layout.fragment_transaction) {


    private val transactionValues: TransactionFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Toolbar>(R.id.toolbar_transaction)
            .setNavigationOnClickListener { activity?.onBackPressed() }

        val recycler = view.findViewById<RecyclerView>(R.id.recycler_transaction)

        recycler.adapter = TransactionAdapter(DataMock().dataTransaction(),{}) {

            sendToTransfer().apply {
                    enterTransition = Slide(Gravity.END)
                    exitTransition = Slide(Gravity.START)
            }

        }

        val entrada = view.findViewById<TextView>(R.id.tv_transaction_entradasValue)
        val saida = view.findViewById<TextView>(R.id.tv_transaction_saidasValue)

        entrada.text = transactionValues.argEntrada
        saida.text = transactionValues.argSaida

    }

    private fun sendToTransfer(){
        findNavController().navigate(R.id.action_transactionFragment_to_transferFragment)
    }
}

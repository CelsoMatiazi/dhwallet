package com.digitalhouse.dhwallet

import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.TransactionAdapter
import com.digitalhouse.dhwallet.data_mock.DataMock

class TransactionFragment : Fragment(R.layout.fragment_transaction) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.recycler_transaction)

        recycler.adapter = TransactionAdapter(DataMock().dataTransaction()) {


            sendToTransfer().apply {
                    enterTransition = Slide(Gravity.END)
                    exitTransition = Slide(Gravity.START)
            }

        }

    }

    private fun sendToTransfer(){
        findNavController().navigate(R.id.action_transactionFragment_to_transferFragment)
    }
}

package com.digitalhouse.dhwallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.ContactAdapter
import com.digitalhouse.dhwallet.adapter.PaymentAdapter
import com.digitalhouse.dhwallet.data_mock.DataMock


class PaymentFragment : Fragment(R.layout.fragment_payment) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerPay = view.findViewById<RecyclerView>(R.id.recycler_payment)
        recyclerPay.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)

        recyclerPay.adapter = PaymentAdapter(DataMock().dataPayment())
    }

}
package com.digitalhouse.dhwallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.ContactAdapter
import com.digitalhouse.dhwallet.data_mock.DataMock


class TransferFragment : Fragment(R.layout.fragment_transfer){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Toolbar>(R.id.toolbar)
            .setNavigationOnClickListener { activity?.onBackPressed() }

        val recycler = view.findViewById<RecyclerView>(R.id.recycler_transfer)
        //recycler.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)

        recycler.adapter = ContactAdapter(DataMock().dataFriends())

    }
}

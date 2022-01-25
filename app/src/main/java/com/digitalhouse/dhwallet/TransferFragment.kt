package com.digitalhouse.dhwallet

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.dhwallet.adapter.ContactAdapter
import com.digitalhouse.dhwallet.data_mock.DataMock



class TransferFragment : Fragment(R.layout.fragment_transfer){

    val permissionResultCallback = registerForActivityResult(
        ActivityResultContracts.RequestPermission()){
        if(it){
            Toast.makeText(requireContext(), "Premission Granted", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(requireContext(), "Premission denied", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Toolbar>(R.id.toolbar)
            .setNavigationOnClickListener { activity?.onBackPressed() }

        val recycler = view.findViewById<RecyclerView>(R.id.recycler_transfer)
        //recycler.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)

        recycler.adapter = ContactAdapter(DataMock().dataFriends())

        val readCode = view.findViewById<CardView>(R.id.transfer_qrCode)

        readCode.setOnClickListener{
            val permission = ContextCompat.checkSelfPermission(it.context, Manifest.permission.CAMERA)
            if(permission != PackageManager.PERMISSION_GRANTED){
                permissionResultCallback.launch(Manifest.permission.CAMERA)
            }else{
                Toast.makeText(requireContext(), "Premission Granted", Toast.LENGTH_SHORT).show()
            }
        }
    }
    
}

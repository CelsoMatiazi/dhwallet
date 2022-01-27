package com.digitalhouse.dhwallet

import android.Manifest
import android.app.AlertDialog
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.util.Log
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
import com.digitalhouse.dhwallet.util.SaveFile


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

        recycler.adapter = ContactAdapter(DataMock().dataFriends()){ contact ->
            dialogShareView(contact.context, contact)
        }

        val readCode = view.findViewById<CardView>(R.id.transfer_qrCode)

        readCode.setOnClickListener{

            //permissão para acesso a camera
//            val permission = ContextCompat.checkSelfPermission(it.context, Manifest.permission.CAMERA)
//            if(permission != PackageManager.PERMISSION_GRANTED){
//                permissionResultCallback.launch(Manifest.permission.CAMERA)
//            }else{
//                Toast.makeText(requireContext(), "Premission Granted", Toast.LENGTH_SHORT).show()
//            }


            //compartilhando a tela toda
//            printScreen(view)?.let {
//                SaveFile(requireActivity(), it).saveAndShare()
//            }

            //compartilando apenas o botao "ler codigo"
//            printScreen(it)?.let {
//                SaveFile(requireActivity(), it).saveAndShare()
//            }
        }
    }


    private fun dialogShareView(context: Context, view: View) {
        val items = arrayOf("Sim", "Não")
        AlertDialog
            .Builder(context)
            .setTitle("Você deseja comprtilhar o contato?")
            .setItems(items) { dialog, index ->
                when (index) {
                    0 -> {
                        printScreen(view)?.let {
                            SaveFile(requireActivity(), it).saveAndShare()
                        }
                    }
                    1 -> dialog.dismiss()
                }
                dialog.dismiss()
            }.show()
    }


    private fun printScreen(view: View): Bitmap? {
        var screen: Bitmap? = null
        try{
            screen = Bitmap.createBitmap(view.measuredWidth, view.measuredHeight, Bitmap.Config.ARGB_8888)
            val canvas = Canvas(screen)
            view.draw(canvas)
        } catch (e: Exception){
            Log.e("IMAGE_ERROR", e.message.toString())
        }

        return screen
    }
    
}

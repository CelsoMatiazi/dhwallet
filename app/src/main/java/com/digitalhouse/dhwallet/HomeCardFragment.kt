package com.digitalhouse.dhwallet

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.digitalhouse.dhwallet.adapter.CardViewPageAdapter
import com.digitalhouse.dhwallet.adapter.TransactionAdapter
import com.digitalhouse.dhwallet.data_mock.DataMock
import com.digitalhouse.dhwallet.model.Card
import com.digitalhouse.dhwallet.util.CustomPageTransformer
import com.digitalhouse.dhwallet.util.decorator.HorizontalMarginItemDecoration
import kotlinx.android.synthetic.main.fragment_transaction.*


class HomeCardFragment : Fragment(R.layout.fragment_home_card) {

    private lateinit var userImage: ImageView

    val permissionResultCallback = registerForActivityResult(
        ActivityResultContracts.RequestPermission()){
        if(it){
            Toast.makeText(requireContext(), "Premission Granted", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(requireContext(), "Premission Denied *", Toast.LENGTH_SHORT).show()
        }
    }

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
        recycler.adapter = TransactionAdapter(DataMock().dataTransHomeCard(), {
            sendToTransaction()
        },{
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, getString(
                    R.string.share_transaction,
                    it.title,
                    it.subtitle,
                    it.value)
                )
                type = "text/plain"
            }
            startActivity(Intent.createChooser(sendIntent, "Compartilhando Contato"))
        })


       userImage = view.findViewById(R.id.user_img_home)

        userImage.setOnClickListener{
            val permission = ContextCompat.checkSelfPermission(it.context, Manifest.permission.READ_EXTERNAL_STORAGE)
            if(permission != PackageManager.PERMISSION_GRANTED){
                permissionResultCallback.launch(Manifest.permission.READ_EXTERNAL_STORAGE)
            }else{
                Toast.makeText(requireContext(), "Premission Granted", Toast.LENGTH_SHORT).show()
                getUserPhoto()
            }
        }

    }

    private fun getUserPhoto(){
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        getResult.launch(intent)
    }

    private val getResult = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == Activity.RESULT_OK){
            userImage.setImageURI(it.data?.data)
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
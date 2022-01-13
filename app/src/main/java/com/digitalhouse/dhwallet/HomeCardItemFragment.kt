package com.digitalhouse.dhwallet

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment


private const val ARG_LIMITE = "arg_limite"
private const val ARG_BANDEIRA = "arg_bandeira"
private const val ARG_NUMERO = "arg_numero"
private const val ARG_NOME = "arg_nome"
private const val ARG_VALIDADE = "arg_validade"
private const val ARG_BG = "arg_bg"


class HomeCardItemFragment : Fragment(R.layout.home_card) {

    private var limite: String? = null
    private var bandeira: Int? = null
    private var numero: String? = null
    private var nome: String? = null
    private var validade: String? = null
    private var bg: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            limite = it.getString(ARG_LIMITE)
            bandeira = it.getInt(ARG_BANDEIRA)
            numero = it.getString(ARG_NUMERO)
            nome = it.getString(ARG_NOME)
            validade = it.getString(ARG_VALIDADE)
            bg = it.getInt(ARG_BG)
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val limiteView = view.findViewById<TextView>(R.id.homeCard_value)
        val bandeiraView = view.findViewById<ImageView>(R.id.homeCard_bandeira)
        val numeroView = view.findViewById<TextView>(R.id.homeCard_cardNumber4)
        val nomeView = view.findViewById<TextView>(R.id.homeCard_nome_value)
        val validadeView = view.findViewById<TextView>(R.id.homeCard_validade)
        val bgView = view.findViewById<ConstraintLayout>(R.id.homeCard_main)



        limite?.let { limiteView.text = it }
        bandeira?.let { bandeiraView.setImageResource(it)  }
        numero?.let { numeroView.text = it }
        nome?.let { nomeView.text = it }
        validade?.let { validadeView.text = it }
        bg?.let { bgView.setBackgroundResource(it)}
    }

    companion object {
        fun newInstance(
            limite: String,
            @DrawableRes bandeira: Int,
            numero: String,
            nome: String,
            validade: String,
            @DrawableRes bg: Int
        ) =
            HomeCardItemFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_LIMITE, limite)
                    putInt(ARG_BANDEIRA, bandeira)
                    putString(ARG_NOME, nome)
                    putString(ARG_VALIDADE, validade)
                    putString(ARG_NUMERO, numero)
                    putInt(ARG_BG, bg)
                }
            }
    }
}
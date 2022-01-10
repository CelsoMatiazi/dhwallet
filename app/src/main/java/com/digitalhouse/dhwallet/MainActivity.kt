package com.digitalhouse.dhwallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction()
//            .replace(R.id.fragment_container,
//                TransactionFragment.newInstance(
//                    "R$ 45,35",
//                    "R$ 536"
//                )
//            )
//            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,
                CardItemFragment()
            )
            .commit()

    }

}

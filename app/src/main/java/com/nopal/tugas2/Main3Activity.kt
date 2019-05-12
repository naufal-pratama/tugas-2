package com.nopal.tugas2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        ambilData()
    }

    private fun  ambilData(){
        val bundle = intent.extras

        val nama   = bundle?.getString( "nama")


        txtName.text = nama
    }
}

package com.nopal.tugas2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var usernameInput: String = ""
    var passwordInput: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSave.setOnClickListener {
            validasiInput()
        }
    }

    private fun validasiInput() {
        usernameInput = edtName.text.toString()
        passwordInput = edtpasswd.text.toString()

        when {

            usernameInput.isEmpty() -> edtName.error = "username tidak boleh kosong"
            passwordInput.isEmpty() -> edtpasswd.error = "password tidak boleh kosong"

            else -> {

                tampilToast("akun berhasil dibuat")
                navigasiKeProfilDiri()

            }
        }

    }

    private fun navigasiKeProfilDiri() {

        val intent = Intent(this, Main2Activity::class.java)

        val bundle = Bundle()
        bundle.putString("nama", usernameInput)
        bundle.putString("password", passwordInput)

        intent.putExtras(bundle)

        startActivity(intent)

    }

    private fun tampilToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

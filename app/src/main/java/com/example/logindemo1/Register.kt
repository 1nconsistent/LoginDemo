package com.example.logindemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    lateinit var handler:DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        handler= DatabaseHelper(this)


        Save.setOnClickListener {
            handler.insertUserData(name.text.toString(), email.text.toString(), password_register.text.toString())
            val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
        }
    }
}



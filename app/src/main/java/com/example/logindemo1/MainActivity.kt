package com.example.logindemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {

    lateinit var handler: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler = DatabaseHelper(this)


        LoginButton.setOnClickListener {
            if (handler.userPresent(Loginemail.text.toString(), Loginpass.text.toString())) {
                Toast.makeText(this, "You have Successfully Logged In", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginReturn::class.java)
                startActivity(intent)
            } else
                Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()


        }
        Registration.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)

        }


    }

}

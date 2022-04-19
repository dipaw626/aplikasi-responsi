package com.mobile.aplikasiresponsi.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mobile.aplikasiresponsi.R
import com.mobile.aplikasiresponsi.home.HomeActivity
import com.mobile.aplikasiresponsi.login.LoginActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var backRegist: Button
    private lateinit var btnRegist: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        backRegist = findViewById(R.id.backRegist)
        btnRegist = findViewById(R.id.btnregist)

        backRegist.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        btnRegist.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
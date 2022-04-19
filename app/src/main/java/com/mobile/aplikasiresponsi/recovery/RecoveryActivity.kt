package com.mobile.aplikasiresponsi.recovery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mobile.aplikasiresponsi.R
import com.mobile.aplikasiresponsi.home.HomeActivity
import com.mobile.aplikasiresponsi.login.LoginActivity

class RecoveryActivity : AppCompatActivity() {

    private lateinit var backRecovery: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        backRecovery = findViewById(R.id.backRecovery)
        backRecovery.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}
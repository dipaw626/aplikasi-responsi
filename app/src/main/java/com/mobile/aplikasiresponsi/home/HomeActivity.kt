package com.mobile.aplikasiresponsi.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.mobile.aplikasiresponsi.R

class HomeActivity : AppCompatActivity() {

    private lateinit var btnHome: Button
    private lateinit var btnPayment: Button
    private lateinit var btnHistory: Button
    private lateinit var btnSetting: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnHome = findViewById(R.id.btnHome)
        btnPayment = findViewById(R.id.btnPayment)
        btnHistory = findViewById(R.id.btnHistory)
        btnSetting = findViewById(R.id.btnSetting)


        btnHome.setOnClickListener{
            loadFragment(HomeFragment())
        }
        btnPayment.setOnClickListener{
            loadFragment(PaymentFragment())
        }
        btnHistory.setOnClickListener{
            loadFragment(HistoryFragment())
        }
        btnSetting.setOnClickListener{
            loadFragment(SettingFragment())
        }
    }

    private  fun  loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }

}
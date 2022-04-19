package com.mobile.aplikasiresponsi.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.mobile.aplikasiresponsi.R
import com.mobile.aplikasiresponsi.home.HomeActivity
import com.mobile.aplikasiresponsi.recovery.RecoveryActivity
import com.mobile.aplikasiresponsi.register.RegisterActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var forgotpass: TextView
    private lateinit var register: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btnlogin)
        forgotpass = findViewById(R.id.tvrecoverpass)
        register = findViewById(R.id.tvregisteracc)


        btnLogin.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        forgotpass.setOnClickListener{
            val intent = Intent(this, RecoveryActivity::class.java)
            startActivity(intent)
        }
        register.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

//        title ="Menu Login"
//        val email = findViewById<EditText>(R.id.etemail)
//        val pass = findViewById<EditText>(R.id.etpass)
//        val btnlogin = findViewById<Button>(R.id.btnlogin)
//
//        btnlogin.setOnClickListener{
//            val bundle = Bundle()
//            bundle.putString("email" , email.text.toString())
//
//            if(!Patterns.EMAIL_ADDRESS.matcher(email.text,toString()).matches()) {
//                email.error = "Masukkan Email dengan Benar"
//            }
//            else if (pass.length() == 0){
//                pass.error = "Password tidak boleh kosong"
//            }
//            else {
//                val alertDialogBuilder = AlertDialog.Builder(this)
//                alertDialogBuilder.setTitle("Peringatan..!!")
//                alertDialogBuilder.setMessage("Apakah Data Anda Sudah Benar..?")
//                    .setCancelable(false)
//                    .setPositiveButton("Yes") {
//                            dialogInterface, i ->
//                        val intent = Intent(this, HomeActivity::class.java)
//                        intent.putExtras(bundle)
//                        startActivity(intent)
//                        Toast.makeText(this, "Anda Berhasil Login", Toast.LENGTH_SHORT).show()
//                    }
//                    .setNegativeButton("No") {
//                            dialogInterface, i -> dialogInterface.cancel()
//                    }
//                val alertDialog = alertDialogBuilder.create()
//                alertDialog.show()
//            }
//        }

    }
}
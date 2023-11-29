package com.dicoding.lawmate.ui.authentication.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.lawmate.MainActivity
import com.dicoding.lawmate.R
import com.dicoding.lawmate.databinding.ActivityLoginBinding
import com.dicoding.lawmate.ui.authentication.registration.RegistrationActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnProsesMasuk.setOnClickListener{
            startActivity(Intent(applicationContext, MainActivity::class.java))

        }

        binding.tvRegist.setOnClickListener{
            startActivity(Intent(applicationContext, RegistrationActivity::class.java))
        }
    }
}
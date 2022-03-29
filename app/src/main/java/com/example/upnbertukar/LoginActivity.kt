package com.example.upnbertukar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.upnbertukar.databinding.ActivityLoginBinding
import com.example.upnbertukar.placeholder.DummyProfile

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val userId = DummyProfile.getUserID()

    private val userPassword = DummyProfile.getUserPassword()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        with(binding){
            btnLogin.setOnClickListener {
                if (txtId.text.toString() == userId && txtPass.text.toString() == userPassword) {
                    val intent = Intent(this@LoginActivity,MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}
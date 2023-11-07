package com.example.walmartlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignupActivity : AppCompatActivity() {

    lateinit var newAccountBtn: Button
    var fnEditText: EditText? = null
    var lnEditText: EditText? = null
    var emailEditText: EditText? = null
    var pwEditText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        fnEditText = findViewById(R.id.fn)
        lnEditText = findViewById(R.id.ln)
        emailEditText = findViewById(R.id.email)
        pwEditText = findViewById(R.id.pw)

        newAccountBtn = findViewById(R.id.createAccountBtn)
        newAccountBtn.setOnClickListener { createAccount() }
    }

    fun createAccount(){
        val fnText = fnEditText?.text.toString() ?: ""
        val lnText = lnEditText?.text.toString() ?: ""
        val emailText = emailEditText?.text.toString() ?: ""
        val pwText = pwEditText?.text.toString() ?: ""

        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("user", User(fnText, lnText, emailText, pwText))
        startActivity(intent)
    }
}
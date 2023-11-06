package com.example.walmartlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var signInBtn: Button
    lateinit var newAccountBtn: Button
    var emailEditText: EditText? = null
    var passwordEditText: EditText? = null

    private val userList = arrayOf(
        User("Alex", "Cho", "alex@gmail.com", "123456789"),
        User("Bob", "Kot", "bob@gmail.com", "123456789"),
        User("Lyn", "Kim", "lyn@gmail.com", "123456789"),
        User("Chrome", "Lo", "choen@gmail.com", "123456789"),
        User("Kim", "Cho", "kim@gmail.com", "123456789"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEditText = findViewById(R.id.email)
        passwordEditText = findViewById(R.id.password)

        signInBtn = findViewById(R.id.signInBtn)
        signInBtn.setOnClickListener { submitSignIn() }

        newAccountBtn = findViewById(R.id.newAccountBtn)
        newAccountBtn.setOnClickListener { submitCreateNewAccount() }

    }

    fun submitSignIn(){

        var res = true
        val email = emailEditText?.text ?: ""
        val password = passwordEditText?.text ?: ""

        if (res) {
            val intent = Intent(this, ShoppingCategoryActivity::class.java)
            intent.putExtra("email", email)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Invalid login account", Toast.LENGTH_LONG).show()
        }
    }

    fun submitCreateNewAccount(){
        val intent = Intent(this, SignupActivity::class.java)
        startActivity(intent)
    }
}
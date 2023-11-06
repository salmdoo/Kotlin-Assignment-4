package com.example.walmartlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast

class ShoppingCategoryActivity : AppCompatActivity() {
    lateinit var linearLayoutF1: LinearLayout
    lateinit var linearLayoutF2: LinearLayout
    lateinit var linearLayoutF3: LinearLayout
    lateinit var linearLayoutF4: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)

        linearLayoutF1 = findViewById(R.id.f1)
        linearLayoutF1.setOnClickListener { chooseItem() }
        linearLayoutF2 = findViewById(R.id.f2)
        linearLayoutF2.setOnClickListener { chooseItem() }
        linearLayoutF3 = findViewById(R.id.f3)
        linearLayoutF3.setOnClickListener { chooseItem() }
        linearLayoutF4 = findViewById(R.id.f4)
        linearLayoutF4.setOnClickListener { chooseItem() }
    }

    fun chooseItem() {
        Toast.makeText(this, "You have chosen the food category if shopping", Toast.LENGTH_LONG).show()
    }
}
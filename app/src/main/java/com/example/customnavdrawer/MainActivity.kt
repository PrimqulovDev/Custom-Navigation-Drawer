package com.example.customnavdrawer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btNavDrawer.setOnClickListener {
            drawerLayout.apply {
                if (isDrawerOpen(leftDrawerMenu)) {
                    closeDrawer(leftDrawerMenu)
                } else openDrawer(leftDrawerMenu)
            }
        }

    }
}

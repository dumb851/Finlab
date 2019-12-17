package com.example.finlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(main_toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //invalidateOptionsMenu() trigger onCreateOptionsMenu

        menuInflater.inflate(R.menu.menu_main_toolbar, menu)

        menu?.findItem(R.id.action_add)?.isVisible = true

        return super.onCreateOptionsMenu(menu)
    }
}